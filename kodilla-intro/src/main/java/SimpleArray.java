public class SimpleArray {
    public static void main (String[] args) {
        String[] friends = new String[5];
        friends[0] = "Patryk";
        friends[1] = "Asia";
        friends[2] = "Basia";
        friends[3] = "Delia";
        friends[4] = "Ola";
        String friend = friends[3];
        System.out.println(friend);
        int numberOfElements = friends.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");

    }
}
