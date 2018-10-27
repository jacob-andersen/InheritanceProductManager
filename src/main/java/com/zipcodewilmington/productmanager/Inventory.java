package com.zipcodewilmington.productmanager;

import java.util.ArrayList;

public class Inventory {


        ArrayList<Product> invlist = new ArrayList();

        public void populateInv(Product item){
            invlist.add(item);
        }

        public double tallyValue(){
            int sum=0;
            for (Product v:invlist){
                sum+=(v.getQuantity()*v.getPrice());
            }
            return(sum);
        }

    public int tallyQuantity(){
        int sum=0;
        for (Product v: invlist){
            sum+=(v.getQuantity());
        }
        return(sum);
    }

    public void InventoryList(){
            for (Product v : invlist) {
                System.out.println(v.getId() + "        " + v.getQuantity() + "        " + v.getPrice() + "        ");
            }
        }
}
