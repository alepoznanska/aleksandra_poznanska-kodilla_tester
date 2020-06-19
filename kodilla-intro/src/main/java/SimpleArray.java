public class SimpleArray {
    public static void main (String[] args) {
        String[] friends = new String[5];
        friends[0] = "Patryk";
        friends[1] = "Asia";
        friends[2] = "Basia";
        friends[3] = "Delia";
        friends[4] = "Ola";
        String bestFriend = friends[3];
        System.out.println("My best friend is " + bestFriend);
        int numberOfElements = friends.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        String[] movies = new String[] {"Harry Potter", "Lord of the Rings", "Forrest Gump", "xyz"};
        int numberOfElementsInMovies = movies.length;
        System.out.println(numberOfElementsInMovies);
    }

}
