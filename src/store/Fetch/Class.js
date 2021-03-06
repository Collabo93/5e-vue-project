import { RepositoryFactory } from "../../services/RepositoryFactoryDnDAPI";
const ClassRepository = RepositoryFactory.get("classes");
const GetDataFromURL = RepositoryFactory.get("createdURL");
const ClassLevelInfoRepository = RepositoryFactory.get("LevelInfo");

const state = {
  //All Classes
  dataClass: [],
  ClassNames: [],
  Class: [{ name: String }, { url: String }],

  //Class in detail
  dataClassInfo: [],
  ClassSavingThrowStrength: Int32Array,
  ClassSavingThrowDexterity: Int32Array,
  ClassSavingThrowConstitution: Int32Array,
  ClassSavingThrowIntelligence: Int32Array,
  ClassSavingThrowWisdom: Int32Array,
  ClassSavingThrowCharisma: Int32Array,
  HitDie:Int32Array,

  //Class in detail per Level
  dataClassDetailPerLevel: [],
  ClassAbilityScoreBonusesPerLevel: Int32Array,
  ClassProficiencyBonusPerLevel: Int32Array,
  ClassAbilityScoreBonusSpendOnAbilityScore: Int32Array,
  ClassAbilityScoreBonusSpendOnFeat: Int32Array,

  //ClassProficiencies
  ClassProficiencies: [],
  ClassProficiencieSkillChoices: [],
  ClassProficiencieSkillChoicesNumber: []
};

const getters = {
  GetDataClass: state => state.dataClass,
  GetClassNames: state => state.ClassNames,
  GetClass: state => state.Class,

  GetClassSavingThrowStrength: state => state.ClassSavingThrowStrength,
  GetClassSavingThrowDexterity: state => state.ClassSavingThrowDexterity,
  GetClassSavingThrowConstitution: state => state.ClassSavingThrowConstitution,
  GetClassSavingThrowIntelligence: state => state.ClassSavingThrowIntelligence,
  GetClassSavingThrowWisdom: state => state.ClassSavingThrowWisdom,
  GetClassSavingThrowCharisma: state => state.ClassSavingThrowCharisma,
  GetHitDie: state => state.HitDie,

  GetClassAbilityScoreBonusesPerLevel: state =>
    state.ClassAbilityScoreBonusesPerLevel,
  GetClassProficiencyBonusPerLevel: state =>
    state.ClassProficiencyBonusPerLevel,
  GetClassAbilityScoreBonusSpendOnAbilityScore: state =>
    state.ClassAbilityScoreBonusSpendOnAbilityScore,
  GetClassAbilityScoreBonusSpendOnFeat: state =>
    state.ClassAbilityScoreBonusSpendOnFeat,

  GetClassProficiencies: state => state.ClassProficiencies,
  GetClassProficiencieSkillChoices: state => state.ClassProficiencieSkillChoices,
  GetClassProficiencieSkillChoicesNumber: state => state.ClassProficiencieSkillChoicesNumber
};

const actions = {
  async fetchDataClass({ commit }) {
    const { data } = await ClassRepository.get();
    commit("SetDataClass", data);
    commit("SetClassNames");
  },
  SetDataClass({ commit }, SelectedClass) {
    commit("SetClassURL", SelectedClass);
  },

  async FetchClassInfo({ commit }) {
    const { data } = await GetDataFromURL.get(state.Class["url"]);
    commit("SetClassInfo", data);
    commit("SetClassProficiencies");
  },

  async FetchClassDetailPerLevel({ commit }, ClassLevel) {
    if (
      ClassLevel[0] != null &&
      typeof ClassLevel[0] != "undefined" &&
      ClassLevel[1] != null &&
      typeof ClassLevel[1] != "undefined"
    ) {
      const { data } = await ClassLevelInfoRepository.get(
        ClassLevel[0].toLowerCase(),
        ClassLevel[1]
      );
      commit("SetClassInfoPerLevel", data);
    }
  }
};

