<template>
    <b-container>
        <div v-for="(Proficiencies, index) in GetClassProficiencieSkillChoices" :key="index">
            <b-row>
                <b-col md="12">
                    <p>Chooce Proficiencies 0/{{GetClassProficiencieSkillChoicesNumber[index]}}</p>
                </b-col>
            </b-row>
            <b-row>
                <b-col md="3" class="proficiencyRow" v-for="Proficiencie in Proficiencies" :key="Proficiencie.id">
                    <p>{{Proficiencie[0]}}</p>
                </b-col>
            </b-row>
            <br>
            <br>
        </div>
        <b-row>
            
        </b-row>
    </b-container>
</template>

<script>
import { mapGetters } from 'vuex';

export default {
    name:"RwvRaceSkillChoice",
    computed:{
        ...mapGetters(["GetClassProficiencieSkillChoices"]),
        ...mapGetters(["GetClassProficiencieSkillChoicesNumber"])
    }
}
</script>

<style>

.proficiencyRow p{
    background-color: rgba(51, 51, 51, 0.3)!important;
    color: white;
    padding: 5px;
    border: solid 1px;
    height: 100px;
    border-radius: 5px;
}
.proficiencyRow p{
    transition: .4s;
}
.proficiencyRow p:hover{
    background-color: #333!important;
    color: white;
    transform: scale(1.1);
    box-shadow: 0 10px 10px 
}
</style>



