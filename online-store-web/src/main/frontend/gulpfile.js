var gulp = require('gulp');

gulp.task('copy-in-production', function() {
    const files = [
        'dist/**/*'
    ];

    return gulp.src(files)
        .pipe(gulp.dest('../webapp'));
});

//TODO: hack need use webpack
gulp.task('copy-resources', function() {
    const resources = [
        'resources/**/*'
    ];
    return gulp.src(resources)
        .pipe(gulp.dest('../webapp'));
});

gulp.task('build', ['copy-in-production', 'copy-resources']);

gulp.task('default', ['build']);