const state = {
    BaseAttributes: [
      {
        Strength:8,
        Dexterity:8,
        Constitution:8,
        Intelligence:8,
        Wisdom:8,
        Charisma:8
      }
    ]
  };
  
  const getters = {
    GetBaseAttributes: state => state.BaseAttributes
  };
  
  const actions = {};
  
  const mutations = {
      SetAbilityModifier(){
        let test= Math.floor((0/2)-5);
        alert(test);
      }

  };
  
  export default {
    state,
    getters,
    actions,
    mutations
  };