package com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies;

import com.shoppingcart.lld.TicTacToe.models.Board;
import com.shoppingcart.lld.TicTacToe.models.Move;

public interface BotwinningStrategy {
    Move makeMove(Board board);
}