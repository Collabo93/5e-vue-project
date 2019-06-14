<template>
  <b-container>
    <b-row>
      <b-col md="2">
        <RwvStrength/>
      </b-col>
      <b-col md="2">
        <RwvDexterity/>
      </b-col>
      <b-col md="2">
        <RwvConstitution/>
      </b-col>
      <b-col md="2">
        <RwvIntelligence/>
      </b-col>
      <b-col md="2">
        <RwvWisdom/>
      </b-col>
      <b-col md="2">
        <RwvCharisma/>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapMutations } from "vuex";

import RwvStrength from "./SavingThrows/Strength";
import RwvDexterity from "./SavingThrows/Dexterity";
import RwvConstitution from "./SavingThrows/Constitution";
import RwvIntelligence from "./SavingThrows/Intelligence";
import RwvWisdom from "./SavingThrows/Wisdom";
import RwvCharisma from "./SavingThrows/Charisma";

export default {
  name: "RwvSavingThrows",
  components: {
    RwvStrength,
    RwvDexterity,
    RwvConstitution,
    RwvIntelligence,
    RwvWisdom,
    RwvCharisma
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

<style>
.SavingThrowFrame{
  text-align: center;
}
.SavingThrowFrame input[type='radio']{
  display:none;
}
.SavingThrowFrame label{
  position: relative;
}
.SavingThrowFrame span::before,
.SavingThrowFrame span::after{
  content:"";
  position: absolute;
  top:0;
  bottom:0;
  margin:0
}
.SavingThrowFrame span.radio:hover{
  cursor: pointer;
}
.container span.radio::before {
  left: -22px;
  width: 44px;
  height: 20px;
  background-color: rgba(190,190,190,.2);
  border-radius: 50%;
}
.SavingThrowFrame span.radio::after{
  left: -22px;
  width: 20px;
  height: 20px;
  border-radius: 50%;
  background-color: grey;
  transition: .25s;
}
input[type="radio"]:checked + label span.radio::after {
  left: 0px;
   width: 20px;
  height: 20px;
  background-color: #4caf50;
}
</style>
