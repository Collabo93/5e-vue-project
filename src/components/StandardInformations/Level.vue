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
    ...mapGetters(["GetHitDie"]),

    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),
    ...mapGetters(["GetBackgroundProficiencies"]),

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
    ...mapActions(["FetchClassDetailPerLevel"]),
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnFeat"]),
    ...mapMutations(["SetClassAbilityScoreBonusSpendOnAbilityScore"]),
    SetLevelRange() {
      for (let index = 1; index <= this.LevelMax; index++) {
        this.LevelRange.push(index);
      }
    },
    ...mapMutations(["SetLevel"]),
    ...mapMutations(["SetHitPoints"]),
    ...mapActions(["SetAllSkillPoints"])
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
  }
};
</script>