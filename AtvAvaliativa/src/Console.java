import java.util.Scanner;

public class Console {
    Scanner leitor = new Scanner(System.in);

    public String lerString() {
        return leitor.nextLine();
    }

    public float lerFloat() {
        return leitor.nextFloat();
    }
}
