<template>
  <b-container class="padding">
    <b-row>
      <b-col class="column">
        <div class="setToMiddle padding">
          <router-link active-class="active" exact :to="{ name: 'characterCreation' }">
            <img src="@/assets/home-character-creation.jpg" class="home-pictures">
          </router-link>
        </div>
        <p class="HomeMenuText">Character creation</p>
      </b-col>
      <b-col class="column">
        <div class="setToMiddle padding">
          <router-link active-class="active" exact :to="{ name: 'items' }">
            <img src="@/assets/home-items.jpg" class="home-pictures">
          </router-link>
        </div>
        <p class="HomeMenuText">Items</p>
      </b-col>
      <b-col class="column">
        <div class="setToMiddle padding">
          <router-link active-class="active" exact :to="{ name: 'creature' }">
            <img src="@/assets/home-creatures.jpg" class="home-pictures">
          </router-link>
        </div>
        <p class="HomeMenuText">Creatures</p>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  name: "rwv-home"
};
</script>

<style>
img.home-pictures {
  max-width: 250px;
  border: solid 1px;
  border-color: black;
  box-shadow: 0 5px 10px rgba(154, 160, 185, 0.05),
    0 15px 40px rgba(166, 173, 201, 0.2);
}
.setToMiddle {
  display: flex;
  align-items: center;
  justify-content: center;
}
.HomeMenuText {
  text-align: center;
  font-size: 18px;
}
.column:hover {
  background-color: rgba(76, 175, 80, 0.5);
}
</style>