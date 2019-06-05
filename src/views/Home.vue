<template>
    <b-container class="padding">
        <b-row>
            <b-col>
                <div class="setToMiddle">
                    <img src="@/assets/home-character-creation.jpg" class="home-pictures"/>
                </div>
                <p class="HomeMenuText">
                    Character creation
                </p>
            </b-col>
            <b-col>
                <div class="setToMiddle">
                    <img src="@/assets/home-items.jpg" class="home-pictures"/>
                </div>
                <p class="HomeMenuText">
                    Items
                </p>
            </b-col>
            <b-col>
                <div class="setToMiddle">
                    <img src="@/assets/home-creatures.jpg" class="home-pictures"/>
                </div>
                <p class="HomeMenuText">
                    Creatures
                </p>
            </b-col>
        </b-row>
   </b-container>
</template>

<script>
export default{
    name: "rwv-home"
}
</script>

<style>
    img.home-pictures{
        max-width:250px;
        border:solid 1px;
        border-color:black;
        box-shadow: 0 5px 10px
            rgba(154,160,185,.05), 0 15px 40px
            rgba(166,173,201,.2);
    }
    .setToMiddle{
        align:middle;
        display: flex; 
        align-items: center; 
        justify-content: center;
    }
    .HomeMenuText{
        text-align:center;
        font-size:18px;
    }
    .padding{
        padding:5em;
    }
</style>