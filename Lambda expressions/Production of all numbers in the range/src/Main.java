import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        long count = y - x;
        long product = 1;
        for (int i = 0; i <= count; i++) {
            product = (x + i) * product;
        }
        return product;
    };
}