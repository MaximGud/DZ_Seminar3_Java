import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // 1) Реализовать алгоритм сортировки слиянием(метод взять из Интернета)

        int[] numbers = { 4, 10, 6, 14, 2, 1, 8, 5 };

        Task1.mergeSort(numbers);

        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2) Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(7);
        list.add(10);
        list.add(3);
        list.add(8);
        list.add(5);

        System.out.println(Task2.chet(list));//вызываем метод из файла 2 для удаления четных чисел из списка и печатаем его

        //3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
        System.out.println(list);   

        System.out.println(Task3.minValue(list));
        System.out.println(Task3.maxValue(list));
        System.out.println(Task3.midValue(list));
         

    }
}