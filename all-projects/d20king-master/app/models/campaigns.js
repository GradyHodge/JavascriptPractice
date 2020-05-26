const mongoose = require("mongoose");
const Schema = mongoose.Schema;

const campaignSchema = new Schema({
  name: { type: String, required: true },
  description: { type: String, required: true },
  location: { type: String, unique: true, required: true },
  homebrewRules: { type: Array },
  playerCharicters: { type: Array },
  storybook: {
    type: Schema.Types.ObjectId,
    ref: "Storybook",
  },
  createdAt: { type: String, required: true },
  updatedAt: { type: String },
});

const Campaign = mongoose.model("Campaign", campaignSchema);
module.exports = Campaign;
