package com.storyreader.javalin;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public final class StoryController {

    private StoryController(){}

    static String[] availableStories = {"Moby Dick", "Tell Tale Heart", "Huckleberry Finn"};

    public static void getAllStories(@NotNull Context context) {
        context.json(availableStories);
    }

    public static void getSpecialStory(Context context) {
        for (String story : availableStories){
            if (story.contains(context.pathParam("special"))){
                context.result(story);
                return;
            }
        }
        context.result("No story found :(" );
    }
}