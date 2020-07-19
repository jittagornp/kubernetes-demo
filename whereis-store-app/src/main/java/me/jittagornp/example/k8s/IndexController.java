package me.jittagornp.example.k8s;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author jitta
 */
@RestController
public class IndexController {

    @GetMapping({"", "/"})
    public Mono<String> index() {
        try {
            return Mono.just("Where is Store App : " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            return Mono.just("Where is Store App");
        }
    }

}
