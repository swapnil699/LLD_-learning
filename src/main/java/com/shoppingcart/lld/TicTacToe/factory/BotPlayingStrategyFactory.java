package com.shoppingcart.lld.TicTacToe.factory;

import com.shoppingcart.lld.TicTacToe.models.BotDifficultyLevel;
import com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies.BotwinningStrategy;
import com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies.EasyBotWinningStrategy;
import com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies.HardBotWinningStrategy;
import com.shoppingcart.lld.TicTacToe.strategies.botwinningstrategies.MediumBotWinningStrategy;

public class BotPlayingStrategyFactory {
    public static BotwinningStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotWinningStrategy();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotWinningStrategy();
        }else  return new HardBotWinningStrategy();
    }
}