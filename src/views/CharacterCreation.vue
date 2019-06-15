<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <hr>
    <RwvAttributes/>
    <RwvSavingThrows/>
    <RwvCharacterDetails/>
    <!--
    <div id="EndData" v-on:click="toggle()" onmouseover="test">
      <div id=EndDataTitel>
        <p id="EndDataArrow">>&nbsp;</p>
        <p>Summary</p>
      </div>
      
      <div v-if="!FormularToggled">
        <p>{{GetCharacterSheet.CharacterName}}</p>
      </div>
    </div>
    Maybe later
    -->
    <b-row class="padding">
      <b-col>
        <b-button :pressed.sync="debugButtonPressed" variant="primary">Debug Mode</b-button>
      </b-col>
    </b-row>
    <b-row>
      <b-col>
        <div v-if="debugButtonPressed">
          <p>{{GetCharacterSheet.CharacterName}}</p>
          <p
            v-if="GetCharacterSheet.Class"
          >{{GetCharacterSheet.Class["name"]}} {{GetCharacterSheet.Class["url"]}}</p>
          <p>{{GetCharacterSheet.Level}}</p>
          <p
            v-if="GetCharacterSheet.Race"
          >{{GetCharacterSheet.Race["name"]}} {{GetCharacterSheet.Race["url"]}}</p>
          <p>{{GetCharacterSheet.PlayerName}}</p>
          <p
            v-if="GetCharacterSheet.Background"
          >{{GetCharacterSheet.Background["name"]}} {{GetCharacterSheet.Background["url"]}}</p>
          <p>{{GetCharacterSheet.Alignment}}</p>
        </div>
      </b-col>
    </b-row>
    <img src="../assets/test-characterSheet.jpg">
  </b-container>
</template>
<script>
import RwvStandardInformations from "@/components/StandardInformations";
import RwvAttributes from "@/components/Attributes";
import RwvSavingThrows from "@/components/SavingThrows";
import RwvCharacterDetails from "@/components/CharacterDetails";

import { mapGetters } from "vuex";

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
      debugButtonPressed: false,
      FormularToggled: false
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {
    toggle(){
      var element = document.getElementById("EndData");
      if ( !this.FormularToggled ){
        element.style.width = "auto";
        this.FormularToggled = true;
      }
      else{
        element.style.width = "400px";
        this.FormularToggled = false;
      }
    }
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
  transition: .5s!important;
  border: solid;
  border-width: .5px 0px .5px .5px;
  border-color: black;
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);
  color:black;
}
#EndData #EndDataTitel p{
  display: inline-block;
}
#EndData:hover {
   transform: translateX(40px);
}
</style>
