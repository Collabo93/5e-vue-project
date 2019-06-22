<template>
  <b-container class="CharacterDetailFrame padding">
    <hr>
    <b-row>
      <b-col md="6">
        <RwvProficiencyBonus/>
      </b-col>
      <b-col md="3">
        <RwvSpeed/>
      </b-col>
      <b-col md="3">
        <RwvInitiative/>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6"></b-col>
      <b-col md="3">
        <RwvArmorClass/>
      </b-col>
      <b-col md="3">
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

</style>
