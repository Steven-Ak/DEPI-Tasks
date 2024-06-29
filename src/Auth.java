import java.util.Scanner;
public class Auth
{
    private Menu menu;
    String UserAuth = "Admin";
    String PassAuth = "Burger123";

    public Auth(Menu menu) {
        this.menu = menu;
    }

    public void Auth()
    {
        System.out.println("1- User");
        System.out.println("2- Admin");
        System.out.print("Select User Type: ");
        Scanner scanner = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        int choice = scanner.nextInt();



        switch (choice)
        {
            case 1:
                UserMain userMain = new UserMain();
                userMain.showMenu();
                break;

            case 2:

                System.out.println("Enter Username and Password:");
                String Username = user.nextLine();
                String Password = pass.nextLine();


                if (Username.equals(UserAuth) && Password.equals(PassAuth))
                {
                    AdminMain adminMain = new AdminMain();
                    adminMain.showAdminMenu();
                }
                else
                {
                    System.out.println("Wrong Username or Password");
                    Auth();
                }
                break;

            default:
                System.out.println("Invalid Option Please Try Again!");
                Auth();
                break;
        }
    }
}