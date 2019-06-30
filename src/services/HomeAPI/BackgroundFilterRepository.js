import Repository from "./Repository";

const resource ="/backgrounds";
export default{
    get(backgroundSort, backgroundFilter){
        return Repository.get(`${resource}`+"/?sort="+backgroundSort+"&name="+backgroundFilter);
    }
}