const state = {
  BaseACPerArmorType: [
    {
      None: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ],
      Leather: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ],
      Hide: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ],
      Chain: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ],
      ChainShield: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ],
      MageArmor: [
        { name: String },
        { BaseAC: Int32Array },
        { DexModifier: Boolean },
        { maxDexModifier: Int32Array }
      ]
    }
  ],
  BaseAC: Int32Array,
  HitPoints: Int32Array,

  SkillPointsAcrobatics: Int32Array,
  SkillPointsAnimalHandling: Int32Array,
  SkillPointsArcana: Int32Array,
  SkillPointsAthletics: Int32Array,
  SkillPointsDeception: Int32Array,
  SkillPointsHistory: Int32Array,
  SkillPointsInsight: Int32Array,
  SkillPointsIntimidation: Int32Array,
  SkillPointsInvestigation: Int32Array,
  SkillPointsMedicine: Int32Array,
  SkillPointsNature: Int32Array,
  SkillPointsPerception: Int32Array,
  SkillPointsPerformance: Int32Array,
  SkillPointsPursuasion: Int32Array,
  SkillPointsReligion: Int32Array,
  SkillPointsSleightofHand: Int32Array,
  SkillPointsStealth: Int32Array,
  SkillPointsSurvival: Int32Array
};

const getters = {
  GetBaseAC: state => state.BaseAC,
  GetHitPoints: state => state.HitPoints,

  GetSkillPointsAcrobatics: state => state.SkillPointsAcrobatics,
  GetSkillPointsAnimalHandling: state => state.SkillPointsAnimalHandling,
  GetSkillPointsArcana: state => state.SkillPointsArcana,
  GetSkillPointsAthletics: state => state.SkillPointsAthletics,
  GetSkillPointsDeception: state => state.SkillPointsDeception,
  GetSkillPointsHistory: state => state.SkillPointsHistory,
  GetSkillPointsInsight: state => state.SkillPointsInsight,
  GetSkillPointsIntimidation: state => state.SkillPointsIntimidation,
  GetSkillPointsInvestigation: state => state.SkillPointsInvestigation,
  GetSkillPointsMedicine: state => state.SkillPointsMedicine,
  GetSkillPointsNature: state => state.SkillPointsNature,
  GetSkillPointsPerception: state => state.SkillPointsPerception,
  GetSkillPointsPerformance: state => state.SkillPointsPerformance,
  GetSkillPointsPursuasion: state => state.SkillPointsPursuasion,
  GetSkillPointsReligion: state => state.SkillPointsReligion,
  GetSkillPointsSleightofHand: state => state.SkillPointsSleightofHand,
  GetSkillPointsStealth: state => state.SkillPointsStealth,
  GetSkillPointsSurvival: state => state.SkillPointsSurvival
};

const actions = {
  SetAllSkillPoints({ commit }, AllInfos) {
    commit("SetSkillPoints", AllInfos[0]);
    commit("SetSkillPointsByProficiency", AllInfos[1]);
  }
  // 0 => ArrayList1 for SetSkillPoints
  // 1 => ArrayList2 for SetSkillPointsByProficiency
};

