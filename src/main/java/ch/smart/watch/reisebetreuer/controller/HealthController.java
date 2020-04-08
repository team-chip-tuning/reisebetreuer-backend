package ch.smart.watch.reisebetreuer.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "REST-ENDPOINT: app health controller for pod check", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> index() {
        log.info("Endpoint root health controller is called");
        return ResponseEntity.ok("health check");
    }
}
