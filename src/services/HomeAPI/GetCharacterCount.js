import Repository from "./Repository";

const resource ="/classes/CharacterCount";
export default{
    get(){
        return Repository.get(`${resource}`);
    }
}