<template>
  <b-container class="padding">
    <b-row>
      <b-col md="2">
        <div class="AvailableAttributePoints Information">
          <p class="InformationValue">{{GetAvailableAttributePoints}}</p>
          <p class="InformationTitle">Available Points</p>
        </div>
      </b-col>
      <b-col md="3">
        <div class="AvailableAttributePoints Information">
          <p class="InformationValue">{{GetClassAbilityScoreBonusesPerLevel}}</p>
          <p class="InformationTitle">Ability Score Improvement</p>
        </div>
      </b-col>
      <b-col md="2">
        <RwvAbilityScoreImprovement />
      </b-col>
      <b-col md="2">
        <RwvFeatImprovement />
      </b-col>
    </b-row>

    <b-row>
      <b-col md="2">
        <RwvStrength/>
        <RwvSavingThrowStrength/>
      </b-col>
      <b-col md="2">
        <RwvDexterity/>
        <RwvSavingThrowDexterity/>
      </b-col>
      <b-col md="2">
        <RwvConstitution/>
        <RwvSavingThrowConstitution/>
      </b-col>
      <b-col md="2">
        <RwvIntelligence/>
        <RwvSavingThrowIntelligence/>
      </b-col>
      <b-col md="2">
        <RwvWisdom/>
        <RwvSavingThrowWisdom/>
      </b-col>
      <b-col md="2">
        <RwvCharisma/>
        <RwvSavingThrowCharisma/>
      </b-col>
      
      
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

import RwvStrength from "./Attributes/Strength";
import RwvDexterity from "./Attributes/Dexterity";
import RwvConstitution from "./Attributes/Constitution";
import RwvIntelligence from "./Attributes/Intelligence";
import RwvWisdom from "./Attributes/Wisdom";
import RwvCharisma from "./Attributes/Charisma";
import RwvAbilityScoreImprovement from "./Attributes/AbilityScoreImprovement";
import RwvFeatImprovement from "./Attributes/FeatImprovement";

import RwvSavingThrowStrength from "./SavingThrows/Strength";
import RwvSavingThrowDexterity from "./SavingThrows/Dexterity";
import RwvSavingThrowConstitution from "./SavingThrows/Constitution";
import RwvSavingThrowIntelligence from "./SavingThrows/Intelligence";
import RwvSavingThrowWisdom from "./SavingThrows/Wisdom";
import RwvSavingThrowCharisma from "./SavingThrows/Charisma";

export default {
  name: "RwvAttributes",
  components: {
    RwvStrength,
    RwvDexterity,
    RwvConstitution,
    RwvIntelligence,
    RwvWisdom,
    RwvCharisma,
    RwvAbilityScoreImprovement,
    RwvFeatImprovement,
    RwvSavingThrowStrength,
    RwvSavingThrowDexterity,
    RwvSavingThrowConstitution,
    RwvSavingThrowIntelligence,
    RwvSavingThrowWisdom,
    RwvSavingThrowCharisma
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
      ],
      BaseAttributePoints: 27,
      BaseAttributePointsCalculation: [
        {
          OnePoint: 0,
          TwoPoints: 14
        }
      ],
      BaseRaceInfo: [
        {
          Strength: 0,
          Dexterity: 0,
          Constitution: 0,
          Intelligence: 0,
          Wisdom: 0,
          Charisma: 0,
          Speed: 0
        }
      ]
    };
  },
  computed: {
    ...mapGetters(["GetAvailableAttributePoints"]),
    ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"])
  },
  methods: {
    ...mapMutations(["SetBaseAttributes"]),
    ...mapMutations(["SetBaseAttributePoints"]),
    ...mapMutations(["InitializeDataRace"]),
    SetData() {
      this.InitializeDataRace(this.BaseRaceInfo);
    }
  },
  created: function() {
    this.SetBaseAttributes(this.BaseAttributes);
    this.SetBaseAttributePoints(this.BaseAttributePoints);
    this.SetData();
  }
};
</script>

<style>
.AttributeFrame .AtributeIncDec {
  padding: 10px;
  text-align: center;
}
.AttributeFrame .AtributeIncDec button {
  margin: 5px;
}
.AttributeFrame .AtributeIncDec .decrement {
  transform: rotate(180deg);
}
.AttributeFrame .AttributeOutput {
  text-align: center;
  border: solid 1px;
  border-color: grey;
  border-radius: 5px 5px 20px 20px;
}
.AttributeFrame .AttributeOutput .AttributeTitel {
  font-size: 16px;
  font-weight: bold;
}
.AttributeFrame .AttributeOutput .AttributeAbilityScore p{
  display: inline-block;
}
.AttributeFrame .AttributeOutput .AttributeRaceAbilityScore{
  color: green;
}

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
