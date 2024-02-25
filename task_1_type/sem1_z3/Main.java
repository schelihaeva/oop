package task_1_type.sem1_z3;

public class Main {
    public static void main(String[] args) {
    // Создаем массив животных разных типов
    Animal[] animals = {new Dog(), new Cat()}; //используем дочерние классы как один тип
    
    // Используем полиморфизм для вызова методов makeSound и eat
    for (Animal an : animals) { // перебираем объекты в массиве, в каждом объектк вызываем методы
    an.makeSound(); // Вызываем метод makeSound для каждого объекта
    an.eat(); // Вызываем метод eat для каждого объекта
    System.out.println(); // Для отделения вывода информации о разных животных
    }
    }
    }
