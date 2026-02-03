package enums.level1.exercise2;

public class Task {

    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void printTaskLevel() {
        switch (level) {
            case LOW:
                System.out.println("The task is easy.");
                break;
            case MEDIUM:
                System.out.println("The task is moderate in difficulty.");
                break;
            case HIGH:
                System.out.println("The task is hard.");
                break;
        }
    }

}

