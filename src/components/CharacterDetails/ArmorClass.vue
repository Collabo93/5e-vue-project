<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetClassProficiencyBonusPerLevel">
        
        <p class="CharacterDetailOutput">{{GetClassProficiencyBonusPerLevel}}</p>
        <p class="CharacterDetailTitle">Armor Class</p>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default{
    name:"RwvArmorClass",
    computed:{
        ...mapGetters(["GetClassProficiencyBonusPerLevel"])
    }
}
</script>