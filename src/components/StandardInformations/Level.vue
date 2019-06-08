<template>
  <div>
    <b-form-select v-model="Level" :options="LevelRange"></b-form-select>
  </div>
</template>

<script>
import { mapMutations } from "vuex";

export default {
  name: "RwvLevel",
  data() {
    return {
      Level: "",
      LevelRange: [],
      LevelMax: 20
    };
  },
  created: function() {
    this.SetLevelRange();
  },
  methods: {
    SetLevelRange() {
      for (let index = 1; index <= this.LevelMax; index++) {
        this.LevelRange.push(index);
      }
    },
    ...mapMutations(["SetLevel"])
  },
  watch: {
    Level: function() {
      this.SetLevel(this.Level);
    }
  }
};
</script>