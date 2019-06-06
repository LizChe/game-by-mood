package com.codecool.gamebymood.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codecool.gamebymood.model.GamesContainer;

@WebServlet(name = "gameByMood", urlPatterns = {"/gamebymood"})
public class GamesServlet extends HttpServlet {

    private GamesContainer gamesContainer = new GamesContainer();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mood = request.getParameter("mood");
        Map<String, String> games = gamesContainer.getGames();

        if (mood == null) {
            response.sendRedirect(games.get("no choice"));
        }

        for (Map.Entry<String, String> entry: games.entrySet()) {
            if (entry.getKey().equals(mood)) {
                response.sendRedirect(entry.getValue());
            }
        }
    }
}