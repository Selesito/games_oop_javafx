package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C2);
        Cell expected = Cell.C2;
        Assert.assertEquals(expected, bishopBlack.position());
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C2);
        bishopBlack.copy(Cell.C2);
        Cell expected = Cell.C2;
        Assert.assertEquals(expected, bishopBlack.position());
    }

    @Test
    public void bishopWayBlack() {
        BishopBlack bishop = new BishopBlack(G5);
        bishop.way(C1);
        Cell[] result = bishop.way(C1);
        Cell[] resultBishop ={F4, E3, D2, C1};

        assertThat(
                result,
                is(resultBishop)
        );
    }

    @Test
    public void bishopWayBlackC1() {
        BishopBlack bishop = new BishopBlack(C1);
        bishop.way(G5);
        Cell[] result = bishop.way(G5);
        Cell[] resultBishop ={D2, E3, F4, G5};

        assertThat(
                result,
                is(resultBishop)
        );
    }

    @Test
    public void bishopWayBlackG2() {
        BishopBlack bishop = new BishopBlack(G2);
        bishop.way(C6);
        Cell[] result = bishop.way(C6);
        Cell[] resultBishop ={F3, E4, D5, C6};

        assertThat(
                result,
                is(resultBishop)
        );
    }

    @Test
    public void whenIsDiagonal() {
        BishopBlack bishop = new BishopBlack(G2);
        boolean result = bishop.isDiagonal(G2, C6);
        assertThat(
                result,
                is(true)
        );
    }

}