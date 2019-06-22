<template>
    <div class="ProficiencyBonus CharacterDetail" v-if="GetRaceSpeed">
        <div class="InformationDiv">
            <div class="Information">
                <p class="InformationValue">{{GetRaceSpeed}}</p>
                <p class="InformationTitle">Speed</p>
            </div>
        </div>
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