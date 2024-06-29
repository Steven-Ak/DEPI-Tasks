import java.util.Scanner;
public class UserMain
{
    private Menu menu = new Menu();
    private Additions adds = new Additions();



    public void showMenu()
    {
        menu.displayMenu();

        System.out.print("Please Select Option: ");
        Scanner scanner = new Scanner(System.in);
        int sandwichChoice = scanner.nextInt();

        System.out.println("Do you like to add any additions?");
        System.out.println("1-Yes");
        System.out.println("2-No");
        int addChoice = scanner.nextInt();

        Order order = new Order(menu.getSandwich(sandwichChoice));

        if (addChoice == 1)
        {
            adds.displayAdditions();
            System.out.println("Please select the number in front of the desired additions (, between every choice): ");
            scanner.nextLine();
            String addChoices = scanner.nextLine();
            for (String choice : addChoices.split(","))
            {
                order.addAddition(adds.getAddition(Integer.parseInt(choice)));
            }
        }

        System.out.println("Your order is: ");
        order.displayOrder();
        System.out.println("1- Confirm");
        System.out.println("2- Back to menu");

        int confirmOrder = scanner.nextInt();
        if (confirmOrder == 1)
        {
           order.displayReceipt();
           System.exit(0);
        }
        else
        {
            showMenu();
        }

    }
}