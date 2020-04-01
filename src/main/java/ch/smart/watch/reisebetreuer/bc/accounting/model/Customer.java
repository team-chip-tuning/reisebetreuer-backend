package ch.smart.watch.reisebetreuer.bc.accounting.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private Long id;
    private String name;
    private String firstName;

}
