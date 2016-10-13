var gulp = require('gulp');
gulp.task('copy-in-production', function() {
    const files = [
        'dist/**/*'
    ];

    return gulp.src(files)
        .pipe(gulp.dest('../webapp'));
});

gulp.task('build', ['copy-in-production']);

gulp.task('default', ['build']);