const db = require("../models");
const moment = require("moment");

// Defining methods for the campaignController
module.exports = {
  findAll: function (req, res) {
    console.log("Find all characters request.");
    db.Storybook.find(req.query)
      .then((dbStorybook) => res.json(dbStorybook))
      .catch((err) => res.status(422).json(err));
  },
  findById: function (req, res) {
    console.log("Find storybook by id request.");
    // If a request parameter has an id search db
    if (req.params.id) {
      console.log(`Find by id ${req.params.id}`);
      db.Storybook.findById(req.params.id)
        .then((dbStorybook) => res.json(dbStorybook))
        .catch((err) => res.status(422).json(err));
    }
    // If no id present return custom error
    else {
      console.log("findById error");
      res.send({
        message: "There is no id present in your request.",
        info: { givenId: req.params.id },
      });
    }
  },
  create: function (req, res) {
    console.log("Create storybook request.");
    // Check to see request actually has a body with values
    if (Object.keys(req.body).length) {
      // Use the backend runtime to handle created at timestamp
      Object.assign(req.body, {
        createdAt: moment().format("dddd, MMMM Do YYYY, h:mm:ss a"),
      });

      db.Storybook.create(req.body)
        .then((dbStorybook) => res.json(dbStorybook))
        .catch((err) => res.status(422).json(err));
    }
    // If there is not values in request body send custom error
    else {
      res.send({
        message: "There is no data in request body.",
        info: {
          givenData: req.body,
        },
      });
    }
  },
  update: function (req, res) {
    console.log("Update storybook request.");
    // If the request does not have an id param or request body return a custom error
    if (!req.params.id || req.body === {}) {
      console.log("Missing data in storybook update request.");
      res.send({
        message: "There is missing data in your request.",
        info: {
          givenId: req.params.id,
          givenData: req.body,
        },
      });
    } else {
      // Use the backend runtime to handle updatedAt timestamp
      Object.assign(req.body, {
        updatedAt: moment().format("dddd, MMMM Do YYYY, h:mm:ss a"),
      });

      console.log(
        "Find one storybook and update request.",
        req.params.id,
        req.body
      );
      db.Storybook.findOneAndUpdate({ _id: req.params.id }, req.body)
        .catch((err) =>
          res.send({ message: "findOneAndUpdate hit an error", info: err })
        )
        .then((dbStorybook) => res.json(dbStorybook))
        .catch((err) => res.status(422).json(err));
    }
  },
  remove: function (req, res) {
    console.log("Remove storybook request.");
    // If a id is present then run delete
    if (req.params.id) {
      db.Storybook.findById(req.params.id)
        .then((dbStorybook) => dbStorybook.remove())
        .catch((err) =>
          res.send({
            message: "The id submitted does not match with any in db.",
            data: { givenId: req.params.id },
          })
        )
        .then((dbStorybook) => res.json(dbStorybook))
        .catch((err) => res.status(422).json(err));
    }
    // Otherwise return custom error
    else {
      res.send({
        message: "There is no id present in your request.",
        info: { givenId: req.params.id },
      });
    }
  },
};
