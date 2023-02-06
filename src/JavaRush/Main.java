package JavaRush;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Big", "Blue", "Half-box", false, 56123);
        Woman woman = new Woman("Big", "Blue", "Half-box", false, 56123);
        // Woman woman = new Woman("Small", "Green", "Square", false, 46558);
        System.out.println(man.equals(woman));
    }
}
