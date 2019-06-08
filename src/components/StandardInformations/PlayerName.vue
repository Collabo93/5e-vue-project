<template>
  <b-form-input id="PlayerName" v-model="PlayerName"></b-form-input>
</template>

<script>
import { mapMutations } from "vuex";

export default {
  name: "RwvPlayerName",
  data() {
    return {
      PlayerName: ""
    };
  },
  methods: {
    ...mapMutations(["SetPlayerName"])
  },
  watch: {
    PlayerName: function() {
      this.SetPlayerName(this.PlayerName);
    }
  }
};
</script>
