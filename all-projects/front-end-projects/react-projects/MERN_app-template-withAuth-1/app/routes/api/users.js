const router = require("express").Router();
const userController = require("../../controllers/users");

// Matches with "/api/users"
router.route("/")
  .get(userController.findAll)
  .post(userController.create);

// Matches with "/api/users/:id"
router
  .route("/:id")
  .get(userController.findById)
  .put(userController.update)
  .delete(userController.remove);

router
  .route("/current")
  .post(userController.currentUser);

router
  .route("/signIn")
  .post(userController.signInUser);

module.exports = router;