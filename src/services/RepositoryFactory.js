import ClassRepository from "./ClassRepository";
import RaceRepository from "./RaceRepository";
import BackgroundRepository from "./BackgroundRepository";

const repositories = {
  classes: ClassRepository,
  races: RaceRepository,
  backgrounds: BackgroundRepository
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
