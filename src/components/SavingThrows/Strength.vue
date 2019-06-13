<template>
  <div class="SavingThrowFrame">
    <b-form-radio-group :options="options"></b-form-radio-group>
    <p>{{value}}</p>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  name: "RwvStrength",
  data() {
    return {
      dummy: true,
      options: [
        {
          text: "Strength",
          disabled: true
        }
      ]
    };
  },
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
      return this.value;
    }
  }
};
</script>
