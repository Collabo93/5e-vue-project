import Repository from "./Repository";

const resource ="/backgrounds";
export default{
    get(){
        return Repository.get(`${resource}`);
    }
}