package functionalInterfeaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("John", "+20 123 456 4789"));

        greetCustomerConsumer
                .accept(new Customer("John", "+20 123 456 4789"));

        greetCustomerV2(new Customer("John", "+20 123 456 4789"), true);

        greetConsumerBiConsumer
                .accept(new Customer("John", "+20 123 456 4789"), true);

        greetConsumerBiConsumer
                .accept(new Customer("John", "+20 123 456 4789"), false);

    }


    // Normal Regular Function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));
    }



    // Consumer Functional Interface
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    // BiConsumer Functional Interface
    static BiConsumer<Customer, Boolean> greetConsumerBiConsumer =
            (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
