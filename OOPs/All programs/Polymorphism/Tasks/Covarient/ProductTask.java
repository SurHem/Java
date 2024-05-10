// E-commerce Product Search
// In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.


class Product{
    Product search(){
        System.out.println("This is "+this.getClass().getName()+" Class");
        return this;
    }
}


class ElectronicsProduct extends Product{
    @Override
    ElectronicsProduct search(){
        System.out.println("This is "+this.getClass().getName()+" Class");
        return this;
    }
}

class ClothingProduct extends Product{
    @Override
    ClothingProduct search(){
        System.out.println("This is "+this.getClass().getName()+" Class");
        return this;
    }
}

public class ProductTask {
    public static void main(String[] args) {
        // Product p = new Product();
        // p.search();

        // ElectronicsProduct e = new ElectronicsProduct();
        // e.search();


        // ClothingProduct c = new ClothingProduct();
        // c.search();
    
        Product p;

        p = new Product();
        p.search();

        p = new ElectronicsProduct();
        p.search();

        p = new ClothingProduct();
        p.search();

    }
}
