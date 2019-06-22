<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <hr>
    <RwvAttributes/>
    <RwvCharacterDetails/>
    
  </b-container>
</template>
<script>
import RwvStandardInformations from "@/components/StandardInformations";
import RwvAttributes from "@/components/Attributes";
import RwvCharacterDetails from "@/components/CharacterDetails";

import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvStandardInformations,
    RwvAttributes,
    RwvCharacterDetails
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
      ],
      BaseACPerArmorType: [
        {
          None: [
            { name: "None" },
            { BaseAC: 10 },
            { DexModifier: true },
            { maxDexModifier: null }
          ],
          Leather: [
            { name: "Leather" },
            { BaseAC: 11 },
            { DexModifier: true },
            { maxDexModifier: null }
          ],
          Hide: [
            { name: "Hide" },
            { BaseAC: 12 },
            { DexModifier: true },
            { maxDexModifier: 2 }
          ],
          Chain: [
            { name: "Chain" },
            { BaseAC: 16 },
            { DexModifier: false },
            { maxDexModifier: null }
          ],
          ChainShield: [
            { name: "Chain + Shield" },
            { BaseAC: 18 },
            { DexModifier: false },
            { maxDexModifier: null }
          ],
          MageArmor: [
            { name: "Mage Armor" },
            { BaseAC: 13 },
            { DexModifier: true },
            { maxDexModifier: null }
          ]
        }
      ]
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {
    ...mapMutations(["InitDataClass"]),  
    ...mapMutations(["InitBaseAC"]),

    SetBaseAC() {
      this.InitDataClass(this.BaseClassInfo);
      this.InitBaseAC(this.BaseACPerArmorType);
    }
  },
  created: function() {
    this.SetBaseAC();
  }
};
</script>

<style>
.InformationDiv{
  display: inline-block;
  padding-left: 10px;
}
.Information .InformationValue{
  font-size: 3em;
  display: inline;
}
.Information .InformationValue::after{
background-color: #4caf50;
  height: 2px;
  width: 60px;
  content: "";
  display: block;
}
.Information .InformationTitle{
  font-weight: bold;
  color: grey;
}
.InformationButton{
  float: left;
  vertical-align: center;
}
.InformationButton button{
  width: 25px !important;
  height: 25px !important;
}
</style>
