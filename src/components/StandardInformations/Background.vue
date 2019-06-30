<template>
  <div>
    <b-form-select v-model="SelectedBackgroundName" :options="GetBackgroundNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvBackground",
  data() {
    return {
      SelectedBackgroundName: ""
    };
  },
  computed: {
    ...mapGetters(["GetBackgroundNames"]),
    ...mapGetters(["GetBackground"]),
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetBackgroundProficiencies"]),

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
  created: function() {
    this.fetchDataBackground();
  },
  methods: {
    ...mapActions(["fetchDataBackground"]),
    ...mapActions(["SetDataBackground"]),
    ...mapActions(["FetchBackgroundInfo"]),
    ...mapMutations(["SetBackground"]),
    ...mapActions(["SetAllSkillPoints"])
  },
  watch: {
    SelectedBackgroundName: function() {
      this.SetDataBackground(this.SelectedBackgroundName);
      this.SetBackground(this.GetBackground);
      this.FetchBackgroundInfo().then(result => {
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

        return result;
      });
    }
  }
};
</script>

<style>
</style>