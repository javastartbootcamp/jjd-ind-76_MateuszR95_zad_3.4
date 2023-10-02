package pl.javastart.task;

public class SpecialOffer {

    Product product;
    String offerDescription;
    String validity;
    double discount;

    public SpecialOffer(Product product, String offerDescription, String validity, double discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.validity = validity;
        this.discount = discount;
    }

    void makeDiscount() {

        double priceAfterDiscount = product.price - product.price * 0.2;
        System.out.println("\nInformacja o produkcie po zastosowaniu promocji");
        System.out.println("Nazwa produktu: " + product.name + ", Opis produktu: "
                + product.description + ", Cena produktu po zastosowaniu promocji: " + priceAfterDiscount);

    }

}
