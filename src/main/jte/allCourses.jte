@import org.example.hexlet.CoursePage
@param CoursePage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${page.getHeader()}</title>
</head>
<body>
<h1>${page.getHeader()}</h1>
<ul>
    @for(var course : page.getCourses())
        <li><a href="/courses/${course.getId()}">${course.getName()}${course.getDescription()}</a></li>
    @endfor
</ul>
</body>
</html>
