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
  SkillPointsSurvival: Int32Array,
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
  GetSkillPointsSurvival: state => state.SkillPointsSurvival,
};

const actions = {};

const mutations = {
  InitBaseAC(state, BaseACPerArmorType) {
    state.BaseACPerArmorType = BaseACPerArmorType;
    state.BaseAC = state.BaseACPerArmorType[0]["None"][1]["BaseAC"];
  },
  InitBaseSkillPoints(state, BaseSkillPoints){
    state.SkillPointsAcrobatics = BaseSkillPoints[0].SkillPointsAcrobatics;
    state.SkillPointsAnimalHandling = BaseSkillPoints[0].SkillPointsAnimalHandling;
    state.SkillPointsArcana = BaseSkillPoints[0].SkillPointsArcana;
    state.SkillPointsAthletics = BaseSkillPoints[0].SkillPointsAthletics;
    state.SkillPointsDeception = BaseSkillPoints[0].SkillPointsDeception;
    state.SkillPointsHistory = BaseSkillPoints[0].SkillPointsHistory;
    state.SkillPointsInsight = BaseSkillPoints[0].SkillPointsInsight;
    state.SkillPointsIntimidation = BaseSkillPoints[0].SkillPointsIntimidation;
    state.SkillPointsInvestigation = BaseSkillPoints[0].SkillPointsInvestigation;
    state.SkillPointsMedicine = BaseSkillPoints[0].SkillPointsMedicine;
    state.SkillPointsNature = BaseSkillPoints[0].SkillPointsNature;
    state.SkillPointsPerception = BaseSkillPoints[0].SkillPointsPerception;
    state.SkillPointsPerformance = BaseSkillPoints[0].SkillPointsPerformance;
    state.SkillPointsPursuasion = BaseSkillPoints[0].SkillPointsPursuasion;
    state.SkillPointsReligion = BaseSkillPoints[0].SkillPointsReligion;
    state.SkillPointsSleightofHand = BaseSkillPoints[0].SkillPointsSleightofHand;
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
    state.HitPoints = (Info[0]*0.75) * Info[1];
  }
  // HitDice = 0, Level =1
};

export default {
  state,
  getters,
  actions,
  mutations
};
