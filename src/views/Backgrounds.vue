<template>
  <b-container class="padding">
    <b-row>
      <b-col>
        <p @click="toggle(index)" class="menu" v-for="(menu, index) in menus" :key="index">{{menu}}</p>
        <p @click="Clear()" class="menu" id="Clear">Clear All</p>
      </b-col>
    </b-row>
    <hr>
    <b-row>
      <transition name="Filter">
        <b-col v-if="SkillsToggle">
          <p
            @click="Filter($event, 0, index)"
            class="Filter"
            v-for="(Skills, index) in FilterSkills"
            :key="index"
          >{{Skills}}</p>
        </b-col>
      </transition>
      <transition name="Filter">
        <b-col v-if="WeaponsToggle">
          <p
            @click="Filter($event, 1, index)"
            class="Filter"
            v-for="(Weapons, index) in FilterWeapons"
            :key="index"
          >{{Weapons}}</p>
        </b-col>
      </transition>
      <transition name="Filter">
        <b-col v-if="ToolToggle">
          <p
            @click="Filter($event, 2, index)"
            class="Filter"
            v-for="(Tools, index) in FilterTools"
            :key="index"
          >{{Tools}}</p>
        </b-col>
      </transition>
      <transition name="Filter">
        <b-col v-if="LanguageToggle">
          <p
            @click="Filter($event, 3, index)"
            class="Filter"
            v-for="(Languages, index) in FilterLanguages"
            :key="index"
          >{{Languages}}</p>
        </b-col>
      </transition>
    </b-row>
    <b-row>
      <b-col md="4" v-for="(Backgrounds, index) in GetBackgroundNames" :key="index">
        <div class="kachel">
          <router-link active-class="active" exact :to="{ name: 'backgroundDetail', params: {BackgroundName:Backgrounds}}">
            <p>{{Backgrounds}}</p>
          </router-link>
        </div>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapActions, mapMutations } from "vuex";

export default {
  name: "RwvBackgrounds",
  data() {
    return {
      menus: ["Skills", "Weapons", "Tools", "Languages"],
      FilterSkills: [
        "Acrobatics",
        "Animal Handling",
        "Arcana",
        "Athletics",
        "Deception",
        "History",
        "Insight",
        "Intimidation",
        "Investigation",
        "Medicine",
        "Nature",
        "Perception",
        "Performance",
        "Pursuasion",
        "Religion",
        "Sleight of Hand",
        "Stealth",
        "Survival"
      ],
      FilterWeapons: [],
      FilterTools: [
        "tool kit",
        "one weapon",
        "Torturer's kit",
        "Calligrapher's supplies",
        "Herbalism kit",
        "Thieves' Tools",
        "Vehicle",
        "Disguise Kit",
        "Tinker’s tools",
        "Brewer's Tools"
      ],
      FilterLanguages: ["Auran", "Deep Speech"],
      SkillsToggle: false,
      WeaponsToggle: false,
      ToolToggle: false,
      LanguageToggle: false
    };
  },
  computed: {
    ...mapGetters(["GetBackgroundNames"])
  },
  methods: {
    ...mapActions(["fetchDataBackground"]),
    ...mapActions(["FetchBackgroundFiltered"]),
    ...mapMutations(["SetBackgroundNames"]),

    toggle(index) {
      if (index === 0) {
        if (this.SkillsToggle) {
          this.SkillsToggle = false;
        } else {
          this.SkillsToggle = true;
          this.WeaponsToggle = false;
          this.ToolToggle = false;
          this.LanguageToggle = false;
        }
      } else if (index === 1) {
        if (this.WeaponsToggle) {
          this.WeaponsToggle = false;
        } else {
          this.WeaponsToggle = true;
          this.SkillsToggle = false;
          this.ToolToggle = false;
          this.LanguageToggle = false;
        }
      } else if (index === 2) {
        if (this.ToolToggle) {
          this.ToolToggle = false;
        } else {
          this.ToolToggle = true;
          this.SkillsToggle = false;
          this.WeaponsToggle = false;
          this.LanguageToggle = false;
        }
      } else if (index === 3) {
        if (this.LanguageToggle) {
          this.LanguageToggle = false;
        } else {
          this.LanguageToggle = true;
          this.SkillsToggle = false;
          this.WeaponsToggle = false;
          this.ToolToggle = false;
        }
      }
    },
    Clear(){
      this.SetBackgroundNames();
    },

    Filter(el, Filter, index) {
      let sort;
      let filter;
      if (Filter === 0) {
        sort = "Skillproficiencies";
        filter = this.FilterSkills[index];
      } else if (Filter === 1) {
        sort = "Weaponproficiencies";
        filter = this.FilterWeapons[index];
      } else if (Filter === 2) {
        sort = "Toolproficiencies";
        filter = this.FilterTools[index];
      } else if (Filter === 3) {
        sort = "Languages";
        filter = this.FilterLanguages[index];
      }
      filter = filter.replace(" ", "_");
      this.FetchBackgroundFiltered([sort, filter]);
    }
  },
  created: function() {
    this.fetchDataBackground();
  }
};
</script>

<style>
.menu {
  display: inline-block;
  margin: 1rem;
  cursor: pointer;
  -ms-user-select: None;
  -moz-user-select: None;
  -webkit-user-select: None;
}
.kachel {
  position: relative;
  width: 100%;
  display: inline-flex;
  flex-direction: column;
  margin-left: 1rem;
  margin-top: 1rem;
  padding-top: 0.75rem;
  border-radius: 6px;
  background-color: white;
  box-shadow: 0 0 0 1px #c5d0d1;
  backface-visibility: hidden;
  background-color: rgba(197, 208, 209, 0.1);
}
.kachel p {
  height: 2.5rem;
  margin: 0.75rem 0;
  font-size: 1.3rem;
  font-weight: 200;
  text-align: center;
  -ms-user-select: None;
  -moz-user-select: None;
  -webkit-user-select: None;
  color: black;
  text-decoration: none;
}
.kachel a{
  text-decoration-color: rgba(76, 175, 80, 1);
}
.Filter {
  display: inline-block;
  cursor: pointer;
  margin-right: 0.5rem;
  padding: 0.25rem 0.5rem;
  border: 1px solid #c5d0d1;
  border-radius: 6px;
  font-size: 0.8rem;
  line-height: 1.35;
  -ms-user-select: None;
  -moz-user-select: None;
  -webkit-user-select: None;
}
#Clear{
  color:#f68185;
}
</style>
