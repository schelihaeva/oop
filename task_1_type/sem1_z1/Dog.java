package task_1_type;

public class Dog extends Animal {
    public Dog(String name, int age) { //создаем конструктор, конструктор-это метод,в котором известны поля кроме одного по умолчанию
    super(name, age, "гав"); // у нас есть два поля name и age, а поле sound задаем по умолчанию, метод super как раз нам помогает задать поле по умолчанию, мы задаем те же поля, что и в Animal в 9 строке, где заданы 3 переменные
    }
    
    public void wagTail() {
    System.out.println(getName () + " виляет хвостом.");
    }
    
   
    }
