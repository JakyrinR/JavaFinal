package com.company;

public class CustomerName {
    private String custname;
    private String custorder;
    private double orderprice;

    public double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(double orderprice) {
        this.orderprice = orderprice;
    }



    public String getCustorder() {
        return custorder;
    }

    public void setCustorder(String custorder) {
        this.custorder = custorder;
    }



    public String getCustname() {

        return custname;
    }

    public void setCustname(String custname) {

        this.custname = custname;
    }

}