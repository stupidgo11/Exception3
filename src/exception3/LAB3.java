package exception3;

public class LAB3 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("statement 1");
            System.out.println(list[10]);
            System.out.println("statement 3");
        }
        catch(ArithmeticException e){ 
        }
        finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
