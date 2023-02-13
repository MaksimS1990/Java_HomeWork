package HW_Seminar1;

    public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random()* 100);
       
            System.out.println("Рандомное число: " + a);
 
    String binary = Long.toBinaryString(a);
 
    System.out.println("Бинарное значение: " + binary);

    int n = binary.length() - 1;
     System.out.println("Номер старшего значащего бита рандомного числа: " + n);
    
    int min = 10;
    int max = 200;

    int result = 0;
    for (int i = a; i < max; i ++){
        if (i % n == 0) result++;
    }

    int[] m1 = new int[result];
    int c = 0;
    for (int i = a; i < max; i ++){
        if (i % n == 0){
            m1[c] = i;
            c++;
        }
    }
    System.out.print("Первый диапазон: ");
    for (int i = 0; i < m1.length; i++) {
        if (i != m1.length) System.out.print(m1[i] + ", ");
    }

    int result1 = 0;
    for (int i = min; i < a; i++){
        if (i % n != 0) result1++;
    }
    System.out.println();

    int[] m2 = new int[result1];
    int d = 0;
    for (int i = min; i < a; i ++){
        if (i % n != 0){
            m2[d] = i;
            d++;
        }
    }
    System.out.print("Второй диапазон: ");
    for (int i = 0; i < m2.length; i++) {
        if (i != m2.length) System.out.print(m2[i] + ", ");
    }
}
}