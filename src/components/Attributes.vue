<template>
  <b-row md="3">
    <RwvStrength/>
  </b-row>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

import RwvStrength from "./Attributes/Strength";

export default {
  name: "RwvAttributes",
  components: {
    RwvStrength
  },
  data() {
    return {
      BaseAttributes: [
        {
          Strength: 8,
          Dexterity: 8,
          Constitution: 8,
          Intelligence: 8,
          Wisdom: 8,
          Charisma: 8
        }
      ]
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {
    ...mapMutations(["SetChoosenOptions"]),
    ...mapMutations(["SetBaseAttributes"])
  },
  created: function() {
    this.SetBaseAttributes(this.BaseAttributes);
  }
};
</script>

<style>
.AttributeFrame {
  float: right;
  right: 0;
  text-align: center;
  border: solid 1px;
  border-color: grey;
  border-radius: 15px 15px 30px 30px;
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);
}
.AtributeIncDec {
  float: left;
  left: 0;
  position: relative;
  top: 18%;
  padding: 10px;
}
.AtributeIncDec button {
  margin: 5px !important;
}
.AtributeIncDec .decrement {
  transform: rotate(180deg);
}
.AttributeTitel {
  font-size: 18px;
  font-weight: bold;
}
</style>
