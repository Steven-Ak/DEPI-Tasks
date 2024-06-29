import java.util.Scanner;
public class AdminMain
{
    private Menu menu = new Menu();
    private Additions additions = new Additions();



    Auth auth = new Auth(menu);
    public void showAdminMenu()
    {
        Scanner scanner = new Scanner(System.in);

     while (true)
     {
        System.out.println("Admin Menu");
        System.out.println("1- View Menu");
        System.out.println("2- View Additions");
        System.out.println("3- Add new item to the Menu");
        System.out.println("4- Add new addition");
        System.out.println("5- Exit Admin Menu");

        int adminChoice = scanner.nextInt();
        scanner.nextLine();

        switch (adminChoice)
        {
            case 1:
                menu.displayMenu();
                System.out.println("----------------------------");
                break;

            case 2:
                additions.displayAdditions();
                System.out.println("----------------------------");
                break;

            case 3:
                System.out.println("Enter new sandwich name: ");
                String sandwichName = scanner.nextLine();
                System.out.println("Enter price");
                double sandwichPrice = scanner.nextDouble();
                menu.addSandwich(new Sandwich(sandwichName, sandwichPrice));

                break;

            case 4:
                System.out.println("Enter new addition name: ");
                String addName = scanner.nextLine();
                System.out.println("Enter price: ");
                double addPrice = scanner.nextDouble();
                additions.addAddition(new Addition(addName, addPrice));

                break;

            case 5:
                System.out.println("Exiting Admin Menu...");
                auth.Auth();
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
     }
    }
}
