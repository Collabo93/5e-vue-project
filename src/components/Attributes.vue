<template>
  <b-container>
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
import { mapGetters, mapMutations } from "vuex";

import RwvStrength from "./Attributes/Strength";
import RwvDexterity from "./Attributes/Dexterity";
import RwvConstitution from "./Attributes/Constitution";
import RwvIntelligence from "./Attributes/Intelligence";
import RwvWisdom from "./Attributes/Wisdom";
import RwvCharisma from "./Attributes/Charisma";
import RwvAbilityScoreImprovement from "./Attributes/AbilityScoreImprovement";
import RwvFeatImprovement from "./Attributes/FeatImprovement";

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
    RwvFeatImprovement
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
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);

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
</style>
