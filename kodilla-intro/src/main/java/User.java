public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

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

        } System.out.println("suma wieku to " + ageSum);

        int ageAverage = ageSum / numberOfElements;
        System.out.println("Średnia wieku to " + ageAverage);

        for (int i = 0; i < numberOfElements; i++) {
            if (users[i].getAge() < ageAverage) {
                System.out.println("Średniej wieku nie przekracza: " + users[i].getName());
            }
        }



    }
}






