<template>
  <div class="Strength">
    <div class="AtributeIncDec">
      <b-button :pressed.sync="IncrementPressed" variant="outline-success" class="increment">^</b-button>
      <br>
      <b-button :pressed.sync="DecrementPressed" variant="outline-success" class="decrement">^</b-button>
    </div>

    <div class="AttributeFrame padding">
      <p class="AttributeTitel">Strength</p>
      <p>{{CurrentBaseAttribute}}</p>
      <p>{{GetAbilityModifier}}</p>
    </div>
  </div>
</template>

<script>
import { mapGetters, mapMutations } from "vuex";

export default {
  name: "RwvStrength",
  data() {
    return {
      IncrementPressed: false,
      DecrementPressed: false,
      CurrentBaseAttribute: 0
    };
  },
  computed: {
    ...mapGetters(["GetCharacterSheet"]),
    ...mapGetters(["GetAbilityModifier"])
  },
  methods: {
    ...mapMutations(["SetAbilityModifier"]),
    ...mapMutations(["SetAttributeStrength"])
  },
  created: function() {
    //alert(this.GetCharacterSheet.Attributes[0].Strength);
    this.CurrentBaseAttribute = this.GetCharacterSheet.Attributes[0].Strength;
    this.SetAbilityModifier();
  },
  watch: {
    IncrementPressed: function() {
      this.CurrentBaseAttribute += 1;
      this.SetAttributeStrength(this.CurrentBaseAttribute);
      this.SetAbilityModifier();
    },
    DecrementPressed: function() {
      this.CurrentBaseAttribute -= 1;
      this.SetAttributeStrength(this.CurrentBaseAttribute);
      this.SetAbilityModifier();
    }
  }
};
</script>
