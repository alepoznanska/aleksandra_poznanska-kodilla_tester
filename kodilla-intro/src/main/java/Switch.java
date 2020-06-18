import java.util.Scanner;

public class Switch {
    public static String getFirstLetterOfColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select the first letter of a color (G-green, R-red, Y-yellow, B-blue).");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "G":
                    return "Green";
                case "R":
                    return "Red";
                case "Y":
                    return "Yellow";
                case "B":
                    return "Blue";
                default:
                    System.out.println("Cannot find a color which starts with this letter, plese choose another letter.");
            }
        }
    }
    public static void main(String[] args) {
        String myColor = getFirstLetterOfColor();
        System.out.println(myColor + " is your color.");

    }
}


