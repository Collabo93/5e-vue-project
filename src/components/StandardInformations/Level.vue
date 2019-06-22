<template>
  <div>
    <b-form-select v-model="Level" :options="LevelRange"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvLevel",
  data() {
    return {
      Level: "",
      LevelRange: [],
      LevelMax: 20
    };
  },
  created: function() {
    this.SetLevelRange();
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetHitDie"])
  },
  methods: {
    ...mapActions(["FetchClassDetailPerLevel"]),
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnFeat"]),
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnAbilityScore"]),
    SetLevelRange() {
      for (let index = 1; index <= this.LevelMax; index++) {
        this.LevelRange.push(index);
      }
    },
    ...mapMutations(["SetLevel"]),
    ...mapMutations(["SetHitPoints"])
  },
  watch: {
    Level: function() {
      this.SetLevel(this.Level);
      this.FetchClassDetailPerLevel([
        this.GetCharacterSheet.Class["name"],
        this.GetCharacterSheet.Level
      ]);
      this.SetClassAbilityScoreBonusSpendOnFeat(0);
      this.SetClassAbilityScoreBonusSpendOnAbilityScore(0);
      this.SetHitPoints([this.GetHitDie, this.Level]);
    }
  }
};
</script>