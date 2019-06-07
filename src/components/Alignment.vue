<template>
  <div>
    <b-form-select v-model="SelectedAlignmentName" :options="AlignmentName"></b-form-select>
  </div>
</template>

<script>
import { mapMutations } from "vuex";

export default {
  name: "RwvAlignment",
  data() {
    return {
      AlignmentName: [
        "Lawful good",
        "Neutral good",
        "Chaotic good",
        "Lawful good",
        "True neutral",
        "Chaotic good",
        "Lawful evil",
        "Neutral evil",
        "Chaotic evil",
        "Unaligned"
      ],
      SelectedAlignmentName: ""
    };
  },
  methods:{
    ...mapMutations(["SetAlignment"])
  },
  watch: {
    SelectedAlignmentName: function() {
      this.SetAlignment(this.SelectedAlignmentName);
    }
  }
};
</script>

<style>
</style>