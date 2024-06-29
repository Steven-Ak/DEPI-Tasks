import java.util.ArrayList;
import java.util.List;
public class Menu
{
    private List<Sandwich> sandwiches = new ArrayList<>();

    public Menu()
    {
        sandwiches.add(new Sandwich("Beef Burger",80));
        sandwiches.add(new Sandwich("Chicken Burger",70));
        sandwiches.add(new Sandwich("Cheese Burger",75));
    }

    public void displayMenu()
    {
        System.out.println("Menu: ");
        for (int i = 0 ; i < sandwiches.size(); i++)
        {
            System.out.println( (i + 1) + "- " + sandwiches.get(i).getName());
        }
    }

    public Sandwich getSandwich(int i)
    {
        return sandwiches.get(i - 1);
    }

    public void addSandwich(Sandwich sandwich)
    {
        sandwiches.add(sandwich);
    }
}