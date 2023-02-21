package HW_Seminar4;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {

    ArrayList<String[]> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    BufferedReader br = new BufferedReader(new FileReader("users.txt"));
    String str;
    while((str = br.readLine()) != null){
        System.out.printf("%s \n", str);
    }
    br.close();

    boolean run  = true;
    while(run) {
        String in = scanner.nextLine();
        if(in.equals("x")) {
            run = false;
        }
        else {
            String [] data = in.split(" ");
            list.add(data);
        }
    }
    
    
    for (String[] data: list){
            StringBuilder st = new StringBuilder();
            String [] temp = data [0].split(" ");
            st.append(temp[0])
                .append(" ")
                .append(temp[1]
                .charAt(0))
                .append(". ")
                .append(temp[2]
                .charAt(0))
                .append(". ");
    System.out.println(data);
    }
    }
}


