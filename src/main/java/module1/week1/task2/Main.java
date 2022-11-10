package module1.week1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", " ", "Type:", "Size", "Min. Value", "Max. Value");

        // Поскольку байт 8-битный, мы можем закодировать 2**32 символа (4294967296 сек.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "1", "Integer:", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        // Поскольку байт равен 8 битам, мы можем закодировать 2**16 символов (65536 сек.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "2", "Short:", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

        // Поскольку байт 8-битный, мы можем закодировать 2**8 символов (256 с.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "3", "Byte:", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);

        // Поскольку байт 8-битный, мы можем закодировать 2**64 символа (1.8446744e+19 s.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "4", "Double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);

        // Поскольку байт 8-битный, мы можем закодировать 2**64 символа (1.8446744e+19 s.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "5", "Long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        // Поскольку байт 8-битный, мы можем закодировать 2**32 символа (4294967296 сек.)
        System.out.printf("%-10s %-10s %-10s %-25s %-10s\n", "6", "Float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);

        // Поскольку байт равен 8 битам, мы можем закодировать 2**16 символов (65536 сек.)
        System.out.printf("%-10s %-10s %-10s\n", "7", "Character", Character.SIZE);
    }
}