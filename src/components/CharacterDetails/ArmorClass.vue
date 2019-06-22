<template>
  <div class="ProficiencyBonus CharacterDetail">
    <p class="CharacterDetailOutput">{{GetBaseAC}}</p>
    <p class="CharacterDetailTitle">Armor Class</p>
    <b-form-select v-model="SelectedArmorClass" :options="AvailableArmorClass"></b-form-select>
  </div>
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
    ...mapMutations(["SetBaseAC"])
  },
  created: function() {
    this.SelectedArmorClass = "None";
  },
  watch: {
    SelectedArmorClass: function() {
      this.SetBaseAC([this.SelectedArmorClass, this.GetAbilityModifierDexterity]);
    }
  }
};
</script>