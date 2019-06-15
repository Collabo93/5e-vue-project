<template>
  <div id="app">
    <RwvHeader />
    <router-view></router-view>
    <RwvFooter />
  </div>
</template>

<script>
import RwvHeader from "@/components/Header";
import RwvFooter from "@/components/Footer";

export default {
  name: 'app',
  components: {
    RwvHeader,
    RwvFooter
  }
}
</script>

<style>
html, body{
  width:100%!important;
  height:100%!important;
}
body{
  display:flex!important;
  flex-flow:column;
}
.padding{
  padding: 2em!important;
}
.InformationDiv{
  display: inline-block;
  padding-left: 10px;
}
.Information .InformationValue{
  font-size: 3em;
  display: inline;
}
.Information .InformationValue::after{
background-color: #4caf50;
  height: 2px;
  width: 60px;
  content: "";
  display: block;
}
.Information .InformationTitle{
  font-weight: bold;
  color: grey;
}
.InformationButton{
  float: left;
  vertical-align: center;
}
.InformationButton button{
  width: 25px !important;
  height: 25px !important;
}
</style>
