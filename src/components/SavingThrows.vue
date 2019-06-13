<template>
  <b-container>
    <b-row>
      <b-col>
        <RwvStrength/>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapMutations } from "vuex";

import RwvStrength from "./SavingThrows/Strength";

export default {
  name: "RwvSavingThrows",
  components: {
    RwvStrength
  },
  data() {
    return {
      BaseClassInfo: [
        {
          Strength: false,
          Dexterity: false,
          Constitution: false,
          Intelligence: false,
          Wisdom: false,
          Charisma: false
        }
      ]
    };
  },
  methods: {
    ...mapMutations(["InitializeDataClass"])    
  },
  created: function() {
    this.InitializeDataClass(this.BaseClassInfo);
  }
};
</script>
