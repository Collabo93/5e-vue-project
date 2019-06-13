import BackgroundRepository from "./HomeAPI/BackgroundRepository";


const repositories = {
  backgrounds: BackgroundRepository
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
