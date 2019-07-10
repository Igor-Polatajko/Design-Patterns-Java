package structural.adapter;

public class Client {

    public static void main(String[] args) {
        // Instantiating service
        Service service = new ServiceImpl();

        // Instantiating adapter
        ClientExpectedInterface cli = new Adapter(service);

        // Using expected interface
        cli.clientExpectedMethodName();
    }
}
