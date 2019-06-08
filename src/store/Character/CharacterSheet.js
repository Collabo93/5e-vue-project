const state = {
  CharacterSheet: [
    {
      CharacterName: "",
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
  SetCharacterName: (state, CharacterName) =>
    (state.CharacterSheet.CharacterName = CharacterName),
  SetClass: (state, Class) => (state.CharacterSheet.Class = Class),
  SetLevel: (state, Level) => (state.CharacterSheet.Level = Level),
  SetRace: (state, Race) => (state.CharacterSheet.Race = Race),
  SetPlayerName: (state, PlayerName) => (state.CharacterSheet.PlayerName = PlayerName),
  SetAlignment: (state, Alignment) =>
    (state.CharacterSheet.Alignment = Alignment)
};

export default {
  state,
  getters,
  actions,
  mutations
};
