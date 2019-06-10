import Vuex from "vuex";
import Vue from "vue"
import CharacterSheet from "./Character/CharacterSheet";
import Attributes from "./Character/Attributes";
import FetchClass from "./Fetch/Class";
import FetchRace from "./Fetch/Race";
import FetchBackground from "./Fetch/Background";

Vue.use(Vuex);

export default new Vuex.Store({
    modules:{
        CharacterSheet,
        Attributes,
        FetchClass,
        FetchRace,
        FetchBackground
    }
})