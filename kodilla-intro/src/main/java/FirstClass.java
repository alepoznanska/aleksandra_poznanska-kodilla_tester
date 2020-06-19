public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2015);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1600,500, 2000);
        Notebook notTooOldNotebook = new Notebook(1300,1200, 2007);

        displayNotebookParameters(notebook, "A regular notebook weighs ");
        displayNotebookParameters(heavyNotebook, "A heavy notebook weighs ");
        displayNotebookParameters(oldNotebook, "An old notebook weighs ");
        displayNotebookParameters(notTooOldNotebook, "A not-too-old notebook weighs ");

    }

    private static void displayNotebookParameters(Notebook notebook, String s) {
        System.out.println(s + notebook.weight + "g and costs " + notebook.price + "PLN. It was made in " + notebook.year + ".");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}