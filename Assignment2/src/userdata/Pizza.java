package userdata;

public class Pizza {
    private String size;
    private String[] toppings;
    private double price;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        setPrice(size);
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private void setPrice(String size) {
        switch (size) {
            case "S":
                price = 9.99;
                break;
            case "M":
                price = 12.99;
                break;
            case "L":
                price = 14.99;
                break;
            case "XL":
                price = 19.99;
                break;
        }
    }
}
