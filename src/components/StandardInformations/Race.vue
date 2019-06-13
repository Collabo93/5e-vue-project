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
    ...mapGetters(["GetRaceAbilityBonusCharisma"])
  },
  created: function() {
    this.fetchDataRace();
  },
  methods: {
    ...mapActions(["fetchDataRace"]),
    ...mapActions(["SetDataRace"]),
    ...mapActions(["SetRaceInfo"]),
    ...mapMutations(["SetRace"]),

    ...mapMutations(["SetAbilityModifier"])
  },
  watch: {
    SelectedRaceName: function() {
      this.SetDataRace(this.SelectedRaceName);
      this.SetRace(this.GetRace);
      this.SetRaceInfo();
      //need to wait for SetRaceInfo to update the race bonuses
      this.SetAbilityModifier(["Strength", this.GetRaceAbilityBonusStrength]);
      this.SetAbilityModifier(["Dexterity", this.GetRaceAbilityBonusDexterity]);
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

    }
  }
};
</script>

<style>
</style>