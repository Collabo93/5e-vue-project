import axios from "axios";

const baseDomain = "http://www.dnd5eapi.co";
const baseURL = `${baseDomain}/api`;

export default axios.create({
  baseURL
  //Header?
});
