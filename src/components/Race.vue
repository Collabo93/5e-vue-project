<template>
  <div>
    <b-form-select v-model="SelectedRaceName" :options="RacesName"></b-form-select>
  </div>
</template>

<script>
import { RepositoryFactory } from "../services/RepositoryFactory";
const RaceRepository = RepositoryFactory.get("races");

export default {
  name: "RwvRace",
  data() {
    return {
      RacesAll: [],
      RacesName: [],
      SelectedRaceName: "",
      Race: [{ name: String }, { url: String }]
    };
  },
  created: function() {
    this.fetch();
  },
  methods: {
    async fetch() {
      const { data } = await RaceRepository.get();
      this.RacesAll = data;
      for (var index = 0; index < this.RacesAll["count"]; index++) {
        this.RacesName.push(this.RacesAll["results"][index]["name"]);
      }
    }
  },
  watch: {
    SelectedRaceName: function() {
      for (let index = 0; index < this.RacesName.length; index++) {
        if (this.SelectedRaceName == this.RacesName[index]) {
          this.Race["url"] = this.RacesAll["results"][index]["url"];
          break;
        }
      }
      this.Race["name"] = this.SelectedRaceName;
      this.$emit("inputData", this.Race);
    }
  }
};
</script>

<style>
</style>