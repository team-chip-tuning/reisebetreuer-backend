package ch.smart.watch.reisebetreuer.bc.navigator.model;

import lombok.*;

import java.time.LocalDateTime;


@Data
@Builder
public class TravelPath {
    private Long id;
    private String geoDataLocation;
    private String locationName;
    private LocalDateTime departureTime;
    private TravelType travelType;
}
