const mongoose = require("mongoose");
const Schema = mongoose.Schema;

const storybookSchema = new Schema({
  name: { type: String, required: true },
  description: { type: String, required: true },
  location: { type: String, unique: true, required: true },
  genre: { type: String, required: true },
  acts: { type: Array },
  createdAt: { type: String, required: true },
  updatedAt: { type: String },
});

const Storybook = mongoose.model("Storybook", storybookSchema);
module.exports = Storybook;
