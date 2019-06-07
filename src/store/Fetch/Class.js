import { RepositoryFactory } from "../../services/RepositoryFactory";
const ClassRepository = RepositoryFactory.get("classes");

const state = {
  dataClass: [],
  ClassNames: [],
  Class: [{ name: String }, { url: String }]
};

const getters = {
  GetDataClass: state => state.dataClass,
  GetClassNames: state => state.ClassNames,
  GetClass: state => state.Class
};

const actions = {
  async fetchDataClass({ commit }) {
    const { data } = await ClassRepository.get();
    commit("SetDataClass", data);
    commit("SetClassNames");
  },
  SetDataClass({ commit }, SelectedClass) {
    commit("SetClassURL", SelectedClass);
  }
};

const mutations = {
  SetDataClass: (state, dataClass) => (state.dataClass = dataClass),
  SetClassNames() {
    for (var index = 0; index < state.dataClass["count"]; index++) {
      state.ClassNames.push(state.dataClass["results"][index]["name"]);
    }
  },
  SetClassURL(state, SelectedClass) {
    for (let index = 0; index < state.dataClass["count"]; index++) {
      if (SelectedClass == state.ClassNames[index]) {
        state.Class["url"] = state.dataClass["results"][index]["url"];
        break;
      }
    }
    state.Class["name"] = SelectedClass;
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
