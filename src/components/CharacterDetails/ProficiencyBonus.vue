<template>
  <transition name="InfoBoxes">
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
      <div class="InformationDiv">
        <div class="Information">
          <p class="InformationValue">{{GetClassProficiencyBonusPerLevel}}</p>
          <p class="InformationTitle">Proficiency Bonus</p>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvProficiencyBonus",
  computed: {
    ...mapGetters(["GetClassProficiencyBonusPerLevel"])
  }
};
</script>
