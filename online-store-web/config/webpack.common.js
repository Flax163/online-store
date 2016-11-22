const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const ExtractTextPlugin = require('extract-text-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');

const helpers = require('./helpers');

module.exports = {
    entry: {
        'polyfills': './src/main/typescript/polyfills.ts',
        'vendor': './src/main/typescript/vendor.ts',
        'app': './src/main/typescript/main.ts'
    },

    resolve: {
        extensions: ['', '.js', '.ts', '.css', '.html']
    },

    module: {
        loaders: [
            {
                test: /\.ts$/,
                loaders: ['awesome-typescript-loader', 'angular2-template-loader']
            },
            {
                test: /\.html$/,
                loader: 'raw-loader'
            },
            {
                test: /\.(png|jpe?g|gif|svg|woff|woff2|ttf|eot|ico)$/,
                loader: 'file?name=assets/[name].[hash].[ext]'
            },
            {
                test: /\.css$/,
                exclude: helpers.root('src/main/typescript/'),
                loader: ExtractTextPlugin.extract('style', 'css?sourceMap')
            },
            {
                test: /\.css$/,
                include: helpers.root('resource/css'),
                loader: 'raw-loader'
            }
        ]
    },

    plugins: [
        new webpack.optimize.CommonsChunkPlugin({
            name: ['app', 'vendor', 'polyfills']
        }),

        new HtmlWebpackPlugin({
            template: 'src/main/typescript/index.html'
        }),
        new webpack.ProvidePlugin({
            jQuery: "jquery",
            $: 'jquery',
            jquery: 'jquery'
        }),
        new CopyWebpackPlugin([{
            from: 'resources/images/',
            to: 'resources/images/'
        },
        {
            from: 'resources/WEB-INF/',
            to: 'WEB-INF/'
        }])
    ]
};