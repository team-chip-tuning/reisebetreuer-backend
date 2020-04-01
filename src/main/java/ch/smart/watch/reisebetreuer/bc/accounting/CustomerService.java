package ch.smart.watch.reisebetreuer.bc.accounting;

import ch.smart.watch.reisebetreuer.bc.accounting.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void addNewCustomer(Customer customer);

    void deleteCustomer(Long id);
}
