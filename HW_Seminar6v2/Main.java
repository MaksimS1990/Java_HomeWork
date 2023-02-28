package HW_Seminar6v2;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {

        MySet set = new MySet();
        set.add(2);
        set.add(33);
        set.add(22);
        set.add(41);
        set.add(67);
        set.add(28);
        set.add(77);
        System.out.println("Вывод MySet после заполнения: ");
        System.out.println(set);
        System.out.println("Проверка на анличие элемента в MySet: ");
        System.out.println(set.contains(33));
        System.out.println(set.contains(59));
        System.out.println("Очистка MySet: ");
        set.clear();
        System.out.println(set);
        set.add(2);
        set.add(36);
        set.add(22);
        set.add(41);
        set.add(6);
        set.add(28);
        set.add(16);
        System.out.println("Вывод MySet после повторного запонения: ");
        System.out.println(set);
        set.remove(41);
        System.out.println("Вывод MySet после удаления элемента: ");
        System.out.println(set);
        System.out.println("Вывод размера MySet: ");
        System.out.println(set.size());
        System.out.println("Получение элемента: ");
        System.out.println(set.get(2));
        System.out.println("Получение списка: ");
        System.out.println(set.getArrayList());
        System.out.println("Вывод элементов от начала до заданного: ");
        System.out.println(set.headSet(22));
        System.out.println("Вывод элементов от заданного до конца: ");
        System.out.println(set.tailSet(22));
        System.out.println("Вывод элементов в диапазоне от первого заданного до второго: ");
        System.out.println(set.subSet(2, 6));

    }
    }


class MySet{
    private HashMap<Integer, Object> values = new HashMap<>();
    private static final Object X = new Object();

    void add (int data){
        values.put(data, X);
        }

    public String toString() {
        return values.keySet().toString();
    }

    Boolean contains (int data){
        return values.containsKey(data);
    }

    void clear (){
        values.clear();
    }

    void remove (int data){
        values.remove(data);
    }

    int size (){
        return values.size();
    }

    int get (int ind){
        return (int) values.keySet().toArray()[ind];
    }

    ArrayList getArrayList(){
        ArrayList <Integer> res = new ArrayList<>();
        values.forEach((k, v) -> res.add(k));
        return res;
    }

    MySet tailSet(int data){
        boolean ad = false;
        MySet res = new MySet();
        for (int el : values.keySet()) {
            if (data == el)
                ad = true;
            if (ad){
                res.add(el);
            }
        }
        return res;
    }

        MySet headSet(int data){
            MySet res = new MySet();
            for (int el : values.keySet()) {
                res.add(el);
                if (data == el)
                break;
            }
            return res;
        }

        MySet subSet(int key1, int key2){
            MySet res = new MySet();
            boolean ad = false;
            int stop = key1;
            for (int el : values.keySet()) {
                if (el == key1 && !ad){
                    ad = true;
                    stop = key2;
                }
                if (el == key2 && !ad){
                    ad = true;
                }
                    if (ad){
                        res.add(el);
                        if(el == stop){
                            break;
                        }
                    }
                }
                return res;
            }
        }

