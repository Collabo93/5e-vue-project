<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <RwvAttributes/>
    <hr>
    <RwvRaceSkillChoice/>
    <RwvSkills/>
    <img src="../assets/test-characterSheet.jpg">
  </b-container>
  
</template>
<script>
import RwvStandardInformations from "@/components/StandardInformations";
import RwvAttributes from "@/components/Attributes";
import RwvRaceSkillChoice from "@/components/RaceSkillChoice"
import RwvSkills from "@/components/Skills";

import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvStandardInformations,
    RwvAttributes,
    RwvRaceSkillChoice,
    RwvSkills
  },
  data() {
    return {
      CharacterSheet: [
        {
          CharacterName: "",
          Class: [{ name: "" }, { url: "" }],
          Level: "",
          Race: [{ name: "" }, { url: "" }],
          PlayerName: "",
          Background: [{ name: "" }, { url: "" }],
          Alignment: "",
          Attributes: [
            {
              Strength: "",
              Dexterity: "",
              Constitution: "",
              Intelligence: "",
              Wisdom: "",
              Charisma: ""
            }
          ],
          ArmorType: ""
        }
      ],
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
    ...mapMutations(["InitCharacterSheetFormular"]),
    ...mapMutations(["InitDataClass"]),
    ...mapMutations(["InitBaseAC"]),
    ...mapMutations(["InitializeDataRace"]),
    ...mapMutations(["SetBaseAttributes"]),
    ...mapMutations(["SetBaseAttributePoints"]),

    InitializeStore() {
      this.InitCharacterSheetFormular(this.CharacterSheet[0]);
      this.InitDataClass(this.BaseClassInfo);
      this.InitBaseAC(this.BaseACPerArmorType);
      this.InitializeDataRace(this.BaseRaceInfo);
      this.SetBaseAttributes(this.BaseAttributes);
      this.SetBaseAttributePoints(this.BaseAttributePoints);
    }
  },
  created: function() {
    this.InitializeStore();
  }
};
</script>

<style>
.InformationDiv {
  display: inline-block;
  padding-left: 10px;
}
.Information .InformationValue {
  font-size: 3em;
  display: inline;
}
.Information .InformationValue::after {
  background-color: #4caf50;
  height: 2px;
  width: 60px;
  content: "";
  display: block;
}
.Information .InformationTitle {
  font-weight: bold;
  color: grey;
}
.InformationButton {
  float: left;
  vertical-align: center;
}
.InformationButton button {
  width: 25px !important;
  height: 25px !important;
}
</style>
