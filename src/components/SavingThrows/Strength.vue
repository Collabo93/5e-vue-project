<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Strength">
    <label for="Strength">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvStrength",
  computed: {
    ...mapGetters(["GetClassSavingThrowStrength"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowStrength === "boolean")
          return this.GetClassSavingThrowStrength;
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
