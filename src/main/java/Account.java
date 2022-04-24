import java.util.regex.Pattern;

public class Account {

    private static final int MIN_NAME_LENGTH = 3;
    private static final int MAX_NAME_LENGTH = 19;

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean isNameLongerThanMinimumLength(){
        return name.length() >= MIN_NAME_LENGTH;
    }

    public boolean isNameShorterThanMaximumLength(){
        return name.length() <= MAX_NAME_LENGTH;
    }

    public boolean isNameHasCorrectSpacePosition(){
        return Pattern.compile("^[A-Za-z]+ [A-Za-z]+$").matcher(name).find();
    }

    public boolean checkNameToEmboss() {
        return isNameLongerThanMinimumLength()
            && isNameShorterThanMaximumLength()
            && isNameHasCorrectSpacePosition();
    }
}