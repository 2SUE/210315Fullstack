package com.sue.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryTest {
    @BeforeAll
    public static void beforeAll() {
        Query.createTable();
    }

    @AfterAll
    public static void afterAll() {
        Query.dropTable();
    }

    @BeforeEach
    public void beforeEach() {
        Query.boardDelete(0);

        BoardVO vo1 = new BoardVO();
        vo1.setBtitle("Hi");
        vo1.setBcontent("Hello");
        Query.boardInsert(vo1);

        BoardVO vo2 = new BoardVO();
        vo2.setBtitle("Bye");
        vo2.setBcontent("Good Bye");
        Query.boardInsert(vo2);
    }

    @Test
    public void testA() {
        BoardVO vo1 = Query.getBoardDetail(1);
        assertEquals(vo1.getBtitle(), "Hi");
        assertEquals(vo1.getBcontent(), "Hello");

        BoardVO vo2 = Query.getBoardDetail(2);
        assertEquals(vo2.getBtitle(), "Bye");
        assertEquals(vo2.getBcontent(), "Good bye");
    }

    @Test
    public void testB() {

    }

    @Test
    public void testC() {

    }
}