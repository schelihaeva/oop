package task_1_type.sem1_z3;

class Cat extends Animal {
    @Override //показатель полиморфизма, проверяет есть ли этот метод в классе родителя
    public void makeSound() {
    System.out.println("Кошка мяучит");
    }
    
    @Override
    public void eat() {
    System.out.println("Кошка ест рыбу");
    }
    }