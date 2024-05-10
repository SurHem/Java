// In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

class Product{
    String name;
    double price;

    Product(String name , double price){
        this.name = name;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Name: " + name + "\nPrice: " + price);
    }
}

class ElectronicsProduct extends Product{
    float starRating;

    ElectronicsProduct(String name , double price , float starRating){
        super(name, price);
        this.starRating = starRating;
    }


    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Start Rating: "+starRating);
    }
}

class ClothingProduct extends Product{
    String type;

    ClothingProduct(String name ,double price , String type){
        super(name, price);
        this.type = type;
    }


    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Cloth Type: "+type);
    }
}

public class OnlineRetailSystem {
    public static void main(String[] args) {
        ElectronicsProduct e = new ElectronicsProduct("Iphone", 100_000, 4.8f);
        e.displayDetails();

        ClothingProduct c = new ClothingProduct("xxl Shirt", 500, "Khadi");
        c.displayDetails();
    }
}
