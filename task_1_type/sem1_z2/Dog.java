package task_1_type.sem1_z2;

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
    }
    
    // Метод для доступа к приватному полю breed
    public String getBreed() { //get передает информацию
    return breed;
    }
    
    // Другие методы и свойства, специфичные для собаки
    }