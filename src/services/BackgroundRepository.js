import RepositoryHomeAPI from "./RepositoryHomeAPI";

const resource ="/backgrounds";
export default{
    get(){
        return RepositoryHomeAPI.get(`${resource}`);
    }
}
//need to make this differently