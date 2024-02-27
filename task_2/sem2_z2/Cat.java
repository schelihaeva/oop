package task_2.sem2_z2;

    public class Cat implements Soundable, Movable, Eatable {
    @Override
    public String makeSound() {
    return "Мяу-мяу";
    }
    
    @Override
    public void move() {
    System.out.println("Кот бегает.");
    }
    
    @Override
    public void eat() {
    System.out.println("Кот ест рыбу.");
    }
    }
