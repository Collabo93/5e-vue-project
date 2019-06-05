<template>
  <div>
    <b-dropdown id="Class" text="Select Class">
      <b-dropdown-item>First Action</b-dropdown-item>
      <b-dropdown-item>Second Action</b-dropdown-item>
      <b-dropdown-item>{{ClassesName}}</b-dropdown-item>
      <p>
          {{test}}
      </p>
    </b-dropdown>
  </div>
</template>

<script>
export default {
  name: "RwvClass",
  data(){
      return{
          ClassesAll:[],
          ClassesName:[],
          test:""
      }
  },
  created: function(){
    this.GetClasses();
  },
  methods: {
    async GetClasses() {
        let config ={
            headers:{
                "Accept":"application/json",
            }
        }
      const fetchAll = await this.$http.get("http://www.dnd5eapi.co/api/classes/",config);
      this.ClassesAll = fetchAll.data;
      this.test=this.ClassesAll["results"]["name"];
      for (let index = 0; index < this.ClassesAll["count"]; index++) {
          this.ClassesName[index]=this.ClassesAll["results"][index]["name"];
      }
      //this.test=this.ClassesAll["count"];
    }
  }
};
</script>

<style>
</style>