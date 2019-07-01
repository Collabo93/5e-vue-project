import Repository from "./Repository";

const resource ="/classes";
export default{
    get(CharacterNr){
        return Repository.get(`${resource}`+"/"+CharacterNr);
    }
}