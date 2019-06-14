<template>
    <b-container class="padding">
        <b-row>
            <b-col>
                <RwvProficiencyBonus />
            </b-col>
        </b-row>
    </b-container>
</template>

<script>
import { mapGetters } from "vuex";

import RwvProficiencyBonus from "./CharacterDetails/ProficiencyBonus"

export default{
    name:"RwvCharacterDetails",
    components:{
        RwvProficiencyBonus
    },
    computed:{
        ...mapGetters(["GetClassAbilityScoreBonusesPerLevel"]),
        ...mapGetters(["GetClassProficiencyBonusPerLevel"])
    }
}
</script>
