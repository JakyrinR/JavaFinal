package com.company;


import com.sun.deploy.util.OrderedHashSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String answer;

    public static void main(String[] args) {
        ArrayList<Store> inventory = new ArrayList<Store>();

        Store st = new Store("Red-Hot Spicy Doritos",2.99);
        inventory.add(st);
        st = new Store("Cool Ranch Doritos",2.99);
        inventory.add(st);
        st = new Store("Coke",0.99);
        inventory.add(st);
        st = new Store("Diet Coke",0.99);
        inventory.add(st);
        st = new Store("Pepsi",0.99);
        inventory.add(st);
        st = new Store("Five Hour Energy",3.99);
        inventory.add(st);
        st = new Store("Sunflower Seeds",0.99);
        inventory.add(st);
        st = new Store("Peanuts",0.99);
        inventory.add(st);
        st = new Store("Mac Book Chargers",120);
        inventory.add(st);
        st = new Store("Dell Chargers",50);
        inventory.add(st);

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).getProducts()+ ": $" + inventory.get(i).getPrices());

        }

        ArrayList<Purchases> purchaselist = new ArrayList<Purchases>();
        Scanner input = new Scanner(System.in);
        double price;
        price = 0.00;
        double custprice = 0.00;
        String name = "";
        String order = "";
        int quantity = 0;

        OrderedHashSet customerlist = null;
        do {
            System.out.println("Welcome what would you like to buy?");
            System.out.println("1) add purchase 3) finish transaction");
            answer = input.nextLine();

            if (answer.equals("1")) {
                System.out.println("Customer's name:");
                name = input.nextLine();

                String custorder = "";

                String response;
                do {
                    System.out.println("What did they buy?");
                    System.out.println("Enter 2 if you want to move on to the next customer");
                    response = input.nextLine();
                    if (response.equals("2")){continue;}



                    for (int i = 0; i < inventory.size(); i++) {
                        if (response.equals(inventory.get(i).getProducts())){
                            price = inventory.get(i).getPrices();
                            custprice += price;


                        }
                    }
                    Purchases pts = new Purchases();
                    pts.setPurchproduct(response);
                    pts.setPurchprice(price);
                    purchaselist.add(pts);
                    custorder += response + "\n";



                } while (!response.equals("2"));

                CustomerName cts = new CustomerName();
                cts.setCustname(name);
                cts.setCustorder(custorder);
                cts.setOrderprice(custprice);
                customerlist.add(cts);
                custprice = 0.00;
            }


        } while (!answer.equals("3"));
        System.out.println("Closing");
        System.out.println("Receipt");
        System.out.println("");


        for (int i = 0; i < customerlist.size(); i++) {
            System.out.println(customerlist.get(i).getClass());
            System.out.println(customerlist.get(i).getClass());
            System.out.println(customerlist.get(i).getClass());


        }


        double totalcost = 0.0;
        for (int j = 0; j < purchaselist.size(); j++) {
            totalcost += purchaselist.get(j).getPurchprice();

        }

        System.out.println("Inventory Sold");


        for (int i = 0; i < purchaselist.size(); i++) {
            System.out.println(purchaselist.get(i).getPurchproduct());
        }
        System.out.println("Grandtotal: " + totalcost);




    }
}