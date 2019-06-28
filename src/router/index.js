import Vue from "vue";
import Router from "vue-router";
import Home from "@/views/Home";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/",
      component: Home
    },
    {
      name: "home",
      path: "/home",
      component: Home
    },
    {
      name: "login",
      path: "/login",
      component: () => import("@/views/Login")
    },
    {
      name: "register",
      path: "/register",
      component: () => import("@/views/Register")
    },
    {
      name: "about",
      path: "/about",
      component: () => import("@/views/About")
    },
    {
      name: "characterCreation",
      path: "/characterCreation",
      component: () => import("@/views/CharacterCreation")
    },
    {
      name: "backgrounds",
      path: "/backgrounds",
      component: () => import("@/views/Backgrounds")
    },
    {
      name: "savedCharacters",
      path: "/savedCharacters",
      component: () => import("@/views/SavedCharacters")
    }
  ]
});
