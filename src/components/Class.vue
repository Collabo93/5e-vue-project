<template>
  <div>
    <b-form-select v-model="SelectedClassName" :options="ClassesName"></b-form-select>
  </div>
</template>

<script>
import { RepositoryFactory } from "../services/RepositoryFactory";
const ClassRepository = RepositoryFactory.get("classes");

export default {
  name: "RwvClass",
  data() {
    return {
      ClassesAll: [],
      ClassesName: [],
      SelectedClassName: "",
      Class: [{ name: String }, { url: String }]
    };
  },
  created: function() {
    this.fetch();
  },
  methods: {
    async fetch() {
      const { data } = await ClassRepository.get();
      this.ClassesAll = data;
      for (var index = 0; index < this.ClassesAll["count"]; index++) {
        this.ClassesName.push(this.ClassesAll["results"][index]["name"]);
      }
    }
  },
  watch: {
    SelectedClassName: function() {
      for (let index = 0; index < this.ClassesName.length; index++) {
        if (this.SelectedClassName == this.ClassesName[index]) {
          this.Class["url"] = this.ClassesAll["results"][index]["url"];
          break;
        }
      }
      this.Class["name"] = this.SelectedClassName;
      this.$emit("inputData", this.Class);
    }
  }
};
</script>

<style>
</style>