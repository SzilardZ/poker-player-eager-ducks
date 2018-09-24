package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject root = request.getAsJsonObject();
        JsonArray players = root.getAsJsonArray("players");
        System.err.println("Players: " + players);
        JsonPrimitive gameId = root.getAsJsonPrimitive("game_id");
        System.err.println("GameId : " + gameId);
        JsonPrimitive rounds = root.getAsJsonPrimitive("round");
        System.err.println("Rounds: HUHU" + rounds);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
