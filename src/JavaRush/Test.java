package JavaRush;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
/*class OtherAnimal extends Animal {
    public void eat(){
        System.out.println("Other animal is eating...");
    }
}*/
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        //OtherAnimal otherAnimal = new OtherAnimal();
        //otherAnimal.eat();
        Animal animal2 = new Animal() { // в переменной aminal2 лежит не объект класса Animal, а его наследник...
          public void eat() { // ... с переопределенным методом eat
              System.out.println("Other animal is eating...");
          } // этот объект создается только один раз
        }; // после анониманого класса ставится точка с запятой
        animal2.eat();
    }
}
