package enums.level1.exercise1;

public class PrintDayType {

    public void printDayType(Day day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend.");
                break;
            default:
                System.out.println("Working day.");
        }
    }

}
