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
      ],
      ArmorType: String
    }
  ],
  BaseAttributePoints: 27,
  AvailableAttributePoints: Int32Array,
  AbilityModifierStrength: Int32Array,
  AbilityModifierDexterity: Int32Array,
  AbilityModifierConstitution: Int32Array,
  AbilityModifierIntelligence: Int32Array,
  AbilityModifierWisdom: Int32Array,
  AbilityModifierCharisma: Int32Array,
  BaseAttributePointsCalculation: [
    {
      OnePoint: 0,
      TwoPoints: 14
    }
  ]
};

const getters = {
  //StandartInformation
  GetCharacterSheet: state => state.CharacterSheet,

  //Attributes
  GetAvailableAttributePoints: state => state.AvailableAttributePoints,
  GetAbilityModifierStrength: state => state.AbilityModifierStrength,
  GetAbilityModifierDexterity: state => state.AbilityModifierDexterity,
  GetAbilityModifierConstitution: state => state.AbilityModifierConstitution,
  GetAbilityModifierIntelligence: state => state.AbilityModifierIntelligence,
  GetAbilityModifierWisdom: state => state.AbilityModifierWisdom,
  GetAbilityModifierCharisma: state => state.AbilityModifierCharisma,
  GetAttributePointsAvailableMinus(state) {
    return CurrentBaseAttribute => {
      if (
        CurrentBaseAttribute >=
        state.BaseAttributePointsCalculation[0].TwoPoints
      ) {
        if (state.AvailableAttributePoints - 2 >= 0) {
          return 2;
        }
      } else if (
        CurrentBaseAttribute >= state.BaseAttributePointsCalculation[0].OnePoint
      ) {
        if (state.AvailableAttributePoints - 1 >= 0) {
          return 1;
        }
      }
    };
  },
  GetAttributePointsAvailablePlus(state) {
    return CurrentBaseAttribute => {
      if (
        CurrentBaseAttribute >=
        state.BaseAttributePointsCalculation[0].TwoPoints - 1
      ) {
        return 2;
      } else if (
        CurrentBaseAttribute >=
        state.BaseAttributePointsCalculation[0].OnePoint - 1
      ) {
        return 1;
      }
    };
  }
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
  SaveArmorType: (state, ArmorType) =>
    (state.CharacterSheet.ArmorType = ArmorType),

  //Attributes
  SetBaseAttributes: (state, BaseAttributes) =>
    (state.CharacterSheet.Attributes = BaseAttributes), //need to adress character loading here later
  SetBaseAttributePoints(state, BaseAttributePoints) {
    if (
      state.AvailableAttributePoints == null ||
      typeof state.AvailableAttributePoints == "function"
    ) {
      state.BaseAttributePoints = BaseAttributePoints;
      state.AvailableAttributePoints = BaseAttributePoints;
    }
  },
  SetAbilityModifier(state, Attribute) {
    if (Attribute[0] == "Strength") {
      state.AbilityModifierStrength = Math.floor(
        (state.CharacterSheet.Attributes[0].Strength + Attribute[1]) / 2 - 5
      );
    } else if (Attribute[0] == "Dexterity") {
      state.AbilityModifierDexterity = Math.floor(
        (state.CharacterSheet.Attributes[0].Dexterity + Attribute[1]) / 2 - 5
      );
    } else if (Attribute[0] == "Constitution") {
      state.AbilityModifierConstitution = Math.floor(
        (state.CharacterSheet.Attributes[0].Constitution + Attribute[1]) / 2 - 5
      );
    } else if (Attribute[0] == "Intelligence") {
      state.AbilityModifierIntelligence = Math.floor(
        (state.CharacterSheet.Attributes[0].Intelligence + Attribute[1]) / 2 - 5
      );
    } else if (Attribute[0] == "Wisdom") {
      state.AbilityModifierWisdom = Math.floor(
        (state.CharacterSheet.Attributes[0].Wisdom + Attribute[1]) / 2 - 5
      );
    } else if (Attribute[0] == "Charisma") {
      state.AbilityModifierCharisma = Math.floor(
        (state.CharacterSheet.Attributes[0].Charisma + Attribute[1]) / 2 - 5
      );
    }
  },
  SetBaseAttributePointsCalculation: (state, BaseAttributePointsCalculation) =>
    (state.BaseAttributePointsCalculation = BaseAttributePointsCalculation), //Bases values set by Attributes.vue
  SetAvailableAttributePointsMinus(state, CurrentBaseAttribute) {
    state.AvailableAttributePoints =
      state.AvailableAttributePoints - CurrentBaseAttribute;
    return true;
  },
  SetAvailableAttributePointsPlus(state, CurrentBaseAttribute) {
    state.AvailableAttributePoints =
      state.AvailableAttributePoints + CurrentBaseAttribute;
    return true;
  },
  SetAttributeStrength: (state, Strength) =>
    (state.CharacterSheet.Attributes[0].Strength = Strength),
  SetAttributeDexterity: (state, Dexterity) =>
    (state.CharacterSheet.Attributes[0].Dexterity = Dexterity),
  SetAttributeConstitution: (state, Constitution) =>
    (state.CharacterSheet.Attributes[0].Constitution = Constitution),
  SetAttributeIntelligence: (state, Intelligence) =>
    (state.CharacterSheet.Attributes[0].Intelligence = Intelligence),
  SetAttributeWisdom: (state, Wisdom) =>
    (state.CharacterSheet.Attributes[0].Wisdom = Wisdom),
  SetAttributeCharisma: (state, Charisma) =>
    (state.CharacterSheet.Attributes[0].Charisma = Charisma)
};

export default {
  state,
  getters,
  actions,
  mutations
};
