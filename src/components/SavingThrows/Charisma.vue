<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Charisma">
    <label for="Charisma">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvCharisma",
  computed: {
    ...mapGetters(["GetClassSavingThrowCharisma"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowCharisma === "boolean")
          return this.GetClassSavingThrowCharisma;
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
