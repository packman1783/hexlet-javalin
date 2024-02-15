package org.example.hexlet;

import io.javalin.Javalin;

import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // запрос http://localhost:7070/users
        app.get("/users", ctx -> ctx.result("GET /users"));
        app.post("/users", ctx -> ctx.result("POST /users"));

        // запрос http://localhost:7070/hello?name=jon
        app.get("/hello", ctx -> {
            String name = ctx.queryParam("name");
            if (name != null) {
                ctx.result("Hello" + name + "!");
            } else {
                ctx.result("Hello, World!");
            }
        });

        // запрос http://localhost:7070/users/123/post/456
        app.get("/users/{id}/post/{postId}", ctx -> {
            String userId = ctx.pathParam("id");
            String postId = ctx.pathParam("postId");
            ctx.result("User ID: " + userId + ", Post ID: " + postId);
        });

        //запрос http://localhost:7070/courses/0 or 1 or 2
        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var courseId = Integer.parseInt(id);
            var courses = CourseList.createSampleCourseList();
            var header = "Programming courses";
            var course = courses.get(courseId); // Получаем курс по его индексу
            var page = new CoursePage(Collections.singletonList(course), header); // Создаем страницу только для одного курса
            ctx.render("index.jte", Collections.singletonMap("page", page));
        });

        app.start(7070);
        //завершить запрос ctrl + c
    }
}
