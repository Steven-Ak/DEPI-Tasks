public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Burger Masr");
        Menu menu = new Menu();
        Auth auth = new Auth(menu);
        auth.Auth();
    }
}