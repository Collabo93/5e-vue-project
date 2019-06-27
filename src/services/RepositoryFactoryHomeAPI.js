import BackgroundRepository from "./HomeAPI/BackgroundRepository";
import GetBackgroundFromURL from "./HomeAPI/GetBackgroundFromURL";

const repositories = {
  backgrounds: BackgroundRepository,
  createdURL: GetBackgroundFromURL
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
