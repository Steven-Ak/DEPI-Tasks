import java.util.ArrayList;
import java.util.List;
public class Order
{
    private Sandwich sandwich;
    private List<Addition> additions = new ArrayList<>();

    public Order(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    public void addAddition(Addition addition)
    {
        additions.add(addition);
    }

    public void displayOrder()
    {
        System.out.println(sandwich.getName());
        for (Addition addition : additions)
        {
            System.out.println(addition.getName());
        }
    }

    public void displayReceipt()
    {
        double Total = sandwich.getPrice();
        System.out.println("Receipt: ");
        System.out.println(sandwich.getName() + " " + sandwich.getPrice());
        for (Addition addition : additions)
        {
            Total += addition.getPrice();
            System.out.println( "Extra" + " " + addition.getName() + " " + addition.getPrice());
        }
        System.out.println("Total: " + Total);

    }
}