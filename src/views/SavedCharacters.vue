<template>
  <b-container class="padding">
    <b-row>
      <b-col>
        <h2>Saved Characters</h2>
        <hr />
      </b-col>
    </b-row>
    <b-row>
      <b-col md="4" v-for="Character in Characters" :key="Character.id">
        <div class="kachel">
          <div class="character">
            <p class="name"><b>{{Character.CharacterName}}</b></p>
            <div class="attributes">
              <p>Str: {{Character.Attributes[0].Strength}}</p>
              <p>Dex: {{Character.Attributes[0].Dexterity}}</p>
              <p>Con: {{Character.Attributes[0].Constitution}}</p>
              <p>Int: {{Character.Attributes[0].Intelligence}}</p>
              <p>Wis: {{Character.Attributes[0].Wisdom}}</p>
              <p>Cha: {{Character.Attributes[0].Charisma}}</p>
            </div>
          </div>
        </div>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapActions } from "vuex";
export default {
  name: "RwvSavedCharacters",
  data() {
    return {
      CharacterCount: 0,
      Characters: []
    };
  },
  computed: {
    ...mapGetters(["GetClassCount"]),
    ...mapGetters(["GetCharacter"])
  },
  methods: {
    ...mapActions(["FetchCharacterCount"]),
    ...mapActions(["FetchCaracter"])
  },
  created: function() {
    this.FetchCharacterCount().then(result => {
      this.CharacterCount = this.GetClassCount;

      let CharactersCache = [];
      for (let index = 0; index < this.CharacterCount; index++) {
        this.FetchCaracter(index).then(result => {
          if (typeof this.GetCharacter !== "undefined") {
            CharactersCache.push(this.GetCharacter);
          }
          return result;
        });
      }
      this.Characters = CharactersCache;

      return result;
    });
  }
};
</script>

<style>
.kachel {
  position: relative;
  width: 100%;
  display: inline-flex;
  flex-direction: column;
  margin-left: 1rem;
  margin-top: 1rem;
  padding-top: 0.75rem;
  border-radius: 6px;
  background-color: white;
  box-shadow: 0 0 0 1px #c5d0d1;
  backface-visibility: hidden;
  background-color: rgba(197, 208, 209, 0.1);
}
span {
  display: contents;
}
.kachel p {
  height: 2.5rem;
  margin: 0.75rem 0;
  font-size: 1.3rem;
  font-weight: 200;
  text-align: center;
  -ms-user-select: None;
  -moz-user-select: None;
  -webkit-user-select: None;
  color: black;
  text-decoration: none;
  transition: 1s;
}
.kachel .character .attributes {
  text-align: center;
}
.kachel .character .attributes p {
  display: inline-block;
  margin-top: 0 !important;
  margin-bottom: 0 !important;
  margin-left: 20px;
  margin-right: 20px;
}
</style>
