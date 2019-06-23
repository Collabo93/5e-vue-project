<template>
  <transition name="InfoBoxes">
    <div class="ProficiencyBonus CharacterDetail" v-if="GetRaceSpeed">
      <div class="InformationDiv">
        <div class="Information">
          <p class="InformationValue">{{GetRaceSpeed}}</p>
          <p class="InformationTitle">Speed</p>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvSpeed",
  computed: {
    ...mapGetters(["GetRaceSpeed"])
  }
};
</script>