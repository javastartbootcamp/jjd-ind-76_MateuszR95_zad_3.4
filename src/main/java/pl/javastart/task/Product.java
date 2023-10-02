package pl.javastart.task;

public class Product {

    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void printInfo() {

        System.out.println("Nazwa produktu: " + name + ", Cena produktu: " + price + ", Opis produktu: " + description);

    }
}
