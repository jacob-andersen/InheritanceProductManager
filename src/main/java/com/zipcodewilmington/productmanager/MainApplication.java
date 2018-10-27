package com.zipcodewilmington.productmanager;
import sun.tools.tree.NewArrayExpression;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 1/10/18.
 */


public class MainApplication {
    public static void main(String[] args) {

        Product item1 = new Product(1, 22, 250);
        Product item2 = new Product(1, 200, 25);
        Product item3 = new Product(3, 22, 150);
        Product item4 = new Product(4, 22, 375);
        Product item5 = new Product(5, 100, 75);
        Product item6 = new Product(6, 54, 121);


        Inventory inv = new Inventory();

        inv.populateInv(item1);
        inv.populateInv(item2);
        inv.populateInv(item3);
        inv.populateInv(item4);
        inv.populateInv(item5);
        inv.populateInv(item6);

        System.out.println("Current status of Items in stock : ");
        System.out.println("Item:   Quantity:   Price:         ");
        inv.InventoryList();

        System.out.println("=================================================================");
        System.out.println("Total:    "+inv.tallyQuantity()+"      "+inv.tallyValue()+"      ");
        System.out.println("=================================================================");



    }
}

