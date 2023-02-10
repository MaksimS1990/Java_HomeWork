package HW_Seminar1;

    public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random()* 2000);
       
            System.out.println(a);
 
    String binary = Long.toBinaryString(a);
 
    System.out.println(binary);

    int n = binary.length() - 1;
     System.out.println(n);
    
    int min = Short.MIN_VALUE;
    int max = Short.MAX_VALUE;
    int result = 0;

    for (int i = a; i < max; i ++){
        if (i % n == 0);
        result++;
    }
    System.out.println(result);
    }
}