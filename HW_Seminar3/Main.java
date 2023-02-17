package HW_Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.

        List <String> list = new ArrayList<>();

        list.add("Лилии");
        list.add("Розы");
        list.add("Пионы");
        list.add("Ромашки");

        System.out.println("Ваш изначальный список: ");
        System.out.println(list);
        System.out.println();

        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        
        for(int i = 0; i < list.size(); i++ ) {
            list.set(i, list.get(i) + "!");
        }

        System.out.println("Ваш список с добавленным элементом в каждую строку: ");
        System.out.println(list);
        System.out.println();

        // Вставить элемент в список в первой позиции.

        list.add(0,"Одуваньчики!");

        System.out.println("Ваш список с новым элементом: ");
        System.out.println(list);
        System.out.println();

        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("Элемент под указанным Вами индексом: ");
        System.out.println(list.get(2));
        System.out.println();

        // Обновить определенный элемент списка по заданному индексу.

        list.set(0, "Хризантемы!");

        System.out.println("Новый список с заменённым элементом: ");
        System.out.println(list);
        System.out.println();

        // Удалить третий элемент из списка.

        list.remove(2);

        System.out.println("Список уже без удаленного элемента: ");
        System.out.println(list);
        System.out.println();

        // Поиска элемента в списке по строке.

        System.out.println("Индекс искомого элемента в списке: ");
        System.out.println(list.indexOf("Пионы!"));
        System.out.println();

        // Создать новый список и добавить в него несколько елементов первого списка.

        List <String> list2 = new ArrayList<>();
        
        list2.addAll(list);
        list2.remove(0);

        System.out.println("Ваш готовый второй список: ");
        System.out.println(list2);
        System.out.println();
        System.out.println();


        // Удалить из первого списка все элементы отсутствующие во втором списке.

        System.out.println("Первый список: ");
        System.out.println(list);
        System.out.println();
        System.out.println("Второй список: ");
        System.out.println(list2);
        System.out.println();
        System.out.println("Элементы первого списка, которые есть во втором списке: ");
        list.retainAll(list2);
        System.out.println(list);

    }

}