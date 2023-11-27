import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Per favore, inserisci tre parole a caso e premi invio");

        String input1 = userInput.nextLine();
        String input2 = userInput.nextLine();
        String input3 = userInput.nextLine();

        String normalOutput = input1 + " " + input2 + " " + input3;
        String reverseOutput = input3 + " " + input2 + " " + input1;

        System.out.println("Hai inserito: " + normalOutput + "Al contrario invece:" + reverseOutput);

        System.out.println("Adesso inserisci due numeri decimali e calcolerò l'area del rettangolo poi premi invio");

        double side1 = Double.parseDouble(userInput.nextLine());
        double side2 = Double.parseDouble(userInput.nextLine());

        System.out.println("L'area del rettangolo è di:" + calcRectPerim(side1, side2));


        System.out.println("Adesso inserisci un numero intero e ti dirò se è pari (0) o dispari (1) poi premi invio");
        int number1 = Integer.parseInt(userInput.nextLine());
        System.out.println("Il numero è: " + oddOrEven(number1));


        System.out.println("Adesso inserisci tre numeri decimali e calcolerò l'area del triangolo, poi premi invio");

        double lato1 = Double.parseDouble(userInput.nextLine());
        double lato2 = Double.parseDouble(userInput.nextLine());
        double lato3 = Double.parseDouble(userInput.nextLine());


        System.out.println("L'area del triagolo è di:" + calcTriangPerim(lato1, lato2, lato3));
    }


    public static double calcRectPerim(double num1, double num2) {
        return (num1 * 2) + (num2 * 2);
    }

    public static int oddOrEven(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double calcTriangPerim(double side1, double side2, double side3) {


        double semiPerim = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerim * (semiPerim - side1) * (semiPerim - side2) * (semiPerim - side3));
        return area;
    }


}
