package ch.smart.watch.reisebetreuer.bc.navigator;

import ch.smart.watch.reisebetreuer.bc.navigator.model.Navigator;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "REST-ENDPOINT: navigator bounded context", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RestController
@RequestMapping("api/v1/navigator")
public class NavigatorController {

    private final NavigatorService navigatorService;


    public NavigatorController(NavigatorService navigatorService) {
        this.navigatorService = navigatorService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Navigator> index(@PathVariable Long id) {
        log.info("Navigator is called");
        return ResponseEntity.ok(navigatorService.getNavigatorById(id));
    }
}
