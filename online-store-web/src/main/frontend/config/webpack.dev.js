var webpackMerge = require('webpack-merge');
var ExtractTextPlugin = require('extract-text-webpack-plugin');
var commonConfig = require('./webpack.common.js');
var helpers = require('./helpers');
var path = require('path');

module.exports = webpackMerge(commonConfig, {
    devtool: 'cheap-module-eval-source-map',

    output: {
        filename: '[name].js',
        chunkFilename: '[id].chunk.js',
        path: path.join(__dirname, 'dist')
    },

    plugins: [
        new ExtractTextPlugin('[name].css')
    ]
});