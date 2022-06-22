package com.lbenzzine.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


class CustomListTest {

	@Test
	public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
	   List<Object> list = new CustomList<>();
	    assertTrue(list.isEmpty());
	}

}
