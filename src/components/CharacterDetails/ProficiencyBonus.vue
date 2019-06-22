<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
        <div class="InformationDiv">
            <div class="Information">
                <p class="InformationValue">{{GetClassProficiencyBonusPerLevel}}</p>
                <p class="InformationTitle">Proficiency Bonus</p>
            </div>
        </div>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default{
    name:"RwvProficiencyBonus",
    computed:{
        ...mapGetters(["GetClassProficiencyBonusPerLevel"])
    }
}
</script>
<style>
.ProficiencyBonus p{
    size:40px
}
</style>
