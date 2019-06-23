<template>
  <div id="app">
    <RwvHeader/>
    <transition name="view">
      <router-view></router-view>
    </transition>
    <transition name="footer">
        <RwvFooter/>
    </transition>
  </div>
</template>

<script>
import RwvHeader from "@/components/Header";
import RwvFooter from "@/components/Footer";

export default {
  name: "app",
  components: {
    RwvHeader,
    RwvFooter
  },
  data() {
    return {
      ViewGoing: false
    };
  }
};
</script>

<style>
html,
body {
  width: 100% !important;
  height: 100% !important;
}
body {
  display: flex !important;
  flex-flow: column;
}
.padding {
  padding: 2em !important;
}

.view-enter-active,
.view-leave-active {
  transition: opacity 0.6s ease-in-out, transform 0.6s ease;
}
.view-enter-active {
  transition-delay: 0.6s;
}
.view-enter {
  opacity: 0;
  transform: translateX(-100px);
}
.view-enter-to {
  opacity: 1;
  transform: translateX(0);
}
.view-leave {
  opacity: 1;
  transform: translateX(0);
}
.view-leave-to {
  opacity: 0;
  transform: translateX(100px);
}

.InfoBoxes-enter-active {
  animation: flipInX .7s;
}
.InfoBoxes-leave-active {
  animation: flipInX .8s reverse;
}
@keyframes flipInX {
  from {
    -webkit-transform: perspective(400px) rotate3d(1, 0, 0, 90deg);
    transform: perspective(400px) rotate3d(1, 0, 0, 90deg);
    -webkit-animation-timing-function: ease-in;
    animation-timing-function: ease-in;
    opacity: 0;
  }

  40% {
    -webkit-transform: perspective(400px) rotate3d(1, 0, 0, -20deg);
    transform: perspective(400px) rotate3d(1, 0, 0, -20deg);
    -webkit-animation-timing-function: ease-in;
    animation-timing-function: ease-in;
  }

  60% {
    -webkit-transform: perspective(400px) rotate3d(1, 0, 0, 10deg);
    transform: perspective(400px) rotate3d(1, 0, 0, 10deg);
    opacity: 1;
  }

  80% {
    -webkit-transform: perspective(400px) rotate3d(1, 0, 0, -5deg);
    transform: perspective(400px) rotate3d(1, 0, 0, -5deg);
  }

  to {
    -webkit-transform: perspective(400px);
    transform: perspective(400px);
  }
}
</style>
