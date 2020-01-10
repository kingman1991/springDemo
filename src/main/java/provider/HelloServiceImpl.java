package provider;

public class HelloServiceImpl  implements HelloService{
    @Override
    public void sayhello(String name) {
        System.out.println("hello"+name);
    }
}
