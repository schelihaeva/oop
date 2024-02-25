//папки называем с маленькой буквы, классы называем с большой буквы

package task_1_type;
public class Animal { //объявлеяем класс как конкретный объект реального мира
    private String name; //задаем параметры -имя
    private int age;  // задаем параметры-возраст
    private String sound; //задаем параметры-звук, которй издает животное
    
    public Animal(String param, int age, String sound) { //public -конструктор это обычный метод, который выполняет обычные действия, в скобках заданы аргументы, их называем как хотим
    name = param; // с помощью this -обращаемся к 5 строке, где задано name к переменной класса
    this.age = age; //обращаемся к 6 строчке, где задано age
    this.sound = sound; //обращаемся к 7 строчке, где задано sound
    }
    
    public void makeSound() { //метод void он ничего не возвращает
    System.out.println(name + " производит звук: " + sound); //вывподим на экран значение переменной name, какой то текст и значение sound
    }
    
    public void eat() { // void ничего не возвращает,
    System.out.println(name + " ест."); // выводит значение переменной name  и текст
    }
    
    public String getName() { //функция get помогает нам получить какие то данные
        return name; //возвращаем значение name
        }
        
        public int getAge() {
        return age;
        }
        
        public String getSound() {
        return sound;
        }
    }