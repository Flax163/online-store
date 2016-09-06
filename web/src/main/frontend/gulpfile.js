var gulp = require('gulp');
const concat = require('gulp-concat');
const uglify = require('gulp-uglify');
const sourcemaps = require('gulp-sourcemaps');
const ngAnnotate = require('gulp-ng-annotate');
const embedTemplates = require('gulp-angular-embed-templates');
const autoprefixer = require('gulp-autoprefixer');
const clean = require('gulp-clean');

gulp.task('clean', function () {
    const files = ["dist"];
    return gulp.src(files, {read: false})
        .pipe(clean())
});

gulp.task('js-libs', function () {
    const files = [
        './bower_components/angular/angular.min.js',
        './bower_components/angular-resource/angular-resource.min.js',
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
    const files = [
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
    const files = [
        "app/index.html"
    ];
    return gulp.src(files)
        .pipe(concat('index.html'))
        .pipe(gulp.dest('./dist'));
});

gulp.task('css-libs', function () {
    const files = [
        './bower_components/bootstrap/dist/css/bootstrap.min.css',
        './app/theme.css'
    ];
    return gulp.src(files)
        .pipe(concat('libs.css'))
        .pipe(sourcemaps.write('./'))
        .pipe(gulp.dest('./dist/css'));
});

gulp.task('copy-in-web', function (){
    const files = [
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

gulp.task('default', ['clean','build', 'watch']);