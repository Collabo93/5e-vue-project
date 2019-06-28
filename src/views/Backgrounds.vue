<template>
  <b-container class="padding">
    <b-row>
      <b-col>
        <p>Skills</p>
      </b-col>
      <b-col>
        <p>Weapons</p>
      </b-col>
      <b-col>
        <p>Tool</p>
      </b-col>
      <b-col>
        <p>Language</p>
      </b-col>
    </b-row>
    <b-row>
      <b-col md="4" v-for="(Backgrounds, index) in GetBackgroundNames" :key="index">
        <div class="kachel">
          <p>{{Backgrounds}}</p>
        </div>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapActions } from "vuex";

export default {
  name: "RwvBackgrounds",
  data() {
    return {
      SkillsToggle: false,
      WeaponsToggle: false,
      ToolToggle: false,
      Language: false
    };
  },
  computed: {
    ...mapGetters(["GetBackgroundNames"])
  },
  methods: {
    ...mapActions(["fetchDataBackground"])
  },
  created: function() {
    this.fetchDataBackground();
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
  transform-origin: 10% 50%;
  background-color: rgba(197, 208, 209, 0.1);
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
}
</style>
