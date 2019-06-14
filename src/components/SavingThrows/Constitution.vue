<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Constitution">
    <label for="Constitution">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvConstitution",
  computed: {
    ...mapGetters(["GetClassSavingThrowConstitution"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowConstitution === "boolean")
          return this.GetClassSavingThrowConstitution;
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
