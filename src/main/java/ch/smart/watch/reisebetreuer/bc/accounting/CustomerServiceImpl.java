package ch.smart.watch.reisebetreuer.bc.accounting;

import ch.smart.watch.reisebetreuer.bc.accounting.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList;

    public CustomerServiceImpl() {
        customerList = new ArrayList<>();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerList;
    }

    @Override
    public Customer getCustomerById(Long id) {
        var findCustomer = customerList
                .parallelStream()
                .filter(customer -> customer.getId().equals(id))
                .findAny();
        return findCustomer.isPresent() ? findCustomer.get() : Customer.builder().build();
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customer.setId(Long.valueOf(customerList.size()));
        customerList.add(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        var deleteCustomer = customerList
                .parallelStream()
                .filter(customer -> customer.getId().equals(id))
                .findAny();

        if (deleteCustomer.isPresent()) {
            customerList.remove(deleteCustomer.get());
        }
    }
}
