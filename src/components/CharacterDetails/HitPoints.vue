<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
        
        <p class="CharacterDetailOutput">{{GetClassProficiencyBonusPerLevel}}</p>
        <p class="CharacterDetailTitle">Hit Points</p>
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