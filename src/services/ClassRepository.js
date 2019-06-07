import Repository from "./Repository";

const resource ="/classes";
export default{
    get(){
        return Repository.get(`${resource}`);
    }
}