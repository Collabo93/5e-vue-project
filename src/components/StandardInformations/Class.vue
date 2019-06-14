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
  computed: {
    ...mapGetters(["GetClassNames"]),
    ...mapGetters(["GetClass"]),
    ...mapGetters(["GetCharacterSheet"])
  },
  created: function() {
    this.fetchDataClass();
  },
  methods: {
    ...mapActions(["fetchDataClass"]),
    ...mapActions(["SetDataClass"]),
    ...mapActions(["FetchClassInfo"]),
    ...mapActions(["FetchClassDetailPerLevel"]),
    ...mapMutations(["SetClass"]),
    ...mapMutations(["SetChoosenOptions"]),
  },
  watch: {
    SelectedClassName: function() {
      this.SetDataClass(this.SelectedClassName);
      this.SetClass(this.GetClass);
      this.FetchClassInfo();
      this.FetchClassDetailPerLevel([this.GetCharacterSheet.Class["name"],this.GetCharacterSheet.Level]);
    }
  }
};
</script>

<style>
</style>