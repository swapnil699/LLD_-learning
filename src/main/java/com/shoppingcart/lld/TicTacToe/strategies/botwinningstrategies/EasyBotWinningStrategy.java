package com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies;


import com.shoppingcart.lld.TicTacToe.models.Board;
import com.shoppingcart.lld.TicTacToe.models.Cell;
import com.shoppingcart.lld.TicTacToe.models.CellState;
import com.shoppingcart.lld.TicTacToe.models.Move;

import java.util.List;

public class EasyBotWinningStrategy implements BotwinningStrategy {
    @Override
    public Move makeMove(Board board) {
        //Iterate through the board and make the move at the first empty cell

        for(List<Cell> cells : board.getBoard()){
            for(Cell cell : cells){
                if(cell.getCellState() == CellState.EMPTY){
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}