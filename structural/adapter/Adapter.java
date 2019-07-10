package structural.adapter;

public class Adapter implements ClientExpectedInterface {

    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void clientExpectedMethodName() {
        service.someSpecificMethodName();
    }
}
