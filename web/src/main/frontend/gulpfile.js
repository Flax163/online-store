var gulp = require('gulp');
var concat = require('gulp-concat');
var uglify = require('gulp-uglify');
var sourcemaps = require('gulp-sourcemaps');
var ngAnnotate = require('gulp-ng-annotate');
var embedTemplates = require('gulp-angular-embed-templates');
var autoprefixer = require('gulp-autoprefixer');

gulp.task('js-libs', function () {
    var files = [
        './bower_components/angular/angular.min.js',
        './bower_components/angular-ui-router/release/angular-ui-router.min.js',
        './bower_components/angularjs-datepicker/dist/angular-datepicker.min.js',
        './bower_components/angular-component-router/angular_1_router.js',
        './bower_components/jquery/dist/jquery.min.js',
        './bower_components/bootstrap/dist/js/bootstrap.min.js'
    ];
    return gulp.src(files)
        .pipe(sourcemaps.init())
        .pipe(uglify())
        .pipe(concat('libs.js'))
        .pipe(sourcemaps.write('./'))
        .pipe(gulp.dest('./dist/js'))
});

gulp.task('js', function () {
    var files = [
        'app/**/*.js'
    ];
    return gulp.src(files)
        .pipe(sourcemaps.init())
        .pipe(embedTemplates())
        .pipe(concat('application.js'))
        .pipe(ngAnnotate())
        .pipe(uglify())
        .pipe(sourcemaps.write('./'))
        .pipe(gulp.dest('./dist/js'))
});

gulp.task('start-page', function() {
    var files = [
        "app/index.html"
    ];
    return gulp.src(files)
        .pipe(concat('index.html'))
        .pipe(gulp.dest('./dist'));
});

gulp.task('css-libs', function () {
    var files = [
        './bower_components/bootstrap/dist/css/bootstrap.min.css',
        './app/theme.css'
    ];
    return gulp.src(files)
        .pipe(concat('libs.css'))
        .pipe(gulp.dest('./dist/css'));
});

gulp.task('copy-in-web', function (){
    var files = [
        'dist/**/*'
    ];
    return gulp.src(files)
        .pipe(gulp.dest('../webapp'))
});

gulp.task('build', ['js-libs', 'js', 'start-page', 'css-libs', 'copy-in-web']);

gulp.task('watch', function () {
    gulp.watch('./app/**/*', ['js']);
    gulp.watch('./sass/**/*.scss', ['sass']);
});

gulp.task('default', ['build', 'watch']);