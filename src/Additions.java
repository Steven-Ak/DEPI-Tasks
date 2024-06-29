import java.util.ArrayList;
import java.util.List;
public class Additions
{
    private List<Addition> additions = new ArrayList<>();

    public Additions()
    {
        additions.add(new Addition("Ketchup",3));
        additions.add(new Addition("Mayonnaise",7));
        additions.add(new Addition("Tomatoes",5));
        additions.add(new Addition("Cheese",10));
    }

    public void displayAdditions()
    {
        System.out.println("Additions:");
        for (int i = 0; i< additions.size(); i++)
        {
            System.out.println((i+1) + "- " + additions.get(i).getName());
        }
    }

    public Addition getAddition(int i)
    {
        return additions.get(i - 1);
    }

    public void addAddition (Addition addition)
    {
        additions.add(addition);
    }
}