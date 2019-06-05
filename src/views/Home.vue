<template>
   <b-container>
    <b-row>
        <b-col>
            <img src="@/assets/home-character-creation.jpg" class="home-pictures"/>
        </b-col>
        <b-col>
            <img src="@/assets/home-items.jpg" class="home-pictures"/>
        </b-col>
        <b-col>
            <img src="@/assets/home-creatures.jpg" class="home-pictures"/>
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
        text-align:center;
        align:middle;
        
    }
</style>