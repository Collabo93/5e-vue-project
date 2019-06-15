<template>
  <b-container>
    <b-row>
      <b-col md="2">
        <RwvProficiencyBonus/>
      </b-col>
      <b-col md="2">
        <RwvArmorClass/>
      </b-col>
      <b-col md="2">
        <RwvInitiative/>
      </b-col>
      <b-col md="2">
        <RwvSpeed/>
      </b-col>
      <b-col md="5">
        <RwvHitPoints/>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters } from "vuex";

import RwvProficiencyBonus from "./CharacterDetails/ProficiencyBonus";
import RwvArmorClass from "./CharacterDetails/ArmorClass";
import RwvInitiative from "./CharacterDetails/Initiative";
import RwvSpeed from "./CharacterDetails/Speed";
import RwvHitPoints from "./CharacterDetails/HitPoints";

export default {
  name: "RwvCharacterDetails",
  components: {
    RwvProficiencyBonus,
    RwvArmorClass,
    RwvInitiative,
    RwvSpeed,
    RwvHitPoints
  },
  computed: {
    ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"]),
    ...mapGetters(["GetClassProficiencyBonusPerLevel"])
  }
};
</script>

<style>
.CharacterDetail .CharacterDetailTitle {
  font-weight: bold;
  color: grey;
}
.CharacterDetail .CharacterDetailOutput {
  font-size: 3em;
}
.CharacterDetail .CharacterDetailOutput::after {
  background-color: #4caf50;
  height: 2px;
  width: 20px;
  content: "";
  display: block;
}
</style>
