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
  BaseAC: Int32Array
};

const getters = {
  GetBaseAC: state => state.BaseAC
};

const actions = {};

const mutations = {
  InitBaseAC(state, BaseACPerArmorType) {
    state.BaseACPerArmorType = BaseACPerArmorType;
    state.BaseAC = state.BaseACPerArmorType[0]["None"][1]["BaseAC"];
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
      state.BaseAC += state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"];
    } else if (
      state.BaseACPerArmorType[0][ArmorName][2]["DexModifier"] &&
      Info[1] <= state.BaseACPerArmorType[0][ArmorName][3]["maxDexModifier"]
    ) {
      state.BaseAC += Info[1];
    }
    // name = 0 , 1 = BaseAC, 2 = DexModifier, 3 = maxDexModifier
  }
  //ArmorType = 0, DexModifier = 1
};

export default {
  state,
  getters,
  actions,
  mutations
};
