import java.util.Scanner;
public class Snacks {
    protected String snacksName;
    Scanner askingSnacks = new Scanner(System.in);

    public String getSnackName() {
        System.out.print("apa nama snacks-nya? =");
        snacksName= askingSnacks.nextLine();
        return snacksName;
    }
}
