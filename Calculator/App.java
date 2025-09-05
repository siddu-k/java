import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE SID-CALC PACKAGE");

        System.out.println("SELECT THE OPTION TO PERFORM");
        System.out.println("1)ADD");
        System.out.println("2)SUB");
        System.out.println("3)MUL");

        try (Scanner sc = new Scanner(System.in)) {
            int opt = sc.nextInt();
            new OptSel().selectOption(opt, sc);
        }
    }
}

 