const state = {
  CharacterSheet: [
    {
      Class: [{ name: "" }, { url: "" }],
      Level: "",
      Race: [{ name: "String" }, { url: String }],
      PlayerName: "",
      Background: "",
      Alignment: ""
    }
  ]
};

const getters = {
  GetCharacterSheet: state => state.CharacterSheet
};

const actions = {};

const mutations = {
  SetClass: (state, Class) => (state.CharacterSheet.Class = Class),
  SetLevel: (state, Level) => (state.CharacterSheet.Level = Level),
  SetRace: (state, Race) => (state.CharacterSheet.Race = Race),
  SetAlignment: (state, Alignment) => (state.CharacterSheet.Alignment = Alignment)

};

export default {
  state,
  getters,
  actions,
  mutations
};
