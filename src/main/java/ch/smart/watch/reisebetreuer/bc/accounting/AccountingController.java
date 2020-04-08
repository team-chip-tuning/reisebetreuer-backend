package ch.smart.watch.reisebetreuer.bc.accounting;

import ch.smart.watch.reisebetreuer.bc.accounting.model.Customer;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "REST-ENDPOINT: accounting bounded context", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RestController
@RequestMapping("api/v1/accounting")
public class AccountingController {

    private final CustomerService customerService;

    public AccountingController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> index(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("allCustomer")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

    @GetMapping("add/{name}/{firstName}")
    public ResponseEntity<String> addNewCustomer(@PathVariable String name, @PathVariable String firstName) {
        var customer = Customer.builder().name(name).firstName(firstName).build();
        customerService.addNewCustomer(customer);
        return ResponseEntity.ok("add new customer");
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("delete customer");
    }
}
