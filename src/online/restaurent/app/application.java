package online.restaurent.app;
import  online.restaurent.Customer;
import  online.restaurent.Vendor;
import  online.restaurent.Order;

import java.util.Date;

public class application {
    public static void main(String [] args){
        Customer aditya = new Customer();
        aditya.setName("ADTy");
        aditya.setCity("Nagpur");
        aditya.setAddress("New Nandanwan, Nagpur");
        aditya.setState("Maharashtra");
        aditya.setEmailId("aawankhade123@gmail.com");
        aditya.setPhoneNumber(8421079656l);

        System.out.println("Name :"+aditya.getName());
        System.out.println("City :"+aditya.getCity());
        System.out.println("Address : "+aditya.getAddress());
        System.out.println("State :"+aditya.getState());
        System.out.println("Email :"+aditya.getEmailId());
        System.out.println("Phone Number :"+aditya.getPhoneNumber());

        Vendor haldiram= new Vendor();
        haldiram.setName("Haldiram Veg Restaurent");
        haldiram.setAddress("Ajini Square, Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(7965687847l);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("\nVendor Details :");
        System.out.println("Name :"+haldiram.getName());
        System.out.println("Address : "+haldiram.getAddress());
        System.out.println("Category : "+haldiram.getCategory());
        System.out.println("Phone Number :"+haldiram.getPhoneNumber());
        System.out.println("Rating :"+haldiram.getRating());
        System.out.println("State :"+haldiram.getState());
        System.out.println("City :"+haldiram.getCity());


        Order order= new Order();
        order.setCustomer(aditya);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101, civil lines, Nagpur");

        System.out.println("Order Details :");
        System.out.println("Total Amount :"+order.getTotalAmount());
        System.out.println("Order Date :"+order.getOrderDate());
        System.out.println("Order Delivery Address :"+order.getDeliveryAddress());


    }
}