const mutations = {
  InitBaseAC(state, BaseACPerArmorType) {
    state.BaseACPerArmorType = BaseACPerArmorType;
    state.BaseAC = state.BaseACPerArmorType[0]["None"][1]["BaseAC"];
  },
  InitBaseSkillPoints(state, BaseSkillPoints) {
    state.SkillPointsAcrobatics = BaseSkillPoints[0].SkillPointsAcrobatics;
    state.SkillPointsAnimalHandling =
      BaseSkillPoints[0].SkillPointsAnimalHandling;
    state.SkillPointsArcana = BaseSkillPoints[0].SkillPointsArcana;
    state.SkillPointsAthletics = BaseSkillPoints[0].SkillPointsAthletics;
    state.SkillPointsDeception = BaseSkillPoints[0].SkillPointsDeception;
    state.SkillPointsHistory = BaseSkillPoints[0].SkillPointsHistory;
    state.SkillPointsInsight = BaseSkillPoints[0].SkillPointsInsight;
    state.SkillPointsIntimidation = BaseSkillPoints[0].SkillPointsIntimidation;
    state.SkillPointsInvestigation =
      BaseSkillPoints[0].SkillPointsInvestigation;
    state.SkillPointsMedicine = BaseSkillPoints[0].SkillPointsMedicine;
    state.SkillPointsNature = BaseSkillPoints[0].SkillPointsNature;
    state.SkillPointsPerception = BaseSkillPoints[0].SkillPointsPerception;
    state.SkillPointsPerformance = BaseSkillPoints[0].SkillPointsPerformance;
    state.SkillPointsPursuasion = BaseSkillPoints[0].SkillPointsPursuasion;
    state.SkillPointsReligion = BaseSkillPoints[0].SkillPointsReligion;
    state.SkillPointsSleightofHand =
      BaseSkillPoints[0].SkillPointsSleightofHand;
    state.SkillPointsStealth = BaseSkillPoints[0].SkillPointsStealth;
    state.SkillPointsSurvival = BaseSkillPoints[0].SkillPointsSurvival;
  },
  SetBaseAC(state, Info) {
    let ArmorName;
    if (Info[0] == "Chain + Shield") {
      ArmorName = "ChainShield";
    } else if (Info[0] == "Mage Armor") {
      ArmorName = "MageArmor";
    } else {
      ArmorName = Info[0];
    }
    state.BaseAC = state.BaseACPerArmorType[0][ArmorName][1]["BaseAC"];
    if (
      state.BaseACPerArmorType[0][ArmorName][2]["DexModifier"] &&
      state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"] == null
    ) {
      state.BaseAC += Info[1];
    } else if (
      state.BaseACPerArmorType[0][ArmorName][2]["DexModifier"] &&
      Info[1] > state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"]
    ) {
      state.BaseAC +=
        state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"];
    } else if (
      state.BaseACPerArmorType[0][ArmorName][2]["DexModifier"] &&
      Info[1] <= state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"]
    ) {
      state.BaseAC += Info[1];
    }
    // name = 0 , 1 = BaseAC, 2 = DexModifier, 3 = maxDexModifier
  },
  //ArmorType = 0, DexModifier = 1

  SetHitPoints(state, Info) {
    state.HitPoints = 0;
    state.HitPoints = Info[0] * 0.75 * Info[1];
  },
  // HitDice = 0, Level =1

  SetSkillPoints(state, Info) {
    if (Info[1][0] === true) {
      state.SkillPointsAthletics = Info[2][0] + Info[0][0];
    } else {
      state.SkillPointsAthletics = Info[2][0];
    }
    //Strength

    if (Info[1][1] === true) {
      state.SkillPointsAcrobatics = Info[2][1] + Info[0][0];
      state.SkillPointsSleightofHand = Info[2][1] + Info[0][0];
      state.SkillPointsStealth = Info[2][1] + Info[0][0];
    } else {
      state.SkillPointsAcrobatics = Info[2][1];
      state.SkillPointsSleightofHand = Info[2][1];
      state.SkillPointsStealth = Info[2][1];
    }
    //Dexterity

    if (Info[1][3] === true) {
      state.SkillPointsArcana = Info[2][3] + Info[0][0];
      state.SkillPointsHistory = Info[2][3] + Info[0][0];
      state.SkillPointsInvestigation = Info[2][3] + Info[0][0];
      state.SkillPointsNature = Info[2][3] + Info[0][0];
      state.SkillPointsReligion = Info[2][3] + Info[0][0];
    } else {
      state.SkillPointsArcana = Info[2][3];
      state.SkillPointsHistory = Info[2][3];
      state.SkillPointsInvestigation = Info[2][3];
      state.SkillPointsNature = Info[2][3];
      state.SkillPointsReligion = Info[2][3];
    }
    //Intelligence

    if (Info[1][4] === true) {
      state.SkillPointsAnimalHandling = Info[2][4] + Info[0][0];
      state.SkillPointsInsight = Info[2][4] + Info[0][0];
      state.SkillPointsMedicine = Info[2][4] + Info[0][0];
      state.SkillPointsPerception = Info[2][4] + Info[0][0];
      state.SkillPointsSurvival = Info[2][4] + Info[0][0];
    } else {
      state.SkillPointsAnimalHandling = Info[2][4];
      state.SkillPointsInsight = Info[2][4];
      state.SkillPointsMedicine = Info[2][4];
      state.SkillPointsPerception = Info[2][4];
      state.SkillPointsSurvival = Info[2][4];
    }
    //Wisdom

    if (Info[1][5] === true) {
      state.SkillPointsDeception = Info[2][5] + Info[0][0];
      state.SkillPointsIntimidation = Info[2][5] + Info[0][0];
      state.SkillPointsPerformance = Info[2][5] + Info[0][0];
      state.SkillPointsPursuasion = Info[2][5] + Info[0][0];
    } else {
      state.SkillPointsDeception = Info[2][5];
      state.SkillPointsIntimidation = Info[2][5];
      state.SkillPointsPerformance = Info[2][5];
      state.SkillPointsPursuasion = Info[2][5];
    }
    //Charisma
  },
  // 0,0 = Proficiency Bonus
  // 1,x = Saving Throw
  // 2,x = Ability Modifier

  SetSkillPointsByProficiency(state, Info) {
    let i = 0;
    let ChosenProficienciesCache = [];
    if (typeof Info[1] != "undefined") {
      for (i = 0; i < Info[1].length; i++) {
        if (typeof Info[1][i] != "undefined") {
          let c;
          for (c = 0; c < Info[1][i].length; c++) {
            if (Info[1][i][c].toString().includes("Skill:")) {
              ChosenProficienciesCache.push(
                Info[1][i][c].toString().replace("Skill: ", "")
              );
            }
          }
        }
      }
    }
    // Choosen Class Proficiencies trimmed and pushed in array

    if (typeof Info[2] != "undefined") {
      let c;
      for (c = 0; c < Info[2].length; c++) {
        if (typeof Info[2][c] != "undefined") {
          let newElement = true;
          ChosenProficienciesCache.forEach(element => {
            if (element === Info[2][c].toString()) {
              newElement = false;
            }
          });
          if (newElement) {
            ChosenProficienciesCache.push(Info[2][c].toString());
          }
        }
      }
    }
    //Background Proficiencies compared with current content and pushed in array

    Info[0][0] = parseInt(Info[0][0]);
    if (ChosenProficienciesCache.length > 0) {
      ChosenProficienciesCache.forEach(element => {
        if (element === "Acrobatics") {
          state.SkillPointsAcrobatics += Info[0][0];
        } else if (element === "Animal Handling") {
          state.SkillPointsAnimalHandling += Info[0][0];
        } else if (element === "Arcana") {
          state.SkillPointsArcana += Info[0][0];
        } else if (element === "Athletics") {
          state.SkillPointsAthletics += Info[0][0];
        } else if (element === "Deception") {
          state.SkillPointsDeception += Info[0][0];
        } else if (element === "History") {
          state.SkillPointsHistory += Info[0][0];
        } else if (element === "Insight") {
          state.SkillPointsInsight += Info[0][0];
        } else if (element === "Intimidation") {
          state.SkillPointsIntimidation += Info[0][0];
        } else if (element === "Investigation") {
          state.SkillPointsInvestigation += Info[0][0];
        } else if (element === "Medicine") {
          state.SkillPointsMedicine += Info[0][0];
        } else if (element === "Nature") {
          state.SkillPointsNature += Info[0][0];
        } else if (element === "Perception") {
          state.SkillPointsPerception += Info[0][0];
        } else if (element === "Performance") {
          state.SkillPointsPerformance += Info[0][0];
        } else if (element === "Persuasion") {
          state.SkillPointsPursuasion += Info[0][0];
        } else if (element === "Religion") {
          state.SkillPointsReligion += Info[0][0];
        } else if (element === "Sleight of Hand") {
          state.SkillPointsSleightofHand += Info[0][0];
        } else if (element === "Stealth") {
          state.SkillPointsStealth += Info[0][0];
        } else if (element === "Survival") {
          state.SkillPointsSurvival += Info[0][0];
        }
      });
    }
  }
  // 0,0 = Proficiency Bonus
  // 1,x = Choosen Class Proficiencies
  // 2,x = Background Proficiencies
};

export default {
  state,
  getters,
  actions,
  mutations
};
