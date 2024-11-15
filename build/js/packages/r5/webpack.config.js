let config = {
  mode: 'production',
  resolve: {
    modules: [
      "node_modules"
    ]
  },
  plugins: [],
  module: {
    rules: []
  }
};

// entry
config.entry = {
    main: ["C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\js\\packages\\r5\\kotlin\\r5.js"]
};

config.output = {
    path: "C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\distributions",
    filename: (chunkData) => {
        return chunkData.chunk.name === 'main'
            ? "r5.js"
            : "r5-[name].js";
    },
    library: "r5",
    libraryTarget: "umd",
    globalObject: "this"
};

// source maps
config.module.rules.push({
        test: /\.js$/,
        use: ["source-map-loader"],
        enforce: "pre"
});
config.devtool = 'source-map';
config.ignoreWarnings = [/Failed to parse source map/]

// dev server
config.devServer = {
  "open": true,
  "static": [
    "C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\processedResources\\js\\main"
  ]
};

// noinspection JSUnnecessarySemicolon
;(function(config) {
    const tcErrorPlugin = require('kotlin-test-js-runner/tc-log-error-webpack');
    config.plugins.push(new tcErrorPlugin())
    config.stats = config.stats || {}
    Object.assign(config.stats, config.stats, {
        warnings: false,
        errors: false
    })
})(config);
// save evaluated config file
;(function(config) {
    const util = require('util');
    const fs = require('fs');
    const evaluatedConfig = util.inspect(config, {showHidden: false, depth: null, compact: false});
    fs.writeFile("C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\reports\\webpack\\r5\\webpack.config.evaluated.js", evaluatedConfig, function (err) {});
})(config);

module.exports = config
