import { RepositoryFactory } from "../../services/RepositoryFactoryHomeAPI";
const BackgroundRepository = RepositoryFactory.get("backgrounds");

const state = {
  dataBackground: [],
  BackgroundNames: [],
  Background: [{ name: String }, { url: String }]
};

const getters = {
  GetDataBackground: state => state.dataBackground,
  GetBackgroundNames: state => state.BackgroundNames,
  GetBackground: state => state.Background
};

const actions = {
  async fetchDataBackground({ commit }) {
    const { data } = await BackgroundRepository.get();
    commit("SetDataBackground", data);
    commit("SetBackgroundNames");
  },
  SetDataBackground({ commit }, SelectedBackground) {
    commit("SetBackgroundURL", SelectedBackground);
  }
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
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
