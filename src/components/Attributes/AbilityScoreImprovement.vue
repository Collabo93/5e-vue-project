<template>
  <transition>
    <div class="AbilityScoreImprovement">
      <div class="InformationButton">
        <b-button :pressed.sync="IncrementPressed" variant="success" class="increment">+</b-button>
        <br>
        <b-button :pressed.sync="DecrementPressed" variant="danger" class="increment">-</b-button>
      </div>
      <div class="InformationDiv">
        <div class="AvailableAttributePoints Information">
          <p class="InformationValue">{{GetClassAbilityScoreBonusSpendOnAbilityScore}}</p>
          <p class="InformationTitle">Ability Score</p>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvAbilityScoreImprovement",
  data() {
    return {
      IncrementPressed: false,
      DecrementPressed: false
    };
  },
  computed: {
    ...mapGetters(["GetClassAbilityScoreBonusSpendOnAbilityScore"]),
    ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"])
  },
  methods: {
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnAbilityScore"]),
    ...mapMutations(["SetClassAbilityScoreBonusesPerLevel"])
  },
  watch: {
    IncrementPressed: function() {
      if (
        this.GetClassAbilityScoreBonusesPerLevel > 0 &&
        this.IncrementPressed
      ) {
        this.SetClassAbilityScoreBonusesPerLevel(
          this.GetClassAbilityScoreBonusesPerLevel - 1
        );
        this.SetClassAbilityScoreBonusSpendOnAbilityScore(
          this.GetClassAbilityScoreBonusSpendOnAbilityScore + 2
        );
      }
      this.IncrementPressed = false;
    },
    DecrementPressed: function() {
      if (
        this.GetClassAbilityScoreBonusSpendOnAbilityScore > 0 &&
        this.DecrementPressed
      ) {
        if (this.GetClassAbilityScoreBonusSpendOnAbilityScore % 2 == 0 || this.GetClassAbilityScoreBonusSpendOnAbilityScore >= 2) {
          this.SetClassAbilityScoreBonusesPerLevel(
            this.GetClassAbilityScoreBonusesPerLevel + 1
          );
          this.SetClassAbilityScoreBonusSpendOnAbilityScore(
            this.GetClassAbilityScoreBonusSpendOnAbilityScore - 2
          );
        }
      }
      this.DecrementPressed = false;
    }
  }
};
</script>
