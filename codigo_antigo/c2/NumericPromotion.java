public class NumericPromotion {
    public static void main(String... args) {
        float number1 = 5f;
        double number2 = 3.46;
        var result1 = number1 + number2;

        short number3 = 1;
        short number4 = 3;

        var result2 = number3 + number4;

        long number5 = 123123891289L;
        int number6 = 123123;
        var result3 = number5 + number6;

        System.out.println(((Object) result1).getClass().getSimpleName());
        System.out.println(((Object) result2).getClass().getSimpleName());
        System.out.println(((Object) result3).getClass().getSimpleName());
    }
}
