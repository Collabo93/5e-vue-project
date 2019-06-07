<template>
  <b-container class="padding">
    <b-row>
      <b-col md="6" sm="12">
        <b-form-input id="CharacterName" v-model="CharacterSheet.CharacterName" required></b-form-input>
        <p>Character Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvClass @inputData="Class"/>
        <p>Class</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvLevel @inputData="Level"/>
        <p>Level</p>
      </b-col>
      <b-col md="2" sm="4">
        <b-form-input id="Race" v-model="CharacterSheet.Race" required></b-form-input>
        <p>Race</p>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6"></b-col>
      <b-col md="2" sm="4">
        <b-form-input id="PlayerName" v-model="CharacterSheet.PlayerName"></b-form-input>
        <p>Player Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <b-form-input id="Background" v-model="CharacterSheet.Background" required></b-form-input>
        <p>Background</p>
      </b-col>
      <b-col md="2" sm="4">
        <b-form-input id="PlayerName" v-model="CharacterSheet.Alignment" required></b-form-input>
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

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvClass,
    RwvLevel
  },
  data() {
    return {
      CharacterSheet: {
        CharacterName: "",
        Class: [{ name: String }, { url: String }],
        Level: "",
        Race: "",
        PlayerName: "",
        Background: "",
        Alignment: ""
      }
    };
  },
  methods: {
    Class(Class) {
      this.CharacterSheet.Class = Class;
    },
    Level(Level) {
      this.CharacterSheet.Level = Level;
    }
  }
};
</script>