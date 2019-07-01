import { RepositoryFactory } from "../../services/RepositoryFactoryHomeAPI";
const GetCharacterCount = RepositoryFactory.get("getCharacterCount");
const GetCharacter = RepositoryFactory.get("getCharacter");

const state = {
    ClassCount: Int32Array,
    Character:[]
  };
  
  const getters ={
    GetClassCount: state => state.ClassCount,
    GetCharacter: state => state.Character
  };

  const actions = {
    async FetchCharacterCount({ commit }) {
      const {data} = await GetCharacterCount.get();
      commit("SetCharacterCount", data);
    },

    async FetchCaracter({ commit }, index) {
        const {data} = await GetCharacter.get(index);
        commit("SetCharacter", data);
      },
  };
  
  const mutations = {
    SetCharacterCount(state, data){
        state.ClassCount = data["counter"];
    },

    SetCharacter(state, data){
        state.Character = data;
    }
  };
  
  export default {
    state,
    getters,
    actions,
    mutations
  };
  

