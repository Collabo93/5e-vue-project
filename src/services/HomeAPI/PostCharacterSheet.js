import Repository from "./Repository";

const resource ="/character";
export default{
    get(){
        return Repository.get(`${resource}`);
    }
}