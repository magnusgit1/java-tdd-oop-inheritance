package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Item> items = new ArrayList<>();

    public void addToStock(Item item) {
        this.items.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)

    public String checkInItem(String title) {

        List<Item> filtered = this.items.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.getFirst().checkIn();
    }

    public String checkOutItem(String title) {
        List<Item> filtered = this.items.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.getFirst().checkOut();
    }
}
