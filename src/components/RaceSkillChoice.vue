<template>
  <b-container>
    <div v-for="(Proficiencies, index) in GetClassProficiencieSkillChoices" :key="index">
      <b-row>
        <b-col md="12">
          <p>Choose Proficiencies: {{GetClassProficiencieSkillChoicesNumber[index]}}</p>
        </b-col>
      </b-row>
      <b-row>
        <b-col
          md="3"
          class="proficiencyRow"
          v-for="Proficiencie in Proficiencies"
          :key="Proficiencie.id"
        >
          <p @click="KlickEvent($event, index, Proficiencie[0])">{{Proficiencie[0]}}</p>
        </b-col>
      </b-row>
      <br>
      <br>
    </div>
    <b-row></b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvRaceSkillChoice",
  data() {
    return {
      Selected: [],
      WorkingClass: ""
    };
  },
  computed: {
    ...mapGetters(["GetClassProficiencieSkillChoices"]),
    ...mapGetters(["GetClassProficiencieSkillChoicesNumber"]),
    ...mapGetters(["GetCharacterSheet"])
  },
  methods: {
    ...mapMutations(["SaveChoosenProficiencies"]),
    KlickEvent(el, index, Proficiency) {
      if (this.WorkingClass !== this.GetCharacterSheet.Class["name"]) {
        this.Selected = [];
      }
      if (
        this.Selected.length !== this.GetClassProficiencieSkillChoices.length
      ) {
        this.Selected = new Array(this.GetClassProficiencieSkillChoices.length);
        this.WorkingClass = this.GetCharacterSheet.Class["name"];
      }
      if (this.Selected[index] === undefined) {
        this.Selected[index] = [];
      }
      // Wenn aktuelle Klasse nicht mit der gespeicherten übereinstimmt -> Array zurücksetzen
      // Wenn Array leer -> Neue Größe festlegen und Aktuelle Klasse speichern
      // Wenn Array[index][0] undefined (noch nciht gesetzt) -> ersten Eintrag setzen

      let newProficiency = true;
      let oldProficiency = 0;
      this.Selected.forEach(element => {
        element.forEach((elemente, number) => {
          if (elemente == Proficiency) {
            newProficiency = false;
            oldProficiency = number;
          }
        });
      });
      if (
        newProficiency &&
        this.GetClassProficiencieSkillChoicesNumber[index] >
          this.Selected[index].length
      ) {
        this.Selected[index].push(Proficiency);
        el.target.style.backgroundColor = "#333";
        el.target.style.transform = "scale(1.1)";
      } else if (!newProficiency) {
        this.Selected[index].splice(oldProficiency, 1);
        el.target.style.backgroundColor = "rgba(51, 51, 51, 0.3)";
        el.target.style.transform = "scale(1)";
      }
      this.SaveChoosenProficiencies(this.Selected);
    }
  }
};
</script>

<style>
.proficiencyRow p {
  background-color: rgba(51, 51, 51, 0.3);
  color: white;
  padding: 5px;
  border: solid 1px;
  height: 100px;
  border-radius: 5px;
}
.proficiencyRow p {
  transition: 0.4s;
}
.proficiencyRow p:hover {
  background-color: #333;
  color: white;
}
</style>



