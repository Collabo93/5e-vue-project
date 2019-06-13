<template>
  <b-container>
    <b-row>
      <b-col>
        <div class="AvailableAttributePoints">
          <p>Remaining points: {{GetAvailableAttributePoints}}</p>
        </div>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="3">
        <RwvStrength/>
      </b-col>
      <b-col md="3">
        <RwvDexterity/>
      </b-col>
      <b-col md="3">
        <RwvConstitution/>
      </b-col>
      <b-col md="3">
        <RwvIntelligence/>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="3">
        <RwvWisdom/>
      </b-col>
      <b-col md="3">
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

export default {
  name: "RwvAttributes",
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
      ]
    };
  },
  computed: {
    ...mapGetters(["GetAvailableAttributePoints"])
  },
  methods: {
    ...mapMutations(["SetBaseAttributes"]),
    ...mapMutations(["SetBaseAttributePoints"])
  },
  created: function() {
    this.SetBaseAttributes(this.BaseAttributes);
    this.SetBaseAttributePoints(this.BaseAttributePoints);
  }
};
</script>

<style>
.AvailableAttributePoints {
  font-size: 20px;
}
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
  border-radius: 15px 15px 30px 30px;
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
