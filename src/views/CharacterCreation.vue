<template>
  <b-container class="padding">
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
  </b-container>
</template>

<script>
import RwvClass from "@/components/Class";
import RwvLevel from "@/components/Level";
import RwvRace from "@/components/Race";
import RwvAlignment from "@/components/Alignment";

import { mapGetters } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvClass,
    RwvLevel,
    RwvRace,
    RwvAlignment
  },
  data() {
    return {
      CharacterSheet: {
        CharacterName: "",
        PlayerName: "",
      }
      //Need to move to store
    };
  },
  computed: mapGetters(["GetCharacterSheet"]),
  methods: {}
};
</script>