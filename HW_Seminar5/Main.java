package HW_Seminar5;

import java.util.HashMap;


public class Main {
    
    public static void main(String[] args) {

        HashMap<Integer, String> cars = new HashMap<>();

        cars.put(0, "mazda");
        cars.put(1, "skoda");
        cars.put(2, "audi");
        cars.put(3, "bmw");
        cars.put(4, "kia");
        cars.put(5, "mercedes");
        System.out.println("Ваш список брендов автомобилей: ");
        System.out.println(cars.values());
        System.out.println();
        
        for (Integer item: cars.keySet()){
            cars.compute(item, (k, v) -> v + "!");
        }
        
        System.out.println("Ваш изменённый список: ");
        System.out.println(cars.values());
        System.out.println();


        HashMap<Integer, String> city = new HashMap<>();

        city.put(0, "Samara");
        city.put(2, "Ekaterinburg");
        city.put(1, "Moscow");
        city.put(3, "St.Petersburg");
        city.put(14, "Penza");
        city.put(8, "Kazan");
        city.put(10, "Saratov");
        System.out.println("Ваш список городов: ");
        System.out.println(city.values());
        System.out.println();


        for (Integer item: city.keySet()){
            city.merge(item, cars.getOrDefault(item, "?"), (v1 , v2) -> v2 + " " + v1);
        }
        System.out.println("Объединённый список: ");
        System.out.println(city.values());
        System.out.println("Объединённый список с ключами: ");
        System.out.println(city);

    }
}

