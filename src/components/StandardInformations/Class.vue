<template>
  <div>
    <b-form-select v-model="SelectedClassName" :options="GetClassNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvClass",
  data() {
    return {
      SelectedClassName: ""
    };
  },
  computed: {
    ...mapGetters(["GetClassNames"]),
    ...mapGetters(["GetClass"]),
    ...mapGetters(["GetCharacterSheet"]),

    ...mapGetters(["GetAbilityModifierDexterity"]),
    ...mapGetters(["GetHitDie"]),

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
    this.fetchDataClass();
  },
  methods: {
    ...mapActions(["fetchDataClass"]),
    ...mapActions(["SetDataClass"]),
    ...mapActions(["FetchClassInfo"]),
    ...mapActions(["FetchClassDetailPerLevel"]),
    ...mapMutations(["SetClass"]),
    ...mapMutations(["SetChoosenOptions"]),
    ...mapMutations(["SetBaseAC"]),
    ...mapMutations(["SetHitPoints"]),
    ...mapActions(["SetAllSkillPoints"]),
    ...mapMutations(["SaveChoosenProficiencies"])
  },
  watch: {
    SelectedClassName: function() {
      this.SetDataClass(this.SelectedClassName);
      this.SetClass(this.GetClass);
      this.FetchClassInfo().then(result => {
        let levelCache = 1;

        if (this.GetCharacterSheet.Level !== "") {
          levelCache = this.GetCharacterSheet.Level;
          this.FetchClassDetailPerLevel([
            this.GetCharacterSheet.Class["name"],
            levelCache
          ]).then(result => {
            this.SetBaseAC([
              this.GetCharacterSheet.ArmorType,
              this.GetAbilityModifierDexterity
            ]);
            this.SetHitPoints([this.GetHitDie, this.GetCharacterSheet.Level]);
            this.SaveChoosenProficiencies([]);
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
        return result;
      });
    }
  }
};
</script>

<style>
</style>