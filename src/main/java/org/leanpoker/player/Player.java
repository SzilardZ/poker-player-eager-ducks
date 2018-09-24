package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonParser parser = new JsonParser();
        JsonObject o = parser.parse("{\"a\": \"A\"}").getAsJsonObject();
        System.out.println(o);
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
