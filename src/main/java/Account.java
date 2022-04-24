import java.util.regex.Pattern;

public class Account {

    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 19;

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null){
            return false;
        }

        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH){
            return false;
        }

        return Pattern
            .compile("^[A-Za-zА-Яа-я]{1," + (MAX_NAME_LENGTH - 2) + "} [A-Za-zА-Яа-я]{1," + (MAX_NAME_LENGTH - 2) + "}$")
            .matcher(name)
            .find();
    }
}