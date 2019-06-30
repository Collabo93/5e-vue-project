import BackgroundRepository from "./HomeAPI/BackgroundRepository";
import GetBackgroundFromURL from "./HomeAPI/GetBackgroundFromURL";
import BackgroundFilterRepository from "./HomeAPI/BackgroundFilterRepository";
import GetBackgroundInfoRepository from "./HomeAPI/GetBackgroundInfoRepository";

const repositories = {
  backgrounds: BackgroundRepository,
  createdURL: GetBackgroundFromURL,
  backgroundFilter: BackgroundFilterRepository,
  backgroundInfo: GetBackgroundInfoRepository
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
