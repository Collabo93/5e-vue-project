<template>
  <div>
    <b-form-select v-model="SelectedAlignmentName" :options="AlignmentName"></b-form-select>
  </div>
</template>

<script>
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
  watch: {
    SelectedAlignmentName: function() {
      this.$emit("inputData", this.SelectedAlignmentName);
    }
  }
};
</script>

<style>
</style>