package org.jspiders.springmvcdemo1;

public class Store {
    private String item;
    private double cost;
    private double revenue;

    public Store(String item, double cost, double revenue) {
        this.item = item;
        this.cost = cost;
        this.revenue = revenue;
    }

    public Store() {

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
