const router = require("express").Router();
const userRoutes = require("./users");
const characterRoutes = require("./characters");
const storybookRoutes = require("./storybooks");
const campaignRoutes = require("./campaigns");

// Index serves as directory for routes

// User routes
router.use("/users", userRoutes);

// Character routes
router.use("/characters", characterRoutes);

// Storybook routes
router.use("/storybooks", storybookRoutes);

// Campaign routes
router.use("/campaigns", campaignRoutes);

module.exports = router;
