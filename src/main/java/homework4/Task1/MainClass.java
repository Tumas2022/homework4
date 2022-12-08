package homework4.Task1;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
                 Map<String, Integer> hm = new HashMap<>();
            String[] words = {
                    "Клубника", "Виноград", "Вишня", "Черника", "Малина",
                    "Вишня", "Ежевика", "Калина", "Виноград", "Вишня",
                    "Клубника", "Черника", "Ежевика", "Клюква", "Виноград",
                    "Малина", "Черника", "Вишня", "Виноград", "Вишня"};

            for (int i = 0; i < words.length; i++) {
                if (hm.containsKey( words[i] ))
                    hm.put( words[i], hm.get( words[i] ) + 1 );
                else
                    hm.put( words[i], 1 );
            }
            System.out.println( hm );
        }
    }
//