package enums.level1.exercise3;

public class Task {

    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void printTaskLevel() {
        System.out.println("Task is level " + level + ", with color " + level.getColor() + ".");
    }

}

