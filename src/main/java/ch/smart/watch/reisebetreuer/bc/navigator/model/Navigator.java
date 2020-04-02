package ch.smart.watch.reisebetreuer.bc.navigator.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Navigator {
    private Long id;
    private Long customerId;
    private List<TravelPath> travelPathList;
    private TravelDisruption travelDisruption;
    private Long coTwoUsage;
}
