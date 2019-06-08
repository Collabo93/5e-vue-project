<template>
  <div>
    <b-form-select v-model="SelectedBackgroundName" :options="GetBackgroundNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations} from "vuex";

export default {
  name: "RwvBackground",
  data() {
    return {
      SelectedBackgroundName: ""
    };
  },
  computed: mapGetters([
    "GetBackgroundNames","GetBackground","GetCharacterSheet"
  ]),
  created: function() {
    this.fetchDataBackground();
  },
  methods: {
    ...mapActions(["fetchDataBackground"]),
    ...mapActions(["SetDataBackground"]),
    ...mapMutations(["SetBackground"])
  },
  watch: {
    SelectedBackgroundName: function() {
      this.SetDataBackground(this.SelectedBackgroundName);
      this.SetBackground(this.GetBackground);
    }
  }
};
</script>

<style>
</style>