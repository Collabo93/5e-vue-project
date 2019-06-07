import ClassRepository from "./ClassRepository";

const repositories = {
  classes: ClassRepository
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
