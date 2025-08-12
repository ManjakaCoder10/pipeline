package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (String msg : getNumbersMessage(5)) {
            System.out.println(msg);
        }
    }

    // Méthode testable
    public static List<String> getNumbersMessage(int max) {
        List<String> messages = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            messages.add("i = " + i);
        }
        return messages;
    }
}
