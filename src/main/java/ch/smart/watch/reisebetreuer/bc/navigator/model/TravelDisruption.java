package ch.smart.watch.reisebetreuer.bc.navigator.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TravelDisruption {
    private Long id;
    private String disruptionLocation;
    private LocalDateTime disruptionTime;
}
