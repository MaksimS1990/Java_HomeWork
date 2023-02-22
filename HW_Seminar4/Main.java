package HW_Seminar4;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {

    ArrayList<String> lastname = new ArrayList<>();
    ArrayList<String> firstname = new ArrayList<>();
    ArrayList<String> patronymic = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> gender = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("ФИО возраст пол, через пробел(Выход x): ");
    System.out.println();

    BufferedReader br = new BufferedReader(new FileReader("users.txt"));
    String str;
    while((str = br.readLine()) != null){
        System.out.printf("%s \n", str);
    }
    br.close();

    boolean run  = true;
    while(run) {
        String in = scanner.nextLine();
        if (in.equals("x")) {
            run = false;
        }
        else {
            String [] users = in.split(" ");
            lastname.add(users[0]);
            firstname.add(users[1]);
            patronymic.add(users[2]);
            age.add(Integer.parseInt(users[3]));
            gender.add(users[4]);
        }
    }
     
    for(int i = 0; i < lastname.size(); i++){
        StringBuilder st = new StringBuilder();
        st.append(lastname.get(i)).append(" ").append(firstname.get(i).charAt(0)).append(". ").append(patronymic.get(i).charAt(0));
    System.out.println(st);
    }
    }
}


