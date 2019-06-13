import ClassRepository from "./DnDAPI/ClassRepository";
import RaceRepository from "./DnDAPI/RaceRepository";
import DataFromURL from "./DnDAPI/GetDataFromURL";

const repositories = {
  classes: ClassRepository,
  races: RaceRepository,
  createdURL: DataFromURL
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
