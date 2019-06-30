import Repository from "./Repository";

const resource ="/backgrounds";
export default{
    get(BackgroundName){
        return Repository.get(`${resource}`+"/"+BackgroundName);
    }
}