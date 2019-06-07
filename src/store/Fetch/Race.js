import { RepositoryFactory } from "../../services/RepositoryFactory";
const RaceRepository = RepositoryFactory.get("races");

const state = {
  dataRace: [],
  RaceNames: [],
  Race: [{ name: String }, { url: String }]
};

const getters = {
  GetDataRace: state => state.dataRace,
  GetRaceNames: state => state.RaceNames,
  GetRace: state => state.Race
};

const actions = {
  async fetchDataRace({ commit }) {
    const { data } = await RaceRepository.get();
    commit("SetDataRace", data);
    commit("SetRaceNames");
  },
  SetDataRace({ commit }, SelectedRace) {
    commit("SetRaceURL", SelectedRace);
  }
};

const mutations = {
  SetDataRace: (state, dataRace) => (state.dataRace = dataRace),
  SetRaceNames() {
    for (var index = 0; index < state.dataRace["count"]; index++) {
      state.RaceNames.push(state.dataRace["results"][index]["name"]);
    }
  },
  SetRaceURL(state, SelectedRace) {
    for (let index = 0; index < state.dataRace["count"]; index++) {
      if (SelectedRace == state.RaceNames[index]) {
        state.Race["url"] = state.dataRace["results"][index]["url"];
        break;
      }
    }
    state.Race["name"] = SelectedRace;
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};
