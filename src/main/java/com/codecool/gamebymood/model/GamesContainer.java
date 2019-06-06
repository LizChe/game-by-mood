package com.codecool.gamebymood.model;

import java.util.Map;
import java.util.HashMap;

public class GamesContainer {

    private static final String ADVENTUROUS = "https://thewitcher.com/en/witcher3";
    private static final String COMPETITIVE = "http://onrushgame.com";
    private static final String LONELY = "https://www.ea.com/games/unravel/unravel-two";
    private static final String PATIENT = "https://www.crashbandicoot.com";
    private static final String THOUGHTFUL = "https://www.hellblade.com";
    private static final String WISE = "https://www.playstation.com/en-gb/games/knowledge-is-power-ps4";
    private static final String NO_CHOICE = "https://www.minecraft.net/en-us/";

    public Map<String, String> getGames() {
        Map<String, String> games = new HashMap<>();
        games.put("adventurous", ADVENTUROUS);
        games.put("competitive", COMPETITIVE);
        games.put("lonely", LONELY);
        games.put("patient", PATIENT);
        games.put("thoughtful", THOUGHTFUL);
        games.put("wise", WISE);
        games.put("no choice", NO_CHOICE);
        return games;
    }
}