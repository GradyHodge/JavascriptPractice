const router = require("express").Router();
const storybookController = require("../../controllers/storybooks");

// Matches with "/api/storybooks"
router
  .route("/")
  .get(storybookController.findAll)
  .post(storybookController.create);

// Matches with "/api/storybooks/:id"
router
  .route("/:id")
  .get(storybookController.findById)
  .put(storybookController.update)
  .delete(storybookController.remove);

module.exports = router;
