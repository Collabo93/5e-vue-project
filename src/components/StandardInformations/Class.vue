<template>
  <div>
    <b-form-select v-model="SelectedClassName" :options="GetClassNames"></b-form-select>
  </div>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvClass",
  data() {
    return {
      SelectedClassName: ""
    };
  },
  computed: mapGetters(["GetClassNames", "GetClass", "GetCharacterSheet"]),
  created: function() {
    this.fetchDataClass();
  },
  methods: {
    ...mapActions(["fetchDataClass"]),
    ...mapActions(["SetDataClass"]),
    ...mapMutations(["SetClass"]),
    ...mapMutations(["SetChoosenOptions"])
  },
  watch: {
    SelectedClassName: function() {
      this.SetDataClass(this.SelectedClassName);
      this.SetClass(this.GetClass);
    }
  }
};
</script>

<style>
</style>