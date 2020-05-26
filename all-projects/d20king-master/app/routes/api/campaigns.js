const router = require("express").Router();
const campaignController = require("../../controllers/campaigns");

// Matches with "/api/campaigns"
router
  .route("/")
  .get(campaignController.findAll)
  .post(campaignController.create);

// Matches with "/api/campaigns/:id"
router
  .route("/:id")
  .get(campaignController.findById)
  .put(campaignController.update)
  .delete(campaignController.remove);

module.exports = router;
