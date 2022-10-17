import axios from "axios";
import {API_HEROKU} from "../constant";

const USERS_REST_API_URL = API_HEROKU + '/confirmPage';

class ConfirmService{

    getUsers(){
        return axios.get(USERS_REST_API_URL)
    }

    postUsers(){
        return axios.post(USERS_REST_API_URL, "test");
    }
    
}

export default new ConfirmService()