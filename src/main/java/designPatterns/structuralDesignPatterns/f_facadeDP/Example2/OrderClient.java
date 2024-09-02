package designPatterns.structuralDesignPatterns.f_facadeDP.Example2;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade= new OrderFacade();
        orderFacade.createOrder();
    }
}
