<template>
    <div class="ProficiencyBonus">
        {{GetClassProficiencyBonusPerLevel}}
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