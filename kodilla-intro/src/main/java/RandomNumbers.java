public class RandomNumbers {
    private static int maxNumber;
    private static int minNumber;

    public static void maxNumber(int valueMax) {
        if (maxNumber < valueMax) {
            maxNumber = valueMax;
        }
    }
    public static void minNumber(int valueMin) {
        if(minNumber > valueMin) {
            minNumber = valueMin;
        }
    }
    private int nextInt(int nextInt) {
    return nextInt;
    }
    public static void main(String[] args) {
    int randomNumberSum = 0;
    int max = 5000;

    RandomNumbers random = new RandomNumbers();
        while (randomNumberSum <= max) {
            int temp = random.nextInt(31);
            if(randomNumberSum == 0) {
                maxNumber(temp);
                minNumber(temp);
            }
            randomNumberSum = randomNumberSum + temp;
        }
        System.out.println("Suma wynosi " + randomNumberSum);
        System.out.println("Maksymalna liczba wynosi " + maxNumber);
        System.out.println("Minimalna liczba wynosi " + minNumber);
    }
}

