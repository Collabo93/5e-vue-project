<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Intelligence">
    <label for="Intelligence">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvIntelligence",
  computed: {
    ...mapGetters(["GetClassSavingThrowIntelligence"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowIntelligence === "boolean")
          return this.GetClassSavingThrowIntelligence;
        else return false;
      },
      set(value) {
        this.dummy = value;
      }
    },
    test() {
      alert();
      return this.value;
    }
  }
};
</script>
