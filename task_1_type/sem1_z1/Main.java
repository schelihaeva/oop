
// в этом методе будем запускать конструтор Animal
package task_1_type;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("животное", 6, "рычит");
        // Создаем объекты различных животных, называем как угодно
    Dog dog = new Dog("Бобик", 3); // с помощью new создаем новый класс, в скобках указываем аргументы
    Cat cat = new Cat("Мурка", 5);
    
    // Вызываем общие методы, котороые есть у родительского класса
    dog.makeSound(); // Бобик производит звук: гав
    cat.makeSound(); // Мурка производит звук: мяу
    
    // Вызываем специфичные методы, которые есть у кажого класса наследника
    dog.wagTail(); // Бобик виляет хвостом
    cat.scratch(); // Мурка царапается
    
    // Общие методы также доступны
    dog.eat(); // Бобик ест
    cat.eat(); // Мурка ест
    }
    }