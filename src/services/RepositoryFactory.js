import ClassRepository from "./ClassRepository";
import RaceRepository from "./RaceRepository";

const repositories = {
  classes: ClassRepository,
  races: RaceRepository
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
