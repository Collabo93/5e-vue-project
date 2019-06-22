<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <hr>
    <RwvAttributes/>
    <RwvSavingThrows/>
    <RwvCharacterDetails/>
    <img src="../assets/test-characterSheet.jpg">
  </b-container>
</template>
<script>
import RwvStandardInformations from "@/components/StandardInformations";
import RwvAttributes from "@/components/Attributes";
import RwvSavingThrows from "@/components/SavingThrows";
import RwvCharacterDetails from "@/components/CharacterDetails";

import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvStandardInformations,
    RwvAttributes,
    RwvSavingThrows,
    RwvCharacterDetails
  },
  data() {
    return {
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
    ...mapMutations(["InitBaseAC"]),
    SetBaseAC() {
      this.InitBaseAC(this.BaseACPerArmorType);
    }
  },
  created: function() {
    this.SetBaseAC();
  }
};
</script>

<style>
#EndData {
  position: fixed;
  background: #4caf50;
  color: #fff;
  padding: 20px;
  width: auto;
  right: 0;
  top: 30%;
  transition: 0.5s !important;
  border: solid;
  border-width: 0.5px 0px 0.5px 0.5px;
  border-color: black;
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);
  color: black;
}
#EndData #EndDataTitel p {
  display: inline-block;
}
#EndData:hover {
  transform: translateX(40px);
}
</style>
