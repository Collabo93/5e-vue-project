<template>
  <div>
    <b-form-select v-model="SelectedClassName" :options="ClassesName"></b-form-select>
  </div>
</template>

<script>
export default {
  name: "RwvClass",
  data() {
    return {
      ClassesAll: [],
      ClassesName: [],
      SelectedClassName: "",
      Class:["name","url"]
    };
  },
  created: function() {
    this.GetClasses();
  },
  methods: {
    async GetClasses() {
      let config = {
        headers: {
          Accept: "application/json"
        }
      };
      const fetchAll = await this.$http.get(
        "http://www.dnd5eapi.co/api/classes/",
        config
      );
      this.ClassesAll = fetchAll.data;
      for (var index = 0; index < this.ClassesAll["count"]; index++) {
        this.ClassesName.push(this.ClassesAll["results"][index]["name"]);
      }
    }
  },
  watch: {
    SelectedClassName: function() {
      for (let index = 0; index < this.ClassesName.length; index++) {
        if (this.SelectedClassName == this.ClassesName[index]) {
          this.Class["url"]=this.ClassesAll["results"][index]["url"];
          break;
        }
      }
      this.Class["name"]=this.SelectedClassName;
      this.$emit("inputData", this.Class);
      this.Class=[];
    }
  }
};
</script>

<style>
</style>