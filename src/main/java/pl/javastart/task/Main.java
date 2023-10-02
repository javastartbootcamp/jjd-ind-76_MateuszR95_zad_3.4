package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("Słodycze", "Coś słodkiego dla każdego");
        Category category2 = new Category("Napoje gazowane", "Orzeźwienie dla każdego");

        Product product1 = new Product("Czekolada orzechowa", 3.6, "Czekolada mleczna z kawałkami orzechów", category1);
        Product product2 = new Product("Baton proteinowy", 5.6, "Baton wysokobiałkowy dla sportowców", category1);
        Product product3 = new Product("Cola", 4.2, "Napój gazowany Cola", category2);
        Product product4 = new Product("Sok pomarańczowy", 3.2, "Sok ze świeżych pomarańczy");

        product1.printInfo();
        product2.printInfo();
        product3.printInfo();
        product4.printInfo();

        SpecialOffer offer = new SpecialOffer(product1, "Obniżka ceny o 20%", "Obowiązuje od 03.10 do 23.10", 0.2);
        offer.makeDiscount();
        
    }
}
