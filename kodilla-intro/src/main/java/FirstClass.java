public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2015);
        System.out.println("A regular notebook weighs " + notebook.weight + "g and costs " + notebook.price + "PLN. It was made in " + notebook.year + ".");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("A heavy notebook weighs " + heavyNotebook.weight + "g and costs " + heavyNotebook.price + "PLN. It was made in " + heavyNotebook.year + ".");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
        Notebook oldNotebook = new Notebook(1600,500, 2000);
        System.out.println("An old notebook weighs " + oldNotebook.weight + "g and costs " + oldNotebook.price + "PLN. It was made in " + oldNotebook.year + ".");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        Notebook notTooOldNotebook = new Notebook(1300,1200, 2007);
        System.out.println("A not-too-old notebook weighs " + notTooOldNotebook.weight + "g and costs " + notTooOldNotebook.price + "PLN. It was made in " + notTooOldNotebook.year + ".");
        notTooOldNotebook.checkPrice();
        notTooOldNotebook.checkWeight();
        notTooOldNotebook.checkYearAndPrice();

    }
}