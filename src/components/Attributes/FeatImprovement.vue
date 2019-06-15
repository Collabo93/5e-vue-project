<template>
  <div class="AbilityScoreImprovement">
    <div class="InformationButton">
      <b-button :pressed.sync="IncrementPressed" variant="success" class="increment">+</b-button>
      <br>
      <b-button :pressed.sync="DecrementPressed" variant="danger" class="increment">-</b-button>
    </div>
    <div class="InformationDiv">
      <div class="AvailableAttributePoints Information">
        <p class="InformationValue">{{GetClassAbilityScoreBonusSpendOnFeat}}</p>
        <p class="InformationTitle">Feat</p>
      </div>
    </div>
  </div>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvFeatImprovement",
  data() {
    return {
      IncrementPressed: false,
      DecrementPressed: false
    };
  },
  computed: {
    ...mapGetters(["GetClassAbilityScoreBonusSpendOnFeat"]),
    ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"])
  },
  methods: {
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnFeat"]),
    ...mapMutations(["SetClassAbilityScoreBonusesPerLevel"])
  },
  watch: {
    IncrementPressed: function() {
      if (this.GetClassAbilityScoreBonusesPerLevel > 0 && this.IncrementPressed ) {
        this.SetClassAbilityScoreBonusesPerLevel(
          this.GetClassAbilityScoreBonusesPerLevel - 1
        );
        this.SetClassAbilityScoreBonusSpendOnFeat(
          this.GetClassAbilityScoreBonusSpendOnFeat + 1
        );
        this.IncrementPressed = false;
      }
    },
    DecrementPressed: function() {
      if (this.GetClassAbilityScoreBonusSpendOnFeat > 0 && this.DecrementPressed ) {
        this.SetClassAbilityScoreBonusesPerLevel(
          this.GetClassAbilityScoreBonusesPerLevel + 1
        );
        this.SetClassAbilityScoreBonusSpendOnFeat(
          this.GetClassAbilityScoreBonusSpendOnFeat - 1
        );
        this.DecrementPressed = false;
      }
    }
  }
};
</script>
