package task_2;

public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog("Бобик", 3);
    Animal cat = new Cat("Мурзик", 5);
    
    System.out.println(dog.getName() + " говорит: " + dog.makeSound());
    System.out.println(cat.getName() + " говорит: " + cat.makeSound());
    
    dog.eat(); // Обычный метод
    cat.eat(); // Обычный метод
    }
    }