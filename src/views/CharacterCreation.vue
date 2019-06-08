<template>
  <b-container class="padding">
    <RwvStandardInformations />
    <!--
    <b-row>
      <b-col md="6" sm="12">
        <b-form-input id="CharacterName" v-model="CharacterSheet.CharacterName" required></b-form-input>
        {{CharacterSheet.CharacterName}}
        <p>Character Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvClass/>
        <div v-if="GetCharacterSheet.Class">{{GetCharacterSheet.Class["name"]}}</div>
        <p>Class</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvLevel/>
        <div v-if="GetCharacterSheet.Level">{{GetCharacterSheet.Level}}</div>
        <p>Level</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvRace/>
        <div v-if="GetCharacterSheet.Race">{{GetCharacterSheet.Race["name"]}}</div>
        <p>Race</p>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6"></b-col>
      <b-col md="2" sm="4">
        <b-form-input id="PlayerName" v-model="CharacterSheet.PlayerName"></b-form-input>
        {{CharacterSheet.PlayerName}}
        <p>Player Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <b-form-input id="Background" v-model="CharacterSheet.Background" required></b-form-input>
        <p>Background</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvAlignment/>
        <div v-if="GetCharacterSheet.Alignment">{{GetCharacterSheet.Alignment}}</div>
        <p>Alignment</p>
      </b-col>
    </b-row>
    <b-row>
      <b-col>
        <img src="@/assets/test-characterSheet.jpg">
      </b-col>
    </b-row>
    -->
    <b-button :pressed.sync="debugButtonPressed" variant="primary">
      Debug Mode
    </b-button>
    <p v-if="debugButtonPressed">{{GetCharacterSheet.CharacterName}}</p>
    
  </b-container>
</template>

<script>
import RwvStandardInformations from "@/components/StandardInformations";

import { mapGetters } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvStandardInformations
  },
  data() {
    return {
      debugButtonPressed:false
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {
  }
};
</script>