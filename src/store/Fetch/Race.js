import { RepositoryFactory } from "../../services/RepositoryFactoryDnDAPI";
const RaceRepository = RepositoryFactory.get("races");
const GetDataFromURL = RepositoryFactory.get("createdURL");

const state = {
  dataRace: [],
  RaceNames: [],
  Race: [{ name: String }, { url: String }],
  RaceAbilityBonusStrength: Boolean,
  RaceAbilityBonusDexterity: Boolean,
  RaceAbilityBonusConstitution: Boolean,
  RaceAbilityBonusIntelligence: Boolean,
  RaceAbilityBonusWisdom: Boolean,
  RaceAbilityBonusCharisma: Boolean,
  RaceSpeed: Boolean
};

const getters = {
  GetDataRace: state => state.dataRace,
  GetRaceNames: state => state.RaceNames,
  GetRace: state => state.Race,
  GetRaceAbilityBonusStrength: state => state.RaceAbilityBonusStrength,
  GetRaceAbilityBonusDexterity: state => state.RaceAbilityBonusDexterity,
  GetRaceAbilityBonusConstitution: state => state.RaceAbilityBonusConstitution,
  GetRaceAbilityBonusIntelligence: state => state.RaceAbilityBonusIntelligence,
  GetRaceAbilityBonusWisdom: state => state.RaceAbilityBonusWisdom,
  GetRaceAbilityBonusCharisma: state => state.RaceAbilityBonusCharisma,
  GetRaceSpeed: state => state.RaceSpeed
};

const actions = {
  async fetchDataRace({ commit }) {
    const { data } = await RaceRepository.get();
    commit("SetDataRace", data);
    commit("SetRaceNames");
  },
  SetDataRace({ commit }, SelectedRace) {
    commit("SetRaceURL", SelectedRace);
  },
  async SetRaceInfo({ commit }) {
    const { data } = await GetDataFromURL.get(state.Race["url"]);
    commit("SetRaceInfo", data);
  }
};

const mutations = {
  InitializeDataRace(state, BaseRaceInfo) {
    state.RaceAbilityBonusStrength = BaseRaceInfo[0].Strength;
    state.RaceAbilityBonusDexterity = BaseRaceInfo[0].Dexterity;
    state.RaceAbilityBonusConstitution = BaseRaceInfo[0].Constitution;
    state.RaceAbilityBonusIntelligence = BaseRaceInfo[0].Intelligence;
    state.RaceAbilityBonusWisdom = BaseRaceInfo[0].Wisdom;
    state.RaceAbilityBonusCharisma = BaseRaceInfo[0].Charisma;
    state.RaceSpeed = BaseRaceInfo[0].Speed;
  },
  SetDataRace: (state, dataRace) => (state.dataRace = dataRace),
  SetRaceNames() {
    for (var index = 0; index < state.dataRace["count"]; index++) {
      state.RaceNames.push(state.dataRace["results"][index]["name"]);
    }
  },
  SetRaceURL(state, SelectedRace) {
    for (let index = 0; index < state.dataRace["count"]; index++) {
      if (SelectedRace == state.RaceNames[index]) {
        state.Race["url"] = state.dataRace["results"][index]["url"];
        break;
      }
    }
    state.Race["name"] = SelectedRace;
  },
  SetRaceInfo(state, dataRaceInfo) {
    state.RaceAbilityBonusStrength = dataRaceInfo.ability_bonuses[0];
    state.RaceAbilityBonusDexterity = dataRaceInfo.ability_bonuses[1];
    state.RaceAbilityBonusConstitution = dataRaceInfo.ability_bonuses[2];
    state.RaceAbilityBonusIntelligence = dataRaceInfo.ability_bonuses[3];
    state.RaceAbilityBonusWisdom = dataRaceInfo.ability_bonuses[4];
    state.RaceAbilityBonusCharisma = dataRaceInfo.ability_bonuses[5];
    state.RaceSpeed = dataRaceInfo.speed;
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
