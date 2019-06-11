const state = {
  //StandartInformation
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
  ],
  BaseAttributePoints: 27,
  AbilityModifier: Int32Array,
  ChoosenOptions: [
    {
      Class: String,
      Level: String,
      Race: String,
      Background: String
    }
  ]
};

const getters = {
  //StandartInformation
  GetCharacterSheet: state => state.CharacterSheet,

  //Attributes
  GetAbilityModifier: state => state.AbilityModifier
};

const actions = {};

const mutations = {
  //StandartInformation
  SetCharacterName: (state, CharacterName) =>
    (state.CharacterSheet.CharacterName = CharacterName),
  SetClass: (state, Class) => (state.CharacterSheet.Class = Class),
  SetLevel(state, Level) {
    state.CharacterSheet.Level = Level;
    state.AbilityModifier = Math.floor(state.CharacterSheet.Level / 2 - 5);
  },
  SetRace: (state, Race) => (state.CharacterSheet.Race = Race),
  SetPlayerName: (state, PlayerName) =>
    (state.CharacterSheet.PlayerName = PlayerName),
  SetBackground: (state, Background) =>
    (state.CharacterSheet.Background = Background),
  SetAlignment: (state, Alignment) =>
    (state.CharacterSheet.Alignment = Alignment),
  SetAttributes: (state, Attributes) =>
    (state.CharacterSheet.Attributes = Attributes),

  //Attributes
  SetBaseAttributes: (state, BaseAttributes) =>
    (state.CharacterSheet.Attributes = BaseAttributes),
  SetAbilityModifier() {
    state.AbilityModifier = Math.floor(
      state.CharacterSheet.Attributes[0].Strength / 2 - 5
    );
  },
  SetAttributeStrength: (state, Strength) =>
    (state.CharacterSheet.Attributes[0].Strength = Strength)
};

export default {
  state,
  getters,
  actions,
  mutations
};
