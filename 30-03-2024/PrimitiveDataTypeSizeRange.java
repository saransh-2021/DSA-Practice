// write a program to print the size and range of all primitive datatypes by using sizeof operator

public class PrimitiveDataTypeSizeRange {
    public static void main(String[] args) {
        System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
        
        System.out.println("Range of byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Range of short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Range of int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Range of long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Range of char: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        System.out.println("Range of float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Range of double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
    }
}
