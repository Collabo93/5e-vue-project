<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetRaceSpeed">
        
        <p class="CharacterDetailOutput">{{GetRaceSpeed}}</p>
        <p class="CharacterDetailTitle">Speed</p>
    </div>
</template>

<script>
import { mapGetters } from "vuex";

export default{
    name:"RwvSpeed",
    computed:{
        ...mapGetters(["GetRaceSpeed"])
    }
}
</script>