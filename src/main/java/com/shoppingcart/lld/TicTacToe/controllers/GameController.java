package com.shoppingcart.lld.TicTacToe.controllers;

import com.shoppingcart.lld.TicTacToe.exceptions.InvalidBotCountException;
import com.shoppingcart.lld.TicTacToe.exceptions.InvalidPlayerCountException;
import com.shoppingcart.lld.TicTacToe.models.Game;
import com.shoppingcart.lld.TicTacToe.models.GameState;
import com.shoppingcart.lld.TicTacToe.models.Player;
import com.shoppingcart.lld.TicTacToe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(playerList)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}