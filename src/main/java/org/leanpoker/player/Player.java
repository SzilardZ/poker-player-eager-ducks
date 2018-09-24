package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        System.err.println("hello***************#####################################");

        JsonObject root = request.getAsJsonObject();
        JsonArray players = root.getAsJsonArray("players");
        System.err.println(players);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
