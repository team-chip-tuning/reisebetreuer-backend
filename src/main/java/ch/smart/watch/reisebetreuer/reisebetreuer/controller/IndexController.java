package ch.smart.watch.reisebetreuer.reisebetreuer.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "info endpoint", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RestController
@RequestMapping("info")
public class IndexController {

    @GetMapping("msg")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World v1");
    }
}
