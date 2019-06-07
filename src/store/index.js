import Vuex from "vuex";
import Vue from "vue"
import CharacterSheet from "./Character/CharacterSheet";
import FetchClass from "./Fetch/Class";
import FetchRase from "./Fetch/Race";

Vue.use(Vuex);

export default new Vuex.Store({
    modules:{
        CharacterSheet,
        FetchClass,
        FetchRase
    }
})