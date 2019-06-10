<template>
  <b-container class="padding">
    <RwvStandardInformations/>
    <b-row>
      <b-col>
        <b-button :pressed.sync="debugButtonPressed" variant="primary">Debug Mode</b-button>
      </b-col>
    </b-row>
    <b-row>
      <b-col>
        <div v-if="debugButtonPressed">
          <p>{{GetCharacterSheet.CharacterName}}</p>
          <p v-if="GetCharacterSheet.Class">{{GetCharacterSheet.Class["name"]}}</p>
          <p>{{GetCharacterSheet.Level}}</p>
          <p v-if="GetCharacterSheet.Race">{{GetCharacterSheet.Race["name"]}}</p>
          <p>{{GetCharacterSheet.PlayerName}}</p>
          <p v-if="GetCharacterSheet.Background">{{GetCharacterSheet.Background["name"]}}</p>
          <p>{{GetCharacterSheet.Alignment}}</p>
        </div>
      </b-col>
    </b-row>
    <img src="../assets/test-characterSheet.jpg">
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
      debugButtonPressed: false
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {}
};
</script>