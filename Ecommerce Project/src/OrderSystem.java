import java.util.ArrayList;
import java.util.List;
public abstract class OrderSystem {
    protected List<Product> productCart = new ArrayList<>();
/// Factory Method
// Steven Akram
    public void addToCart(Product product)
    {
        productCart.add(product);
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Product product : productCart)
        {
            sum += product.getPrice();
        }
        System.out.println("The Total Price: " + sum);
        return sum;
    }

    public abstract void checkoutOrder();
}

class OnlineOrder extends OrderSystem{

    @Override
    public void checkoutOrder() {
        System.out.println("Checking out online order...");
        for (Product product : productCart) {
            System.out.println(product);
            System.out.println("----------------------------------");
        }
    }
}
class InStoreOrder extends OrderSystem{

    @Override
    public void checkoutOrder() {
        System.out.println("Checking out In Store order...");
        for (Product product : productCart) {
            System.out.println(product);
            System.out.println("----------------------------------");
        }
    }
}

class OrderFactory{
    public static OrderSystem order(String orderType)
    {
        if (orderType.toLowerCase().equals("online"))
        {
            return new OnlineOrder();
        }
        else if (orderType.toLowerCase().equals("instore"))
        {
            return new InStoreOrder();
        }
        else
        {
            throw new IllegalArgumentException("Unknown Order Type");
        }
    }
}