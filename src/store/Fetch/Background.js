import { RepositoryFactory } from "../../services/RepositoryFactoryHomeAPI";
const BackgroundRepository = RepositoryFactory.get("backgrounds");
const GetBackgroundFromURL = RepositoryFactory.get("createdURL");

const state = {
  dataBackground: [],
  BackgroundNames: [],
  Background: [{ name: String }, { url: String }],

  BackgroundDetails:[],
  BackgroundProficiencies:[]
};

const getters = {
  GetDataBackground: state => state.dataBackground,
  GetBackgroundNames: state => state.BackgroundNames,
  GetBackground: state => state.Background,
  GetBackgroundProficiencies: state => state.BackgroundProficiencies
};

const actions = {
  async fetchDataBackground({ commit }) {
    const { data } = await BackgroundRepository.get();
    commit("SetDataBackground", data);
    commit("SetBackgroundNames");
  },
  SetDataBackground({ commit }, SelectedBackground) {
    commit("SetBackgroundURL", SelectedBackground);
  },
  async FetchBackgroundInfo({ commit }) {
    const { data } = await GetBackgroundFromURL.get(state.Background["url"]);
    commit("SetBackgroundProficiencies", data);
  },
};

const mutations = {
  SetDataBackground: (state, dataBackground) => (state.dataBackground = dataBackground),
  SetBackgroundNames() {
    for (var index = 0; index < state.dataBackground["count"]; index++) {
      state.BackgroundNames.push(state.dataBackground["results"][index]["name"]);
    }
  },
  SetBackgroundURL(state, SelectedBackground) {
    for (let index = 0; index < state.dataBackground["count"]; index++) {
      if (SelectedBackground == state.BackgroundNames[index]) {
        state.Background["url"] = state.dataBackground["results"][index]["url"];
        break;
      }
    }
    state.Background["name"] = SelectedBackground;
  },
  SetBackgroundProficiencies(state, data){
    state.BackgroundDetails = data;
    //alert(data.skill_proficiency.from[0]["name"]);
    data.skill_proficiency.from.forEach(element => {
      state.BackgroundProficiencies.push(element["name"]);
    });
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
