<template>
  <b-row md="3">
    <RwvStrength/>
  </b-row>
</template>

<script>
import RwvStrength from "./Attributes/Strength";

export default {
  name: "RwvAttributes",
  components: {
    RwvStrength
  }
};
</script>

<style>
.AttributeFrame {
  text-align: center;
  border: solid 1px;
  border-color: black;
  border-radius: 15px 15px 30px 30px;
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);
}
.AttributeTitel{
    font-size: 18px;
    font-weight: bold;
}
</style>
