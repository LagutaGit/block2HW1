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
//        7
        Integer[] value3 = {3, 4};
        changeValue3(value3);
        for (int i = 0; i < value3.length; i++) {
            System.out.println(value3[i] + " ");
        }
//        8
        Integer[] value4 = {3, 4};
        changeValue4(value4);
        for (int i = 0; i < value4.length; i++) {
            System.out.println(value4[i]);
        }


//        5
        /*Данный выводит число 22 так как в методе
        * changeValue есть переменная value, которая равна 22
        * в методе main мы обращаемся к этому методу
        * перезаписываем переменную и она становится равной 22м*/
//        6
        /*Integer – это обьект (как String ) и, соответственно, ему выделяется
        больше памяти, чем постоянному типу int.
        Так как мы используем Integer, намм необходимо приводить значение переменной
        к типу данных явно.
        */
//        7
        /*
            если распечатать массив в методе main, то какие у него будут значения?
            У него будут значения 3, 4 потому что в методе main вы задаём для него новые числовые значения.
            Т.е. метод ему отправлял значения 1, 2, но так как в методе main мы задаём новые значения
            то будет выводиться 3,4
        * */
        /*
        8
           Если распечатать значения в методе main, то они будут 99, 4
           Так происходит потому что мы передаём новое значение мз метода changeValue в метод main
           и это новое значение перезаписывает его по первому элементу, т.е было value[0] = 3
           стало value[0]=99
           Если сравнивать данное задание с 7, то в 7 задании мы перезаписывали оба значения,
           а в этом задании мы перезаписали только 1 значение.
        */

//        9
        /*

        */

    }

    public static int changeValue(int value) {
        value = 22;
        return value;
    }

    public static Integer changeValue2(Integer value2) {
        value2 = 22;
        return value2;
    }   public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{1,2};
    }

    public static void changeValue4(Integer[] value4) {
        value4[0] = 99;
    }
}