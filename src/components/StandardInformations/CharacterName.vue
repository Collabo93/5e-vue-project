<template>
  <b-form-input v-model="CharacterName" required></b-form-input>
</template>

<script>
import { mapMutations } from "vuex";

export default {
  name: "RwvCharacterName",
  data(){
      return{
          CharacterName:""
      }
  },
  methods:{
      ...mapMutations(["SetCharacterName"])
  },
  watch: {
    CharacterName: function() {
      this.SetCharacterName(this.CharacterName);
    }
  }
};
</script>
