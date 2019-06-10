<template>
  <div class="AttributeFrame padding">
    <p class="AttributeTitel">Strength</p>
    <p>Value</p>
    <p>Minus/Plus</p>
  </div>
</template>

<script>
import { mapMutations } from "vuex";

export default {
  name: "RwvStrength",
  methods: {
    ...mapMutations(["SetAbilityModifier"])
  },
  created: function() {
    //this.SetAbilityModifier();
  }
};
</script>
