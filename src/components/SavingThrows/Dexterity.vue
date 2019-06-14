<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Dexterity">
    <label for="Dexterity">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvDexterity",
  computed: {
    ...mapGetters(["GetClassSavingThrowDexterity"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowDexterity === "boolean")
          return this.GetClassSavingThrowDexterity;
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
