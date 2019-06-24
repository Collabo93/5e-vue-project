<template>
  <b-container class="padding">
    <b-row>
      <b-col md="2">
        <div class="AvailableAttributePoints Information">
          <p class="InformationValue">{{GetAvailableAttributePoints}}</p>
          <p class="InformationTitle">Available Points</p>
        </div>
      </b-col>
      <transition name="InfoBoxes">
        <b-col md="2" v-if="toggle()">
          <div class="AvailableAttributePoints Information">
            <p class="InformationValue">{{GetClassAbilityScoreBonusesPerLevel}}</p>
            <p class="InformationTitle">Improvements</p>
          </div>
        </b-col>
      </transition>
      <transition name="InfoBoxes">
        <b-col md="2" v-if="toggle()">
          <RwvAbilityScoreImprovement/>
        </b-col>
      </transition>
      <transition name="InfoBoxes">
        <b-col md="2" v-if="toggle()">
          <RwvFeatImprovement/>
        </b-col>
        </transition>
        <b-col md="1"></b-col>
        <b-col md="3">
          <RwvProficiencyBonus/>
        </b-col>
    </b-row>
  <hr>
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
      <b-col md="2"></b-col>
      <b-col md="2">
        <RwvSpeed/>
      </b-col>
      <b-col md="2">
        <RwvInitiative/>
      </b-col>
    </b-row>

    <b-row>
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
      <b-col md="2"></b-col>
      <b-col md="2">
        <RwvArmorClass/>
      </b-col>
      <b-col md="2">
        <RwvHitPoints/>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters } from "vuex";

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

import RwvProficiencyBonus from "./CharacterDetails/ProficiencyBonus";
import RwvArmorClass from "./CharacterDetails/ArmorClass";
import RwvInitiative from "./CharacterDetails/Initiative";
import RwvSpeed from "./CharacterDetails/Speed";
import RwvHitPoints from "./CharacterDetails/HitPoints";

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
    RwvSavingThrowCharisma,

    RwvProficiencyBonus,
    RwvArmorClass,
    RwvInitiative,
    RwvSpeed,
    RwvHitPoints
  },
  computed: {
    ...mapGetters(["GetAvailableAttributePoints"]),
    ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"]),
    ...mapGetters(["GetClassAbilityScoreBonusSpendOnAbilityScore"]),
    ...mapGetters(["GetClassAbilityScoreBonusSpendOnFeat"]),
    ...mapGetters(["GetClassProficiencyBonusPerLevel"])
  },
  methods: {
    toggle() {
      if (
        this.GetClassAbilityScoreBonusesPerLevel > 0 ||
        this.GetClassAbilityScoreBonusSpendOnAbilityScore > 0 ||
        this.GetClassAbilityScoreBonusSpendOnFeat > 0
      ) {
        return true;
      }
      return false;
    }
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
  border: solid 1.5px;
  border-radius: 5px 5px 20px 20px;
}
.AttributeFrame .AttributeOutput .AttributeTitel {
  font-size: 16px;
  font-weight: bold;
}
.AttributeFrame .AttributeOutput .AttributeAbilityScore p {
  display: inline-block;
}
.AttributeFrame .AttributeOutput .AttributeRaceAbilityScore {
  color: black;
  font-weight: bold;
}

.SavingThrowFrame {
  text-align: center;
}
.SavingThrowFrame input[type="radio"] {
  display: none;
}
.SavingThrowFrame label {
  position: relative;
}
.SavingThrowFrame span::before,
.SavingThrowFrame span::after {
  content: "";
  position: absolute;
  top: 0;
  bottom: 0;
  margin: 0;
}
.container span.radio::before {
  left: -22px;
  width: 44px;
  height: 20px;
  background-color: rgba(190, 190, 190, 0.2);
  border-radius: 50%;
}
.SavingThrowFrame span.radio::after {
  left: -22px;
  width: 20px;
  height: 20px;
  border-radius: 50%;
  background-color: grey;
  transition: 0.25s;
}
input[type="radio"]:checked + label span.radio::after {
  left: 0px;
  width: 20px;
  height: 20px;
  background-color: #4caf50;
}
</style>
