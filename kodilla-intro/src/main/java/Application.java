<<<<<<< HEAD
public class Application {
    String name;
    int age;
    int height;

    public Application(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkAgeAndHeight() {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
    public static void main(String[] args) {
        Application adam = new Application("Adam", 50, 177);
        adam.checkAgeAndHeight();

    }
}
=======
public class Application {
    String name;
    int age;
    int height;

    public Application(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkAgeAndHeight() {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
    public static void main(String[] args) {
        Application adam = new Application("Adam", 50, 177);
        adam.checkAgeAndHeight();

    }
}
>>>>>>> origin/master
