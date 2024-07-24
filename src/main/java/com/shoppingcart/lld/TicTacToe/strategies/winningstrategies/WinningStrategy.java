package com.shoppingcart.lld.TicTacToe.strategies.winningstrategies;

import com.shoppingcart.lld.TicTacToe.models.Board;
import com.shoppingcart.lld.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Move move, Board board);
}
