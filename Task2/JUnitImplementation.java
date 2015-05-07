package Task2;

public class JUnitImplementation {
    @before
    public void bef() {
        System.out.println("bef");
    }
    
    @execute
    public void ex()
    {
        System.out.println("execute");
    }
    @after
    public void af()
    {
        System.out.println("after");
    }
   
}
