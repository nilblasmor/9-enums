package enums.level1.exercise4;

public class Main {

    public static void main(String[] args) {

        StringToEnum s1 = new StringToEnum();

        System.out.println(s1.stringToEnum("high"));
        s1.stringToEnum("IMPOSSIBLE");

    }

}
