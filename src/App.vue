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
</style>
