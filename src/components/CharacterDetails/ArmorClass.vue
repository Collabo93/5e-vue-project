<template>
  <transition name="InfoBoxes">
    <div class="ProficiencyBonus CharacterDetail" v-if="GetBaseAC">
      <div class="InformationDiv">
        <div class="Information">
          <p class="InformationValue">{{GetBaseAC}}</p>
          <p class="InformationTitle">Armor Class</p>
          <b-form-select v-model="SelectedArmorClass" :options="AvailableArmorClass"></b-form-select>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvArmorClass",
  data() {
    return {
      SelectedArmorClass: "",
      AvailableArmorClass: [
        "None",
        "Leather",
        "Hide",
        "Chain",
        "Chain + Shield",
        "Mage Armor"
      ]
    };
  },
  computed: {
    ...mapGetters(["GetBaseAC"]),
    ...mapGetters(["GetAbilityModifierDexterity"])
  },
  methods: {
    ...mapMutations(["SetBaseAC"]),
    ...mapMutations(["SaveArmorType"])
  },
  created: function() {
    this.SelectedArmorClass = "None";
  },
  watch: {
    SelectedArmorClass: function() {
      this.SetBaseAC([
        this.SelectedArmorClass,
        this.GetAbilityModifierDexterity
      ]);
      this.SaveArmorType(this.SelectedArmorClass);
    }
  }
};
</script>