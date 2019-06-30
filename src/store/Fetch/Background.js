import { RepositoryFactory } from "../../services/RepositoryFactoryHomeAPI";
const BackgroundRepository = RepositoryFactory.get("backgrounds");
const GetBackgroundFromURL = RepositoryFactory.get("createdURL");
const BackgroundFilterRepository = RepositoryFactory.get("backgroundFilter");
const GetBackgroundInfoRepository = RepositoryFactory.get("backgroundInfo");

const state = {
  dataBackground: [],
  BackgroundNames: [],
  Background: [{ name: String }, { url: String }],

  BackgroundDetails:[],
  BackgroundProficiencies:[],

  BackgroundsFiltered:[],

  BackgroundDetail:[]
};

const getters = {
  GetDataBackground: state => state.dataBackground,
  GetBackgroundNames: state => state.BackgroundNames,
  GetBackground: state => state.Background,
  GetBackgroundProficiencies: state => state.BackgroundProficiencies,

  GetBackgroundDetail: state => state.BackgroundDetail
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

  async FetchBackgroundFiltered({commit}, Info){
    const { data } = await BackgroundFilterRepository.get(Info[0], Info[1]);
    commit("SetBackgroundsFiltered", data);
  },
  // 0 = name
  // 1 = filter

  async FetchBackground({commit}, BackgroundName){
    const { data } = await GetBackgroundInfoRepository.get(BackgroundName);
    commit("SetBackgroundDetail", data);
  },
};

const mutations = {
  SetDataBackground: (state, dataBackground) => (state.dataBackground = dataBackground),
  SetBackgroundNames() {
    state.BackgroundNames = [];
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
    data.skill_proficiency.from.forEach(element => {
      state.BackgroundProficiencies.push(element["name"]);
    });
  },

  SetBackgroundsFiltered(state, data){
    state.BackgroundsFiltered = data;
    state.BackgroundNames = [];
    state.BackgroundsFiltered.forEach(element => {
      state.BackgroundNames.push(element["name"]);
    });
  },
  SetBackgroundDetail(state, data){
    state.BackgroundDetail = data;
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
