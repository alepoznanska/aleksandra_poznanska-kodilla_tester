public class LeapYear {
    public static void main(String[] args) {
        int yearA = 2001;
        int yearB = 2004;

        if (yearA % 4 == 0 && yearA % 100 != 0) {
            System.out.println(yearA + " jest rokiem przestępnym");
        } else if (yearA % 400 == 0) {
            System.out.println(yearA + " jest rokiem przestępnym");
        } else {
            System.out.println(yearA + " nie jest rokiem przestępnym");
        }
        if (yearB % 4 == 0 && yearB % 100 != 0) {
            System.out.println(yearB + " jest rokiem przestępnym");
        } else if (yearB % 400 == 0) {
            System.out.println(yearB + " jest rokiem przestępnym");
        } else {
            System.out.println(yearB + " nie jest rokiem przestępnym");
        }
    }
}
