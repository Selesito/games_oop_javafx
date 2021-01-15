package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;

import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.add(new KingBlack(D2));
        logic.move(C1, G5);
    }
}