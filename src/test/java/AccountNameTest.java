import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNameTest {

    private final String name;
    private final boolean expectedCheckResult;

    public AccountNameTest(String name, boolean expectedCheckResult){
        this.name = name;
        this.expectedCheckResult = expectedCheckResult;
    }

    @Parameterized.Parameters
    public static Object[][] getColorsData() {
        return new Object[][]{
            { "", false },
            { ".", false },
            { "+", false },
            { "        ", false },
            { "123456789012345678901234567890", false },
            { "1234567", false },
            { " ", false },
            { "  ", false },
            { "a ", false },
            { " a", false },
            { "1 1", false },
            { "a 1", false },
            { "1 a", false },
            { "+ +", false },
            { "a +", false },
            { "+ a", false },
            { "11111 22222", false },
            { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a", false },
            { "a aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false },
            { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", false },
            { "aaaaaaaaaaaaaaaaaaaaaaaaaa bbbbbbbbbbbbbbbbbbbbbbb", false },
            { "I. Soloviev", false },
            { "ТимотейШевроле", false },
            { "a a", true },
            { "aaaaa aaaaa", true },
            { "aaaaaaaaaaaaaaaaa a", true },
            { "a aaaaaaaaaaaaaaaaa", true },
            { "Igor Soloviev", true },
            { "Тимоти Шаламе", true },
            { "AAA BBB", true },
        };
    }

    @Test
    public void shouldMakeOrderTest() {
        Assert.assertEquals(
            "Имя должно содержать один пробел, не в начале и не вконце имени.",
            expectedCheckResult,
            new Account(name).checkNameToEmboss()
        );
    }
}
