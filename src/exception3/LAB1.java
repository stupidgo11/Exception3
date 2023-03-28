package exception3;

public class LAB1 {
    public static void main(String[] args) {
        //A
        //System.out.println(1/0);
        
        //B
        int[] list = new int [5];
        System.out.println(list[5]);
        
        //C
        //String s = "abc";
        //System.out.println(s.charAt(3));
        
        //D
        //Object o = new Object();
        //String d = (String)o;
        
        //E
        //Object o = null;
        //System.out.println(o.toString());
        
        //F
        //System.out.println(1.0/0);
        throw new ArithmeticException();
    }
}
