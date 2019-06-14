<template>
  <div class="SavingThrowFrame">
    <input type="radio" :checked="value" :disabled="true" id="Wisdom">
    <label for="Wisdom">
      <span class="radio"></span>
    </label>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvWisdom",
  computed: {
    ...mapGetters(["GetClassSavingThrowWisdom"]),
    value: {
      get() {
        if (typeof this.GetClassSavingThrowWisdom === "boolean")
          return this.GetClassSavingThrowWisdom;
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
