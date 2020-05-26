import axios from "axios";

export default {
  // Use this as working boilerplate and copy code for new table in db

  ///// User CRUD \\\\\

  // Add a user
  addUser: function (userData) {
    console.log("Add user data: ", userData);
    return axios.post("/api/users", userData);
  },
  // Gets all users
  getUsers: function () {
    return axios.get("/api/users");
  },
  // Update info on a user
  updateUser: function (id, updateData) {
    console.log("Update user id and data: ", id, updateData);
    return axios.put("/api/users/" + id, updateData);
  },
  // Delete a user
  deleteUser: function (id) {
    console.log("Delete user with id: ", id);
    return axios.delete("/api/users/" + id);
  },
  // Sign in a user
  signInUser: function (signInData) {
    console.log("Sign in user data:", signInData);
    return axios.post("/api/users/signIn", signInData);
  },
  // Authenticate a user
  currentUser: function (token) {
    return axios.post("/api/users/current", token);
  },

  ///// Character CRUD \\\\\

  // Add a character
  addCharacter: function (characterData) {
    console.log("Add character data: ", characterData);
    return axios.post("/api/characters", characterData);
  },
  // Gets all characters
  getCharacters: function () {
    return axios.get("/api/characters");
  },
  // Update info on a character
  updateCharacter: function (id, updateData) {
    console.log("Update character id and data: ", id, updateData);
    return axios.put("/api/characters/" + id, updateData);
  },
  // Delete a character
  deleteCharacter: function (id) {
    console.log("Delete character with id: ", id);
    return axios.delete("/api/characters/" + id);
  },

  ///// Campaign CRUD \\\\\

  // Add a campaign
  addCampaign: function (campaignData) {
    console.log("Add campaign data: ", campaignData);
    return axios.post("/api/users", campaignData);
  },
  // Gets all users
  getCampaign: function () {
    return axios.get("/api/users");
  },
  // Update info on a campaign
  updateCampaign: function (id, updateData) {
    console.log("Update campaign id and data: ", id, updateData);
    return axios.put("/api/users/" + id, updateData);
  },
  // Delete a campaign
  deleteCampaign: function (id) {
    console.log("Delete campaign with id: ", id);
    return axios.delete("/api/users/" + id);
  },

  ///// Storybook CRUD \\\\\

  // Add a storybook
  addStorybook: function (storybookData) {
    console.log("Add storybook data: ", storybookData);
    return axios.post("/api/storybooks", storybookData);
  },
  // Gets all storybooks
  getStorybooks: function () {
    return axios.get("/api/storybooks");
  },
  // Update info on a storybook
  updateStorybook: function (id, updateData) {
    console.log("Update storybook id and data: ", id, updateData);
    return axios.put("/api/storybooks/" + id, updateData);
  },
  // Delete a storybook
  deleteStorybook: function (id) {
    console.log("Delete storybook with id: ", id);
    return axios.delete("/api/storybooks/" + id);
  }

};