<template>
  <div>
    <b-form-select v-model="Level" :options="LevelRange"></b-form-select>
  </div>
</template>

<script>
export default {
  name: "RwvLevel",
  data(){
      return{
          Level:"",
          LevelRange:[],
          LevelMax:20
      }
  },
   created: function() {
    this.SetLevelRange();
  },
  methods:{
      SetLevelRange(){
          for (let index = 1; index <= this.LevelMax; index++) {
              this.LevelRange.push(index);           
          }
      }
  },
  watch: {
    Level: function() {
      this.$emit("inputData", this.Level);
    }
  }
};
</script>