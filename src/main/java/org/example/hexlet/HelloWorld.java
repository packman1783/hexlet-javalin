package org.example.hexlet;

import io.javalin.Javalin;

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

        app.start(7070);
        //завершить запрос ctrl + c
    }
}
