<template>
  <transition name="InfoBoxes">
    <div class="ProficiencyBonus CharacterDetail" v-if="GetHitPoints">
      <div class="InformationDiv">
        <div class="Information">
          <p class="InformationValue">{{GetHitPoints}}</p>
          <p class="InformationTitle">Hit Points</p>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvHitPoints",
  computed: {
    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetHitPoints"])
  },
  methods: {
    ...mapMutations(["SetHitPoints"])
  },
  created: function() {
    this.SetHitPoints([8, this.GetCharacterSheet.Level]);
  }
};
</script>