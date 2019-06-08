<template>
  <div>
    <b-form-select v-model="SelectedRaceName" :options="GetRaceNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations} from "vuex";

export default {
  name: "RwvRace",
  data() {
    return {
      SelectedRaceName: ""
    };
  },
  computed: mapGetters([
    "GetRaceNames","GetRace","GetCharacterSheet"
  ]),
  created: function() {
    this.fetchDataRace();
  },
  methods: {
    ...mapActions(["fetchDataRace"]),
    ...mapActions(["SetDataRace"]),
    ...mapMutations(["SetRace"])
  },
  watch: {
    SelectedRaceName: function() {
      this.SetDataRace(this.SelectedRaceName);
      this.SetRace(this.GetRace);
    }
  }
};
</script>

<style>
</style>