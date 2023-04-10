package com.kodilla.rps;

import com.kodilla.rps.logic.Player;
import com.kodilla.rps.logic.Score;
import com.kodilla.rps.logic.Statistic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Statistic test suite")
public class StatisticTestSuite {

    @Test
    @DisplayName("Test getNumberOfGame")
    void testGetNumberOfGames() {
        //Given
        Statistic statistic = inputData();

        //When
        int result = statistic.getNumberOfGames();

        //Then
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Test getPlayer")
    void testGetPlayer() {
        //Given
        Statistic statistic = inputData();

        //When
        String result = statistic.getPlayer().getName();

        //Then
        assertEquals("John12", result);
    }

    @Test
    @DisplayName("Test getRound")
    void testGetRound() {
        //Given
        Statistic statistic = inputData();

        //When
        int result = statistic.getRound();

        //Then
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Test getScore")
    void testGetScore() {
        //Given
        Statistic statistic = inputData();

        //When
        int playerScore = statistic.getScore().getPlayerScore();
        int computerScore = statistic.getScore().getComputerScore();

        //Then
        assertEquals(2, playerScore);
        assertEquals(5, computerScore);
    }

    private Statistic inputData() {
        Player player = new Player("John12");
        Score score = new Score(2,5);
        return new Statistic(5,7, player, score);
    }

}
