<template>
  <b-container class="padding Skills">
    <b-row>
      <b-col md="2" class="Dex">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsAcrobatics}}</p>
                <p class="InformationTitle">Acrobatics</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Wis">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsAnimalHandling}}</p>
                <p class="InformationTitle">Animal Handling</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Int">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsArcana}}</p>
                <p class="InformationTitle">Arcana</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Str">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsAthletics}}</p>
                <p class="InformationTitle">Athletics</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Cha">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsDeception}}</p>
                <p class="InformationTitle">Deception</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColLeft Int">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsHistory}}</p>
                <p class="InformationTitle">History</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
    </b-row>

    <b-row class="RowMiddle">
      <b-col md="2" class="Wis">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsInsight}}</p>
                <p class="InformationTitle">Insight</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Cha">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsIntimidation}}</p>
                <p class="InformationTitle">Intimidation</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Int">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsInvestigation}}</p>
                <p class="InformationTitle">Investigation</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Wis">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsMedicine}}</p>
                <p class="InformationTitle">Medicine</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Int">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsNature}}</p>
                <p class="InformationTitle">Nature</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColLeft Wis">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsPerception}}</p>
                <p class="InformationTitle">Perception</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
    </b-row>

    <b-row>
      <b-col md="2" class="Cha">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsPerformance}}</p>
                <p class="InformationTitle">Performance</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Cha">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsPursuasion}}</p>
                <p class="InformationTitle">Persuasion</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Int">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsReligion}}</p>
                <p class="InformationTitle">Religion</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColMiddle Dex">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsSleightofHand}}</p>
                <p class="InformationTitle">Sleight of Hand</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="Dex">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsStealth}}</p>
                <p class="InformationTitle">Stealth</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
      <b-col md="2" class="ColLeft Wis">
        <transition name="InfoBoxes">
          <div class="ProficiencyBonus CharacterDetail">
            <div class="InformationDiv">
              <div class="Information">
                <p class="InformationValue">{{GetSkillPointsSurvival}}</p>
                <p class="InformationTitle">Survival</p>
              </div>
            </div>
          </div>
        </transition>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvSkills",
  computed: {
    ...mapGetters(["CharacterSheet"]),
    ...mapGetters(["GetClassProficiencyBonusPerLevel"]),

    ...mapGetters(["GetClassSavingThrowStrength"]),
    ...mapGetters(["GetClassSavingThrowDexterity"]),
    ...mapGetters(["GetClassSavingThrowConstitution"]),
    ...mapGetters(["GetClassSavingThrowIntelligence"]),
    ...mapGetters(["GetClassSavingThrowWisdom"]),
    ...mapGetters(["GetClassSavingThrowCharisma"]),

    ...mapGetters(["GetAbilityModifierStrength"]),
    ...mapGetters(["GetAbilityModifierDexterity"]),
    ...mapGetters(["GetAbilityModifierConstitution"]),
    ...mapGetters(["GetAbilityModifierIntelligence"]),
    ...mapGetters(["GetAbilityModifierWisdom"]),
    ...mapGetters(["GetAbilityModifierCharisma"]),

    ...mapGetters(["GetSkillPointsAcrobatics"]),
    ...mapGetters(["GetSkillPointsAnimalHandling"]),
    ...mapGetters(["GetSkillPointsArcana"]),
    ...mapGetters(["GetSkillPointsAthletics"]),
    ...mapGetters(["GetSkillPointsDeception"]),
    ...mapGetters(["GetSkillPointsHistory"]),
    ...mapGetters(["GetSkillPointsInsight"]),
    ...mapGetters(["GetSkillPointsIntimidation"]),
    ...mapGetters(["GetSkillPointsInvestigation"]),
    ...mapGetters(["GetSkillPointsMedicine"]),
    ...mapGetters(["GetSkillPointsNature"]),
    ...mapGetters(["GetSkillPointsPerception"]),
    ...mapGetters(["GetSkillPointsPerformance"]),
    ...mapGetters(["GetSkillPointsPursuasion"]),
    ...mapGetters(["GetSkillPointsReligion"]),
    ...mapGetters(["GetSkillPointsSleightofHand"]),
    ...mapGetters(["GetSkillPointsStealth"]),
    ...mapGetters(["GetSkillPointsSurvival"])
  },
  methods: {
    ...mapMutations(["SetSkillPoints"])
  },
  created: function() {
    let cache = [
      [this.GetClassProficiencyBonusPerLevel],
      [
        this.GetClassSavingThrowStrength,
        this.GetClassSavingThrowDexterity,
        this.GetClassSavingThrowConstitution,
        this.GetClassSavingThrowIntelligence,
        this.GetClassSavingThrowWisdom,
        this.GetClassSavingThrowCharisma
      ],
      [
        this.GetAbilityModifierStrength,
        this.GetAbilityModifierDexterity,
        this.GetAbilityModifierConstitution,
        this.GetAbilityModifierIntelligence,
        this.GetAbilityModifierWisdom,
        this.GetAbilityModifierCharisma
      ]
    ];
    this.SetSkillPoints(cache);
  }
};
</script>

<style>
.Str {
  transition: 0.3s;
}
.Dex {
  transition: 0.3s;
}
.Int {
  transition: 0.3s;
}
.Wis {
  transition: 0.3s;
}
.Cha {
  transition: 0.3s;
}
.Str:hover {
  background-color: rgba(255, 0, 0, 0.5) !important;
}
.Str:hover::before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  content: "";
  border: solid 2px;
}
.Str:hover::after {
  position: absolute;
  top: 10px;
  right:10px;
  padding-right: 5px;
  content: "Str";
  font-weight:bold;
}
.Dex:hover {
  background-color: rgba(255, 255, 0, 0.5) !important;
}
.Dex:hover::before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  content: "";
  border: solid 2px;
}
.Dex:hover::after {
  position: absolute;
  top: 10px;
  right:10px;
  padding-right: 5px;
  content: "Dex";
  font-weight:bold;
}
.Int:hover {
  background-color: rgba(0, 0, 255, 0.5) !important;
}
.Int:hover::before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  content: "";
  border: solid 2px;
}
.Int:hover::after {
  position: absolute;
  top: 10px;
  right:10px;
  padding-right: 5px;
  content: "Int";
  font-weight:bold;
}
.Wis:hover {
  background-color: rgba(128, 128, 128, 0.5) !important;
}
.Wis:hover::before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  content: "";
  border: solid 2px;
}
.Wis:hover::after {
  position: absolute;
  top: 10px;
  right:10px;
  padding-right: 5px;
  content: "Wis";
  font-weight:bold;
}
.Cha:hover {
  background-color: rgba(128, 0, 128, 0.5) !important;
}
.Cha:hover::before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  content: "";
  border: solid 2px;
}
.Cha:hover::after {
  position: absolute;
  top: 10px;
  right:10px;
  padding-right: 5px;
  content: "Cha";
  font-weight:bold;
}
</style>
