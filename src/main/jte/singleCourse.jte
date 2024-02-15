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
<div>
    <h2>${page.getCourses().get(0).getName()}</h2>
    <h2>${page.getCourses().get(0).getDescription()}</h2>
</div>
</body>
</html>
