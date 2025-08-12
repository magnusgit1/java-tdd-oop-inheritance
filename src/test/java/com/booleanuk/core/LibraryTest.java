package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testLibrary(){
        Library library = new Library();
        Item item = new Item("hei");
        library.addToStock(item);
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("nei"));
    }
}
