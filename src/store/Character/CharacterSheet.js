const state = {
  CharacterSheet: [
    {
      CharacterName: String,
      Class: [{ name: String }, { url: String }],
      Level: Int32Array,
      Race: [{ name: String }, { url: String }],
      PlayerName: String,
      Background: [{ name: String }, { url: String }],
      Alignment: String,
      Attributes: [
        {
          Strength: Int32Array,
          Dexterity: Int32Array,
          Constitution: Int32Array,
          Intelligence: Int32Array,
          Wisdom: Int32Array,
          Charisma: Int32Array
        }
      ]
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
  SetPlayerName: (state, PlayerName) =>
    (state.CharacterSheet.PlayerName = PlayerName),
  SetBackground: (state, Background) =>
    (state.CharacterSheet.Background = Background),
  SetAlignment: (state, Alignment) =>
    (state.CharacterSheet.Alignment = Alignment),
  SetAttributes: (state, Attributes) =>
    (state.CharacterSheet.Attributes = Attributes)
};

export default {
  state,
  getters,
  actions,
  mutations
};
