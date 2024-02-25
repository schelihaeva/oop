package task_1_type;
//создаем такой же класс как с Dog, обращаемся к родительскому классу в Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
    super(name, age, "мяу");
    }
    
    public void scratch() {
    System.out.println(getName() + " царапается.");
    }
    
    // Другие методы и свойства, специфичные для кошек
}