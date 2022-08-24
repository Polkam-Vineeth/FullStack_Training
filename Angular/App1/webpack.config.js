const path = require("path");
module.exports = {
  entry: "./main.js", // entry point
  output: {
    path: path.resolve(__dirname, "dist"), // o/p folder name
    filename: "main.bundle.js", // o/p filename
  },
  mode: "production",
};