const mutations = {
  InitDataClass(state, BaseClassInfo) {
    state.GetClassSavingThrowStrength = BaseClassInfo[0].Strength;
    state.GetClassSavingThrowDexterity = BaseClassInfo[0].Dexterity;
    state.GetClassSavingThrowConstitution = BaseClassInfo[0].Constitution;
    state.GetClassSavingThrowIntelligence = BaseClassInfo[0].Intelligence;
    state.GetClassSavingThrowWisdom = BaseClassInfo[0].Wisdom;
    state.GetClassSavingThrowCharisma = BaseClassInfo[0].Charisma;
    state.ClassAbilityScoreBonusesPerLevel = "";
    state.ClassAbilityScoreBonusSpendOnAbilityScore = 0;
    state.ClassAbilityScoreBonusSpendOnFeat = 0;
    state.ClassAbilityScoreBonusesPerLevel = 0;
    state.ClassProficiencyBonusPerLevel = 0;
  },
  SetDataClass: (state, dataClass) => (state.dataClass = dataClass),
  SetClassNames() {
    state.ClassNames = [];
    for (var index = 0; index < state.dataClass["count"]; index++) {
      state.ClassNames.push(state.dataClass["results"][index]["name"]);
    }
  },
  SetClassURL(state, SelectedClass) {
    for (let index = 0; index < state.dataClass["count"]; index++) {
      if (SelectedClass == state.ClassNames[index]) {
        state.Class["url"] = state.dataClass["results"][index]["url"];
        break;
      }
    }
    state.Class["name"] = SelectedClass;
  },

  SetClassInfo(state, SelectedClass) {
    state.dataClassInfo = SelectedClass;
    state.ClassSavingThrowStrength = false;
    state.ClassSavingThrowDexterity = false;
    state.ClassSavingThrowConstitution = false;
    state.ClassSavingThrowIntelligence = false;
    state.ClassSavingThrowWisdom = false;
    state.ClassSavingThrowCharisma = false;
    let i;
    for (i = 0; i < state.dataClassInfo.saving_throws.length; i++) {
      if (state.dataClassInfo.saving_throws[i]["name"] == "STR") {
        state.ClassSavingThrowStrength = true;
      }
      if (state.dataClassInfo.saving_throws[i]["name"] == "DEX") {
        state.ClassSavingThrowDexterity = true;
      }
      if (state.dataClassInfo.saving_throws[i]["name"] == "CON") {
        state.ClassSavingThrowConstitution = true;
      }
      if (state.dataClassInfo.saving_throws[i]["name"] == "INT") {
        state.ClassSavingThrowIntelligence = true;
      }
      if (state.dataClassInfo.saving_throws[i]["name"] == "WIS") {
        state.ClassSavingThrowWisdom = true;
      }
      if (state.dataClassInfo.saving_throws[i]["name"] == "CHA") {
        state.ClassSavingThrowCharisma = true;
      }
    }
    state.HitDie = state.dataClassInfo["hit_die"];
  },

  SetClassInfoPerLevel(state, SelectedClass) {
    state.dataClassDetailPerLevel = SelectedClass;
    state.ClassAbilityScoreBonusesPerLevel =
      state.dataClassDetailPerLevel.ability_score_bonuses;
    state.ClassProficiencyBonusPerLevel =
      state.dataClassDetailPerLevel.prof_bonus;
  },
  SetClassAbilityScoreBonusSpendOnAbilityScore: (state, AbilityScore) =>
    (state.ClassAbilityScoreBonusSpendOnAbilityScore = AbilityScore),
  SetClassAbilityScoreBonusSpendOnFeat: (state, Feat) =>
    (state.ClassAbilityScoreBonusSpendOnFeat = Feat),
  SetClassAbilityScoreBonusesPerLevel: (
    state,
    ClassAbilityScoreBonusesPerLevel
  ) =>
    (state.ClassAbilityScoreBonusesPerLevel = ClassAbilityScoreBonusesPerLevel),

  SetClassProficiencies() {
    state.ClassProficiencies = [];
    state.ClassProficiencieSkillChoices = [];
    state.ClassProficiencieSkillChoicesNumber = [];
    state.dataClassInfo["proficiencies"].forEach(element => {
      state.ClassProficiencies.push([element["name"], element["url"]]);
    });
    let cache = [];
    state.dataClassInfo["proficiency_choices"].forEach(element => {
      cache = [];
      element["from"].forEach(element => {
        cache.push([element["name"], element["url"]]);
      });
      state.ClassProficiencieSkillChoices.push(cache);
      state.ClassProficiencieSkillChoicesNumber.push(element["choose"]);
    });
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
