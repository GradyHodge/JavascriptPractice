const mongoose = require("mongoose");
const Schema = mongoose.Schema;

const characterSchema = new Schema({
  _userId: {
    type: Schema.Types.ObjectId,
    required: true,
    ref: "User",
  },
  name: { type: String, required: true },
  class: { type: String, required: true },
  race: { type: String, required: true },
  image: { type: Buffer },
  backstory: { type: String },
  journeyDiary: { type: Array },
  level: { type: Number, default: 1 },
  xp: { type: Number, default: 0 },
  charisma: { type: Number, default: 0 },
  wisdom: { type: Number, default: 0 },
  strength: { type: Number, default: 0 },
  dexterity: { type: Number, default: 0 },
  constitution: { type: Number, default: 0 },
  inventory: { type: Array, default: [] },
  cp: { type: Number, default: 0 },
  sp: { type: Number, default: 0 },
  gp: { type: Number, default: 0 },
  ep: { type: Number, default: 0 },
  pp: { type: Number, default: 0 },
  spells: { type: Array, default: [] },
  cantrips: { type: Array, default: [] },
  specialAbilities: { type: Array, default: [] },
  movementSpeed: { type: Number, default: 0 },
  createdAt: { type: String, required: true },
  updatedAt: { type: String },
});

const Character = mongoose.model("Character", characterSchema);
module.exports = Character;
