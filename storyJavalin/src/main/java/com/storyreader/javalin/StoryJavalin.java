package com.storyreader.javalin;

import io.javalin.Javalin;

public class StoryJavalin {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/stories", StoryController::getAllStories);

        app.get("/stories/:special", StoryController::getSpecialStory);

    }
}