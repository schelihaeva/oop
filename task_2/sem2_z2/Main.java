package task_2.sem2_z2;

public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.defaultMethod(); //обращаемся к дефолтному методу
    Soundable.staticMethod(); //обращаемся к статическомй методу
    // Доступ к константе из интерфейса Eatable
   System.out.println("Тип пищи: " + Soundable.SOUND_TYPE); //обращаемся к константе
    }
    }