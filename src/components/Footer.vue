<template>
  <footer>
    <hr>
    <b-container>
      <b-row>
        <b-col>
          <p>
            Wizards of the Coast, Dungeons & Dragons, D&D, and their logos are trademarks of Wizards of the Coast LLC in the United States and other countries.
            © 2017 Wizards. All Rights Reserved. bestWebsiteWorld.com is not affiliated with, endorsed, sponsored, or specifically approved by Wizards of the Coast LLC.
          </p>
        </b-col>
      </b-row>
    </b-container>
  </footer>
</template>

<script>
export default {
  name: "RwvFooter"
};
</script>

<style>
footer {
  position: relative;
   bottom:0;
   width:100%;
   font-size: 14px;
   text-align: center;
   
}
footer p{
  padding-top:20px;
}
.ConstructionIMG {
  max-width: 250px;
}
</style>
