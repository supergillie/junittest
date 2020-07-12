package testsson;

public class GreeterMain {

    public static void main(String[] args){
        GreeterMain greeter = new GreeterMain();


        HelloWorldGreetingImpl hl = new HelloWorldGreetingImpl();
        GreetingInterface ml = () -> System.out.println("9990000999;");

        greeter.greet(ml);
    }

    private void greet(GreetingInterface lm) {
        lm.perform();
     }
}







