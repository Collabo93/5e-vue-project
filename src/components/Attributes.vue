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
    ...mapGetters(["GetAvailableAttributePoints"])
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
.AvailableAttributePoints {
  font-size: 30px;
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
</style>
