public class Praktikum {
    public static void main(String[] args) {
        String checkedName = "Igor Soloviev";

        Account account = new Account(checkedName);

        boolean checkResult = account.checkNameToEmboss();
        account.isNameHasCorrectSpacePosition();

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
}
