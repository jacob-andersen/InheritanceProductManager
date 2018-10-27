package com.zipcodewilmington.productmanager;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by leon on 1/10/18.
 */
public class ProductTest {
    @Test
    public void getPriceTest() {


        //given
        Product pricetest = new Product(1, 22, 250);


        //when
        double expected = 250;
        double actual = pricetest.getPrice();
        //then

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getQuantityTest() {

        //given
        Product pricetest = new Product(1, 22, 250);


        //when
        int expected = 22;
        int actual = pricetest.getQuantity();
        //then

        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void tallyQuantityTest() {

        Product testitem = new Product(1, 17, 131);
        Product testitem1 = new Product(7, 7, 41);

        Inventory tallyTest = new Inventory();

        tallyTest.populateInv(testitem);
        tallyTest.populateInv(testitem1);

        //given


        //when
        int expected = 24;
        int actual = tallyTest.tallyQuantity();
        //then

        Assert.assertEquals(expected, actual, 0.01);
    }

        @Test


    public void tallyValueTest() {

        Product testitem = new Product(1, 17, 131);
        Product testitem1 = new Product(7, 7, 41);

        Inventory tallyTest = new Inventory();

        tallyTest.populateInv(testitem);
        tallyTest.populateInv(testitem1);

        //given


        //when
        double expected = 2514;
        double actual = tallyTest.tallyValue();
        //then

        Assert.assertEquals(expected, actual, 0.01);

    }
}
