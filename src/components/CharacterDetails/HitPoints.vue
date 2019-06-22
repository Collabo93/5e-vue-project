<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
        <div class="InformationDiv">
            <div class="Information">
                <p class="InformationValue">{{GetClassProficiencyBonusPerLevel}}</p>
                <p class="InformationTitle">Hit Points</p>
            </div>
        </div>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default{
    name:"RwvHitPoints",
    computed:{
        ...mapGetters(["GetClassProficiencyBonusPerLevel"])
    }
}
</script>