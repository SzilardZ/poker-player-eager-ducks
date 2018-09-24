package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import org.json.*;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        System.err.println("hello***************#####################################");

        JsonElement players = request.getAsJsonObject();
        System.err.println(players);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
