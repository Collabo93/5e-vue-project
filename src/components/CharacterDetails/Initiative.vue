<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
        
        <p class="CharacterDetailOutput">{{GetClassProficiencyBonusPerLevel}}</p>
        <p class="CharacterDetailTitle">Initiative</p>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default{
    name:"RwvInitiative",
    computed:{
        ...mapGetters(["GetClassProficiencyBonusPerLevel"])
    }
}
</script>