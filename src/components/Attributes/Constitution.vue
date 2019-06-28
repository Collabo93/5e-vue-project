<template>
  <div class="AttributeFrame Constitution">
    <div class="AtributeIncDec">
      <b-button :pressed.sync="IncrementPressed" variant="outline-success" class="increment">^</b-button>
      <b-button :pressed.sync="DecrementPressed" variant="outline-success" class="decrement">^</b-button>
    </div>

    <div class="AttributeOutput">
      <p class="AttributeTitel">Constitution</p>
      <div class="AttributeAbilityScore">
        <p>{{CurrentBaseAttribute}}&nbsp;</p>
        <p class="AttributeRaceAbilityScore">+{{GetRaceAbilityBonusConstitution}}</p>
      </div>
      <p class="AbilityModifier">{{GetAbilityModifierConstitution}}</p>
    </div>
  </div>
</template>

<script>
import { mapGetters, mapMutations, mapActions } from "vuex";

export default {
  name: "RwvConstitution",
  data() {
    return {
      IncrementPressed: false,
      DecrementPressed: false,
      CurrentBaseAttribute: 0
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAttributePointsAvailableMinus"]),
    ...mapGetters(["GetAttributePointsAvailablePlus"]),
    ...mapGetters(["GetRaceAbilityBonusConstitution"]),

    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),

    ...mapGetters(["GetClassSavingThrowStrength"]),
    ...mapGetters(["GetClassSavingThrowDexterity"]),
    ...mapGetters(["GetClassSavingThrowConstitution"]),
    ...mapGetters(["GetClassSavingThrowIntelligence"]),
    ...mapGetters(["GetClassSavingThrowWisdom"]),
    ...mapGetters(["GetClassSavingThrowCharisma"]),

    ...mapGetters(["GetAbilityModifierStrength"]),
    ...mapGetters(["GetAbilityModifierDexterity"]),
    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAbilityModifierIntelligence"]),
    ...mapGetters(["GetAbilityModifierWisdom"]),
    ...mapGetters(["GetAbilityModifierCharisma"])
  },
  methods: {
    ...mapMutations(["SetAbilityModifier"]),
    ...mapMutations(["SetAttributeConstitution"]),
    ...mapMutations(["SetAvailableAttributePointsMinus"]),
    ...mapMutations(["SetAvailableAttributePointsPlus"]),
    ...mapActions(["SetAllSkillPoints"])
  },
  created: function() {
    this.CurrentBaseAttribute = this.GetCharacterSheet.Attributes[0].Constitution;
    this.SetAbilityModifier(["Constitution", 0]);
  },
  watch: {
    IncrementPressed: function() {
      if (this.CurrentBaseAttribute < 15 && this.IncrementPressed) {
        let cache = this.GetAttributePointsAvailableMinus(
          this.CurrentBaseAttribute + 1
        );
        if (!isNaN(cache)) {
          this.CurrentBaseAttribute += 1;
          this.SetAvailableAttributePointsMinus(cache);
          this.SetAttributeConstitution(this.CurrentBaseAttribute);
          this.SetAbilityModifier([
            "Constitution",
            this.GetRaceAbilityBonusConstitution
          ]);

          let ArrayList1 = [
            [this.GetClassProficiencyBonusPerLevel],
            [
              this.GetClassSavingThrowStrength,
              this.GetClassSavingThrowDexterity,
              this.GetClassSavingThrowConstitution,
              this.GetClassSavingThrowIntelligence,
              this.GetClassSavingThrowWisdom,
              this.GetClassSavingThrowCharisma
            ],
            [
              this.GetAbilityModifierStrength,
              this.GetAbilityModifierDexterity,
              this.GetAbilityModifierConstitution,
              this.GetAbilityModifierIntelligence,
              this.GetAbilityModifierWisdom,
              this.GetAbilityModifierCharisma
            ]
          ];
          let ArrayList2 = [
            [this.GetClassProficiencyBonusPerLevel],
            this.Selected,
            [this.GetBackgroundProficiencies]
          ];
          this.SetAllSkillPoints([ArrayList1, ArrayList2]);
        }
      }
      this.IncrementPressed = false;
    },
    DecrementPressed: function() {
      if (this.CurrentBaseAttribute > 8 && this.DecrementPressed) {
        let cache = this.GetAttributePointsAvailablePlus(
          this.CurrentBaseAttribute - 1
        );
        if (!isNaN(cache)) {
          this.CurrentBaseAttribute -= 1;
          this.SetAvailableAttributePointsPlus(cache);
          this.SetAttributeConstitution(this.CurrentBaseAttribute);
          this.SetAbilityModifier([
            "Constitution",
            this.GetRaceAbilityBonusConstitution
          ]);

          let ArrayList1 = [
            [this.GetClassProficiencyBonusPerLevel],
            [
              this.GetClassSavingThrowStrength,
              this.GetClassSavingThrowDexterity,
              this.GetClassSavingThrowConstitution,
              this.GetClassSavingThrowIntelligence,
              this.GetClassSavingThrowWisdom,
              this.GetClassSavingThrowCharisma
            ],
            [
              this.GetAbilityModifierStrength,
              this.GetAbilityModifierDexterity,
              this.GetAbilityModifierConstitution,
              this.GetAbilityModifierIntelligence,
              this.GetAbilityModifierWisdom,
              this.GetAbilityModifierCharisma
            ]
          ];
          let ArrayList2 = [
            [this.GetClassProficiencyBonusPerLevel],
            this.GetCharacterSheet.ChoosenProficiencies,
            [this.GetBackgroundProficiencies]
          ];
          this.SetAllSkillPoints([ArrayList1, ArrayList2]);
        }
        this.DecrementPressed = false;
      }
    }
  }
};
</script>

<style>
.Constitution .AttributeOutput {
  background-color: rgba(0, 128, 0, 0.5);
}
.Constitution .AtributeIncDec button:hover {
  background-color: rgba(0, 128, 0, 0.5);
}
</style>


