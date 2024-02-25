
package oop.dz_sem1 ;

public class Main {
    public static void main(String[] args) {
    // Создаем массив напитков разных типов
    HotDrink[] hotDrink = {new Tea(), new Coffee(), new HotChocolate()}; //используем дочерние классы как один тип
    
    // Используем полиморфизм для вызова методов makeSound и eat
    for (HotDrink an : hotDrink) { // перебираем объекты в массиве, в каждом объектк вызываем методы
    an.makeTemperature(); // Вызываем метод makeSound для каждого объекта
    an.volume(); // Вызываем метод volume для каждого объекта
    System.out.println(); // Для отделения вывода информации о разных напитках
    }
    }
    }
