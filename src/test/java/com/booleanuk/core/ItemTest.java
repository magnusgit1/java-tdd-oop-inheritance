package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void itemTest(){
        Item item = new Item("ting");

        Assertions.assertEquals("item is not currently on loan", item.checkIn());
    }
}
