import java.util.Arrays;
import java.util.Scanner;

public class Main{
    interface check {
        boolean Cheking(int x, int y);
    }

    private static void bubleSort(int [] array, check testActivity) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (testActivity.Cheking(array[i], array[j])) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите эл массива");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Заполненный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Отсортированный по убыванию: ");
        bubleSort(array, ((x, y) -> x < y));
        System.out.println(Arrays.toString(array));
        bubleSort(array, ((x, y) -> x > y));
        System.out.println("Отсортированный по возрастанию: ");
        System.out.println(Arrays.toString(array));
        }
    }