import Repository from "./Repository";

const resource ="/races";
export default{
    get(){
        return Repository.get(`${resource}`);
    }
}