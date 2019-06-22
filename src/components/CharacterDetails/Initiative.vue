<template>
  <div class="ProficiencyBonus CharacterDetail">
    <div class="InformationDiv">
      <div class="Information">
        <p class="InformationValue">{{GetAbilityModifierDexterity}}</p>
        <p class="InformationTitle">Initiative</p>
      </div>
    </div>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvInitiative",
  computed: {
    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),
    ...mapGetters(["GetAbilityModifierDexterity"]),
  }
};
</script>