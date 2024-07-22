import javax.swing.plaf.ComponentUI;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = ProductCatalog.getCatalog();
        // Creating Products
        Product tshirt = new Product.ProductBuilder("T-shirt")
                .setColor("Red")
                .setSize("M")
                .setWeight(50)
                .setFeatures("Oversize")
                .setPrice(550)
                .build();
      //adding Product to the catalog(database)
        catalog.addProduct(tshirt);

        Product cargoPants = new Product.ProductBuilder("Cargo Pants")
                .setColor("Green")
                .setSize("S")
                .setWeight(80.5)
                .setFeatures("Oversize")
                .setPrice(850)
                .build();
        catalog.addProduct(cargoPants);

        //adding products to cart
        OrderSystem order = OrderFactory.order("online");
        order.addToCart(cargoPants);
        order.addToCart(tshirt);
        order.checkoutOrder();
        //Calculating Total Price
        PaymentProcessor payment = new PaymentProcessor(new PayPalPayment());
        payment.processPayment(order.calculateTotalPrice());
        System.out.println("--------------------------------");

        //Printing Catalog
        System.out.println("Catalog: ");
        catalog.printCatalog();
        System.out.println("--------------------------------");

        // Test Scroller
        Scroller products = new ProductList();
        Scroller scrollProduct = new ScrollerDecorator(products);
        scrollProduct.display();

        //Test New Library
        System.out.println("---------------------------------");
        LibraryComponent libraryComponent = new LibraryComponent();
        CurrentUi newUI = new LibraryAdapter(libraryComponent);
        newUI.display();
    }
}