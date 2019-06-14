import ClassRepository from "./DnDAPI/ClassRepository";
import RaceRepository from "./DnDAPI/RaceRepository";
import DataFromURL from "./DnDAPI/GetDataFromURL";
import classLevelInfo from "./DnDAPI/ClassLevelInfoRepository";

const repositories = {
  classes: ClassRepository,
  races: RaceRepository,
  createdURL: DataFromURL,
  LevelInfo: classLevelInfo
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
