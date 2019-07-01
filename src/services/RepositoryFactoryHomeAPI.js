import BackgroundRepository from "./HomeAPI/BackgroundRepository";
import GetBackgroundFromURL from "./HomeAPI/GetBackgroundFromURL";
import BackgroundFilterRepository from "./HomeAPI/BackgroundFilterRepository";
import GetBackgroundInfoRepository from "./HomeAPI/GetBackgroundInfoRepository";
import PostCharacterSheet from "./HomeAPI/PostCharacterSheet";
import GetCharacterCount from "./HomeAPI/GetCharacterCount";
import GetCharacter from "./HomeAPI/GetCharacter"

const repositories = {
  backgrounds: BackgroundRepository,
  createdURL: GetBackgroundFromURL,
  backgroundFilter: BackgroundFilterRepository,
  backgroundInfo: GetBackgroundInfoRepository,
  postCharacter:PostCharacterSheet,
  getCharacterCount:GetCharacterCount,
  getCharacter:GetCharacter
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
