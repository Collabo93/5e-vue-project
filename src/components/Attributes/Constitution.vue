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
      CurrentBaseAttribute: 0,
      SkillsArrayList: []
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAttributePointsAvailableMinus"]),
    ...mapGetters(["GetAttributePointsAvailablePlus"]),
    ...mapGetters(["GetRaceAbilityBonusConstitution"]),

    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),

    ...mapGetters(["GetClassSavingThrowConstitution"]),
    ...mapGetters(["GetClassSavingThrowDexterity"]),
    ...mapGetters(["GetClassSavingThrowConstitution"]),
    ...mapGetters(["GetClassSavingThrowIntelligence"]),
    ...mapGetters(["GetClassSavingThrowWisdom"]),
    ...mapGetters(["GetClassSavingThrowCharisma"]),

    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAbilityModifierDexterity"]),
    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAbilityModifierIntelligence"]),
    ...mapGetters(["GetAbilityModifierWisdom"]),
    ...mapGetters(["GetAbilityModifierCharisma"]),

    ...mapGetters(["GetAvailableAttributePoints"]),
    ...mapGetters(["GetClassAbilityScoreBonusSpendOnAbilityScore"])
  },
  methods: {
    ...mapMutations(["SetAbilityModifier"]),
    ...mapMutations(["SetAttributeConstitution"]),
    ...mapMutations(["SetAvailableAttributePointsMinus"]),
    ...mapMutations(["SetAvailableAttributePointsPlus"]),
    ...mapActions(["SetAllSkillPoints"]),
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnAbilityScore"]),
    ...mapMutations(["SetAbilityScoreSpend"]),

    StartAttributeOperation(Increment, AttributeCost) {
      if (Increment === true) {
        this.CurrentBaseAttribute += 1;
        this.SetAvailableAttributePointsMinus(AttributeCost);
      } else if (Increment === false) {
        this.CurrentBaseAttribute -= 1;
        this.SetAvailableAttributePointsPlus(AttributeCost);
      }
      this.SetAttributeConstitution(this.CurrentBaseAttribute);
      this.SetAbilityModifier(["Constitution", this.GetRaceAbilityBonusConstitution]);

      let ArrayList1 = [
        [this.GetClassProficiencyBonusPerLevel],
        [
          this.GetClassSavingThrowConstitution,
          this.GetClassSavingThrowDexterity,
          this.GetClassSavingThrowConstitution,
          this.GetClassSavingThrowIntelligence,
          this.GetClassSavingThrowWisdom,
          this.GetClassSavingThrowCharisma
        ],
        [
          this.GetAbilityModifierConstitution,
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
  },
  created: function() {
    this.CurrentBaseAttribute = this.GetCharacterSheet.Attributes[0].Constitution;
    this.SetAbilityModifier(["Constitution", 0]);
  },
  watch: {
    IncrementPressed: function() {
      if (
        this.GetAvailableAttributePoints == 0 &&
        this.IncrementPressed &&
        this.GetClassAbilityScoreBonusSpendOnAbilityScore > 0
      ) {
        this.CurrentBaseAttribute += 1;
        this.SetClassAbilityScoreBonusSpendOnAbilityScore(
          this.GetClassAbilityScoreBonusSpendOnAbilityScore - 1
        );
        this.SetAbilityScoreSpend(this.GetCharacterSheet.AbilityScoreSpend + 1);
        this.StartAttributeOperation(null, null);
      } else if (
        this.CurrentBaseAttribute < 15 &&
        this.IncrementPressed &&
        this.GetAvailableAttributePoints > 0
      ) {
        let cache = this.GetAttributePointsAvailableMinus(
          this.CurrentBaseAttribute + 1
        );
        if (!isNaN(cache)) {
          this.StartAttributeOperation(true, cache);
        }
      }
      this.IncrementPressed = false;
    },
    DecrementPressed: function() {
      if (
        this.GetAvailableAttributePoints == 0 &&
        this.DecrementPressed &&
        this.GetCharacterSheet.AbilityScoreSpend > 0 &&
        this.CurrentBaseAttribute > 8
      ) {
        this.CurrentBaseAttribute -= 1;
        this.SetClassAbilityScoreBonusSpendOnAbilityScore(
          this.GetClassAbilityScoreBonusSpendOnAbilityScore + 1
        );
        this.SetAbilityScoreSpend(this.GetCharacterSheet.AbilityScoreSpend - 1);
        this.StartAttributeOperation(null, null);
      } else if (this.CurrentBaseAttribute > 8 && this.DecrementPressed) {
        let cache = this.GetAttributePointsAvailablePlus(
          this.CurrentBaseAttribute - 1
        );
        if (!isNaN(cache)) {
          this.StartAttributeOperation(false, cache);
        }
      }
      this.DecrementPressed = false;
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


