package ch.smart.watch.reisebetreuer.bc.navigator.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TripAlternative {
    private Long id;
    private Long travelDisruptionId;
    private List<TravelPath> travelPathList;
}
