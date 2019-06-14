import Repository from "./Repository";

const resource ="/classes";
export default{
    get(className, classLevel){
        return Repository.get(`${resource}`+"/"+className+"/level/"+classLevel);
    }
}