import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        int j = 0, g = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0){
                j++;
            } else {
                g++;
            }
        }
        System.out.println("количество отрицательных чисел:" + g);
        System.out.println("количество положительных чисел:" + j);
    }
}
