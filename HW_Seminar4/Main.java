package HW_Seminar4;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Main {

    public static void BubbleSortAge(ArrayList <Integer> age, ArrayList<Integer> index) {

        ArrayList<Integer> ageTmp = new ArrayList<>(age);

        boolean sort = true;
        int k = ageTmp.size();
        while (sort) {
            sort = false;
            for (int i = 0; i < k - 1; i++) {
                if(ageTmp.get(i) > ageTmp.get(i + 1)){
                    int temp = ageTmp.get(i);
                    ageTmp.set(i, ageTmp.get(i + 1));
                    ageTmp.set(i + 1, temp);

                    int temp2 = index.get(i);
                    index.set(i, index.get(i + 1));
                    index.set(i + 1, temp2);
                    sort = true;
                }
            }
            k--;
        }
    }
    
    public static void main(String[] args) throws Exception {

    ArrayList<Integer> index = new ArrayList<>();
    ArrayList <String> lastname = new ArrayList<>();
    ArrayList <String> firstname = new ArrayList<>();
    ArrayList <String> patronymic = new ArrayList<>();
    ArrayList <Integer> age = new ArrayList<>();
    ArrayList <String> gender = new ArrayList<>();

    Scanner scanner = new Scanner(System.in, "cp866");
    System.out.println("ФИО возраст пол, через пробел(Выход x): ");

    boolean run = true;
    while (run) {
        String in = scanner.nextLine();
        if(in.equals("x")){
            run = false;
        }
        else {
            String [] data = in.split(" ");
            index.add(lastname.size());
            lastname.add(data[0]);
            firstname.add(data[1]);
            patronymic.add(data[2]);
            age.add(Integer.parseInt(data[3]));
            gender.add(data[4]);
        }
    }
        System.out.println("Вывод списка: ");
        for(int i = 0; i < lastname.size(); i++){
        StringBuilder st = new StringBuilder();
         st.append(lastname.get(i))
            .append(" ")
            .append(firstname.get(i)
            .charAt(0))
            .append(". ")
            .append(patronymic.get(i)
            .charAt(0))
            .append(". ");
        System.out.println(st);
    }

    BubbleSortAge(age, index);

    System.out.println("Вывод отсортированного списка: ");
    for(int i: index) {
        StringBuilder st = new StringBuilder();
         st.append(lastname.get(i))
            .append(" ")
            .append(firstname.get(i)
            .charAt(0))
            .append(". ")
            .append(patronymic.get(i)
            .charAt(0))
            .append(". ");
        System.out.println(st);
    }

}
}
