public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        Notebook notTooOldNotebook = new Notebook(1300, 1200, 2007);

        displayNotebookParameters(notebook, "A regular notebook weighs ");
        displayNotebookParameters(heavyNotebook, "A heavy notebook weighs ");
        displayNotebookParameters(oldNotebook, "An old notebook weighs ");
        displayNotebookParameters(notTooOldNotebook, "A not-too-old notebook weighs ");

        userManager();
    }

    private static void userManager() {
        User adrian = new User("Adrian", 100);
        User helena = new User("Helena", 70);
        User kinga = new User("Kinga", 10);
        User piotr = new User("Piotr", 14);
        User adam = new User("Adam", 1);

        User[] users = {adrian, helena, kinga, piotr, adam};

        int numberOfElements = users.length;
        int ageSum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            ageSum = ageSum + users[i].getAge();

        }
        System.out.println("suma wieku to " + ageSum);

        int ageAverage = ageSum / numberOfElements;
        System.out.println("Średnia wieku to " + ageAverage);

        for (int i = 0; i < numberOfElements; i++) {
            if (users[i].getAge() < ageAverage) {
                System.out.println("Średniej wieku nie przekracza: " + users[i].getName());

            }
        }
    }

    private static void displayNotebookParameters(Notebook notebook, String s) {
        System.out.println(s + notebook.weight + "g and costs " + notebook.price + "PLN. It was made in " + notebook.year + ".");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}