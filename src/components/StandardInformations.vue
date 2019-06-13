<template>
  <b-container>
    <b-row>
      <b-col md="6" sm="12">
        <RwvCharacterName/>
        <p>Character Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvClass/>
        <p>Class</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvLevel/>
        <p>Level</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvRace/>
        <p>Race</p>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="6"></b-col>
      <b-col md="2" sm="4">
        <RwvPlayerName/>
        <p>Player Name</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvBackground/>
        <p>Background</p>
      </b-col>
      <b-col md="2" sm="4">
        <RwvAlignment/>
        <p>Alignment</p>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import RwvCharacterName from "./StandardInformations/CharacterName";
import RwvClass from "./StandardInformations/Class";
import RwvLevel from "./StandardInformations/Level";
import RwvRace from "./StandardInformations/Race";
import RwvPlayerName from "./StandardInformations/PlayerName";
import RwvBackground from "./StandardInformations/Background";
import RwvAlignment from "./StandardInformations/Alignment";

export default {
  name: "RwvStandardInformation",
  components: {
    RwvCharacterName,
    RwvClass,
    RwvLevel,
    RwvRace,
    RwvPlayerName,
    RwvBackground,
    RwvAlignment
  }
};
</script>