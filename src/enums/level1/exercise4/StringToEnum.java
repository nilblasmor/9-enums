package enums.level1.exercise4;

public class StringToEnum {

    public Level stringToEnum(String s) {
        try {
            return Level.valueOf(s.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input.");
            return null;
        }
    }

}
