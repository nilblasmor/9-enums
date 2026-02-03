package enums.level1.exercise2;

public class Main {

    public static void main(String[] args) {


        Task t1 = new Task(Level.LOW);
        Task t2 = new Task(Level.HIGH);


        t1.printTaskLevel();
        t2.printTaskLevel();

    }

}