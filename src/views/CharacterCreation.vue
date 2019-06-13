<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <RwvAttributes />
    <RwvSavingThrows />
    <b-row class="padding">
      <b-col>
        <b-button :pressed.sync="debugButtonPressed" variant="primary">Debug Mode</b-button>
      </b-col>
    </b-row>
    <b-row>
      <b-col>
        <div v-if="debugButtonPressed">
          <p>{{GetCharacterSheet.CharacterName}}</p>
          <p v-if="GetCharacterSheet.Class">{{GetCharacterSheet.Class["name"]}} {{GetCharacterSheet.Class["url"]}}</p>
          <p>{{GetCharacterSheet.Level}}</p>
          <p v-if="GetCharacterSheet.Race">{{GetCharacterSheet.Race["name"]}} {{GetCharacterSheet.Race["url"]}}</p>
          <p>{{GetCharacterSheet.PlayerName}}</p>
          <p v-if="GetCharacterSheet.Background">{{GetCharacterSheet.Background["name"]}} {{GetCharacterSheet.Background["url"]}}</p>
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

import { mapGetters } from "vuex";

export default {
  name: "RwvCharacterCreation",
  components: {
    RwvStandardInformations,
    RwvAttributes,
    RwvSavingThrows
  },
  data() {
    return {
      debugButtonPressed: false
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {}
};
</script>