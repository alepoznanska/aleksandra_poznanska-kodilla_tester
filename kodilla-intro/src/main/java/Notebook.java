public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("this notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1200){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is quite light.");
        } else if (this.weight > 1000 && this.weight <= 1600) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy!");
        }
    }
    public void checkYearAndPrice() {
        if (this.year <= 2015 && this.year > 2010 && this.price <= 1000 && this.price > 500) {
            System.out.println("This notebook is quite new and not so expensive.");
        } else if (this.year > 2016 && this.price > 1499) {
            System.out.println("This notebook is brand new and quite expensive.");
        } else if (this.year <= 2000 && this.price <= 500) {
            System.out.println("This notebook is very old and very cheap.");
        } else {
            System.out.println("This notebook is not very new and not so expensive.");
        }
    }

}