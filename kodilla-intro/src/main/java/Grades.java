public class Grades {
    private int[] grades;
    private int size;

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(1);

        grades.add(1);

        grades.add(1);

        grades.add(5);

        grades.add(2);
        grades.lastGrade();
        grades.averageGrade();
    }

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade() {
        int ostatniaOcena = grades[this.size - 1];

        System.out.println("Ostatnia dodana ocena to " + ostatniaOcena);
    }

    public void averageGrade() {
        int sumaOcen = 0;
        for (int i = 0; i < this.size; i++) {
            sumaOcen = sumaOcen + grades[i];
        }
        int sredniaOcen = sumaOcen / this.size;
        System.out.println("Srednia ocen wynosi " + sredniaOcen);
    }





}
