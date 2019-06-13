import axios from "axios";

const baseDomain = "http://localhost:8080/5e-Database";
const baseURL = `${baseDomain}/resources`;

export default axios.create({
  baseURL,
  headers:{
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*'
  }
});