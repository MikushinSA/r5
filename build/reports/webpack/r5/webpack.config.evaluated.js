{
  mode: 'production',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      'C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\js\\packages\\r5\\kotlin\\r5.js'
    ]
  },
  output: {
    path: 'C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\distributions',
    filename: [Function: filename],
    library: 'r5',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'source-map',
  ignoreWarnings: [
    /Failed to parse source map/
  ],
  devServer: {
    open: true,
    static: [
      'C:\\Users\\MacLay\\AppData\\Local\\Temp\\r5\\build\\processedResources\\js\\main'
    ]
  },
  stats: {
    warnings: false,
    errors: false
  }
}