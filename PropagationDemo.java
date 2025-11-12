public class PropagationDemo {
    
    public void methodB() { 
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("methodB caught NumberFormatException");
        }
        String s = null;
        s.length(); // This will throw NullPointerException
    }
    
    public void methodA() { 
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println("methodA caught NullPointerException from methodB");
        }
    }
    
    public static void main(String[] args) {
        PropagationDemo demo = new PropagationDemo();
        demo.methodA();
    }
}