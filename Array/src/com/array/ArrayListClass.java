package com.array;

import java.util.ArrayList;

/**
 * Created by Sumit on 28-Jun-17.
 */
public class ArrayListClass {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryItem(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int index, String newItem){
        groceryList.set(index, newItem);
        System.out.println("Grocery item " + (index + 1) + " has been modified.");
    }

    public void removeGroceryItem(int index){
        String item = groceryList.get(index);
        groceryList.remove(index);
    }

    public String searchItem(String in){
        boolean flag = groceryList.contains(in);
        int position = groceryList.indexOf(in);
        if(position > 0){
            return groceryList.get(position);
        }
        return null;
    }
}
