package designPatterns.structuralDesignPatterns.f_facadeDP.Example2;

import designPatterns.structuralDesignPatterns.f_facadeDP.Example2.comlexClasses.Invoice;
import designPatterns.structuralDesignPatterns.f_facadeDP.Example2.comlexClasses.Payment;
import designPatterns.structuralDesignPatterns.f_facadeDP.Example2.comlexClasses.ProductDAO;
import designPatterns.structuralDesignPatterns.f_facadeDP.Example2.comlexClasses.SendNotification;

public class OrderFacade {
    private ProductDAO productDAO;
    private Invoice invoice;
    private Payment payment;
    private SendNotification notification;

    public OrderFacade(){
        productDAO= new ProductDAO();
        invoice = new Invoice();
        payment= new Payment();
        notification = new SendNotification();
    }

    public void createOrder(){
        Product product= productDAO.getProduct(121); // step 1
        payment.makePayment(); // step 2
        invoice.generateInvoice(); // step 3
        notification.sendNotification(); // step 4
        System.out.println("order creation successful");
    }
}
