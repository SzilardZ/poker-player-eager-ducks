package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject root = request.getAsJsonObject();
        JsonArray players = root.getAsJsonArray("players");
        System.err.println("Players: " + players);
        JsonArray rounds = root.getAsJsonArray("round");
        System.err.println("Rounds: " + rounds);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
