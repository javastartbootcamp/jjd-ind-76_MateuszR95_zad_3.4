package pl.javastart.task;

public class SpecialOffer {

    Product product;
    String offerDescription;
    String validity;
    double rabat;

    public SpecialOffer(Product product, String offerDescription, String validity, double rabat) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.validity = validity;
        this.rabat = rabat;
    }

    void makeRabat() {
        product.price = product.price - product.price * rabat;
    }

}
