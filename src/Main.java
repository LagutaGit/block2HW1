public class Main {
    public static void main(String[] args) {
//        5
        int value = 33;
        value = changeValue(value);
        System.out.println(value);
//        6
        Integer value2 = 33;
        value2 = changeValue(value2);
        System.out.println(value2);

//        5
        /*Данный выводит число 22 так как в методе
        * changeValue есть переменная value, которая равна 22
        * в методе main мы обращаемся к этому методу
        * перезаписываем переменную и она становится равной 22м*/
//        6
        /*Integer – это обьект (как String ) и, соответственно, ему выделяется
        больше памяти, чем постоянному типу int.



        */

    }

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static int changeValue2(int value2) {
        value2 = 22;
        return value2;
    }
}