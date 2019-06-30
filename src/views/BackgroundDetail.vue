<template>
  <b-container class="padding backgroundDetail">
    <b-row>
      <b-col>
        <h2>{{BackgroundName}}</h2>
      </b-col>
    </b-row>
    <hr>
    <b-row class="padding">
      <b-col class="Skill" v-if="GetBackgroundDetail.skill_proficiency">
        <p class="title">Skills Proficiency: {{GetBackgroundDetail.skill_proficiency.choose}}</p>
        <p class="choose"></p>
        <ul
          class="from"
          v-for="(name, index) in GetBackgroundDetail.skill_proficiency.from"
          :key="index"
        >
          <li v-if="name.name === 'choice'">Skill of your choice</li>
          <li>{{name.name}}</li>
        </ul>
      </b-col>
      <b-col class="Weapon" v-if="GetBackgroundDetail.weapon_proficiency">
        <p class="title">Weapons Proficiency: {{GetBackgroundDetail.weapon_proficiency.choose}}</p>
        <p class="choose"></p>
        <ul
          class="from"
          v-for="(name, index) in GetBackgroundDetail.weapon_proficiency.from"
          :key="index"
        >
          <li>{{name.name}}</li>
        </ul>
      </b-col>
      <b-col class="Tool" v-if="GetBackgroundDetail.tool_proficiency">
        <p class="title">Tools Proficiency: {{GetBackgroundDetail.tool_proficiency.choose}}</p>
        <p class="choose"></p>
        <ul>
          <li
            class="from"
            v-for="(name, index) in GetBackgroundDetail.tool_proficiency.from"
            :key="index"
          >{{name.name}}</li>
        </ul>
      </b-col>
      <b-col class="Language" v-if="GetBackgroundDetail.language">
        <p class="title">Languages Proficiency: {{GetBackgroundDetail.language.choose}}</p>
        <p class="choose"></p>
        <ul class="from" v-for="(name, index) in GetBackgroundDetail.language.from" :key="index">
          <li v-if="name.name === 'choice'">Language of your choice</li>

          <li v-else>{{name.name}}</li>
        </ul>
      </b-col>
    </b-row>
    <b-row class="padding">
      <b-col class="Equipment" v-if="GetBackgroundDetail.equipment">
        <p class="title">Equipment</p>
        <ul class="from" v-for="(name, index) in GetBackgroundDetail.equipment.from" :key="index">
          <li>{{name.item}}</li>
        </ul>
      </b-col>
    </b-row>
    <b-row class="padding">
      <b-col class="Description" v-if="GetBackgroundDetail.desc">
        <p class="title">Description: {{GetBackgroundDetail.desc.choose}}</p>
        <p class="choose"></p>
        <div class="from" v-for="(name, index) in GetBackgroundDetail.desc.from" :key="index">
          <p class="descName">
            <i>{{name.name}}</i>
          </p>
          <p class="descDesc">{{name.desc}}</p>
          <br>
        </div>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapActions } from "vuex";

export default {
  name: "RwvBackgroundDetail",
  data() {
    return {
      BackgroundName: ""
    };
  },
  computed: {
    ...mapGetters(["GetBackgroundDetail"])
  },
  methods: {
    ...mapActions(["FetchBackground"])
  },
  created() {
    this.BackgroundName = this.$route.params.BackgroundName;
    this.FetchBackground(this.BackgroundName);
  }
};
</script>

<style>
ul {
  margin-bottom: 0 !important;
}
.title {
  font-weight: bold;
}
</style>


