package ch.smart.watch.reisebetreuer.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "REST-ENDPOINT: app information", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RestController
@RequestMapping("info")
public class IndexController {

    @GetMapping("status")
    public ResponseEntity<String> index() {
        log.info("Endpoint status is called");
        return ResponseEntity.ok("Smart watch Reisebetreuer App v1 is up and running.. have a nice day");
    }
}
