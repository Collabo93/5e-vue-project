<template>
  <div>
    <b-form-select v-model="SelectedRaceName" :options="GetRaceNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvRace",
  data() {
    return {
      SelectedRaceName: ""
    };
  },
  computed: {
    ...mapGetters(["GetRaceNames"]),
    ...mapGetters(["GetRace"]),
    ...mapGetters(["GetCharacterSheet"]),

    ...mapGetters(["GetRaceAbilityBonusStrength"]),
    ...mapGetters(["GetRaceAbilityBonusDexterity"]),
    ...mapGetters(["GetRaceAbilityBonusConstitution"]),
    ...mapGetters(["GetRaceAbilityBonusIntelligence"]),
    ...mapGetters(["GetRaceAbilityBonusWisdom"]),
    ...mapGetters(["GetRaceAbilityBonusCharisma"]),

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
    this.fetchDataRace();
  },
  methods: {
    ...mapActions(["fetchDataRace"]),
    ...mapActions(["SetDataRace"]),
    ...mapActions(["SetRaceInfo"]),
    ...mapMutations(["SetRace"]),

    ...mapMutations(["SetAbilityModifier"]),
    ...mapMutations(["SetBaseAC"]),
    ...mapActions(["SetAllSkillPoints"])
  },
  watch: {
    SelectedRaceName: function() {
      this.SetDataRace(this.SelectedRaceName);
      this.SetRace(this.GetRace);
      this.SetRaceInfo().then(result => {
        this.SetAbilityModifier(["Strength", this.GetRaceAbilityBonusStrength]);
        this.SetAbilityModifier([
          "Dexterity",
          this.GetRaceAbilityBonusDexterity
        ]);
        this.SetAbilityModifier([
          "Constitution",
          this.GetRaceAbilityBonusConstitution
        ]);
        this.SetAbilityModifier([
          "Intelligence",
          this.GetRaceAbilityBonusIntelligence
        ]);
        this.SetAbilityModifier(["Wisdom", this.GetRaceAbilityBonusWisdom]);
        this.SetAbilityModifier(["Charisma", this.GetRaceAbilityBonusCharisma]);
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

        return result;
      });
      //need to wait for SetRaceInfo to update the race bonuses
    }
  }
};
</script>

<style>
</style>