package task_2.sem2_z2;

// Интерфейс для представления звуков, издаваемых животными
public interface Soundable {
    String makeSound();


    // Дефолтный метод
default void defaultMethod() { //default void используем, если у нас есть базовая реализация метода, и нам его не надо переопределять
System.out.println("Это дефолтный метод в интерфейсе Soundable.");
}

// Статический метод
static void staticMethod() { //static void - вызывается в самом методе
    System.out.println("Это статический метод в интерфейсе Soundable.");
    }

    // Константа- значение переменной, кторое не может быть изменено
String SOUND_TYPE = "Звук";
String FOOD_TYPE = null;
    }