package com.company;

import java.util.HashMap;

public class Extend {
    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        //1. Add a line to access a value in the HashMap using the get() method
        System.out.println("A city in England is :" +capitalCities.get("England"));
        //2.Remove an item's key using the remove() method
        capitalCities.remove("Germany");
        System.out.println("Value after Germany is deleted: "+ capitalCities);
        //3.Remove all items in the HashMap using the clear() method
        capitalCities.clear();
        System.out.println("HashMap after clearing all cities " +capitalCities);
        //Add four New countries (Key) and their cities (Value).
        capitalCities.put("Ethiopia","Addis Ababa");
        capitalCities.put("Rwanda","Kinsasha");
        capitalCities.put("France","Paris");
        capitalCities.put("DRC","Goma");
        System.out.println("New cities are"+capitalCities);
    }
}
