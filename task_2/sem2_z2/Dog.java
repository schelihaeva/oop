package task_2.sem2_z2;
// интерфейс описывает то,что должно быть сделано ,в инетрефейсе мы задаем поведение(звук,цвет и т.д.), а здесь в классе мы реализуем это поведение
public class Dog implements Soundable, Movable, Eatable {  //implements -позволяет использовать все заданные интерфейсы
    @Override //реализуем абстрактные методы
    public String makeSound() {
    return "Гав-гав";
    }
    
    @Override //реализуем абстрактный метод
    public void move() {
    System.out.println("Собака бежит.");
    }
    
    @Override
    public void eat() {
    System.out.println("Собака ест кость.");
    }
    }
