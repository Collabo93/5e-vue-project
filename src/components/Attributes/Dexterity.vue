<template>
  <div class="AttributeFrame Dexterity">
    <div class="AtributeIncDec">
      <b-button :pressed.sync="IncrementPressed" variant="outline-success" class="increment">^</b-button>
      <b-button :pressed.sync="DecrementPressed" variant="outline-success" class="decrement">^</b-button>
    </div>

    <div class="AttributeOutput">
      <p class="AttributeTitel">Dexterity</p>
      <div class="AttributeAbilityScore">
        <p>{{CurrentBaseAttribute}}&nbsp;</p>
        <p class="AttributeRaceAbilityScore">+{{GetRaceAbilityBonusDexterity}}</p>
      </div>
      <p class="AbilityModifier">{{GetAbilityModifierDexterity}}</p>
    </div>
  </div>
</template>

<script>
import { mapGetters, mapMutations, mapActions } from "vuex";

export default {
  name: "RwvDexterity",
  data() {
    return {
      IncrementPressed: false,
      DecrementPressed: false,
      CurrentBaseAttribute: 0
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetAbilityModifierDexterity"]),
    ...mapGetters(["GetAttributePointsAvailableMinus"]),
    ...mapGetters(["GetAttributePointsAvailablePlus"]),
    ...mapGetters(["GetRaceAbilityBonusDexterity"]),

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
    ...mapMutations(["SetAttributeDexterity"]),
    ...mapMutations(["SetAvailableAttributePointsMinus"]),
    ...mapMutations(["SetAvailableAttributePointsPlus"]),
    ...mapMutations(["SetBaseAC"]),
    ...mapActions(["SetAllSkillPoints"])
  },
  created: function() {
    this.CurrentBaseAttribute = this.GetCharacterSheet.Attributes[0].Dexterity;
    this.SetAbilityModifier(["Dexterity", 0]);
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
          this.SetAttributeDexterity(this.CurrentBaseAttribute);
          this.SetAbilityModifier([
            "Dexterity",
            this.GetRaceAbilityBonusDexterity
          ]);
        }
        this.SetBaseAC([
          this.GetCharacterSheet.ArmorType,
          this.GetAbilityModifierDexterity
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
          this.SetAttributeDexterity(this.CurrentBaseAttribute);
          this.SetAbilityModifier([
            "Dexterity",
            this.GetRaceAbilityBonusDexterity
          ]);
          this.SetBaseAC([
            this.GetCharacterSheet.ArmorType,
            this.GetAbilityModifierDexterity
          ]);

          let ArrayList = [
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
          this.SetSkillPoints(ArrayList);
        }
        this.DecrementPressed = false;
      }
    }
  }
};
</script>

<style>
.Dexterity .AttributeOutput {
  background-color: rgba(255, 255, 0, 0.5);
}
.Dexterity .AtributeIncDec button:hover {
  background-color: rgba(255, 255, 0, 0.5);
}
</style>

