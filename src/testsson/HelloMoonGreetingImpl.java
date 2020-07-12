package testsson;

public class HelloMoonGreetingImpl implements GreetingInterface {
    @Override
    public void perform() {
        System.out.println("hellomoon");
    }
}
