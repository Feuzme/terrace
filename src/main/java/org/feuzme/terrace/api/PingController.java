package org.feuzme.terrace.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${spring.application.root}")
@RequiredArgsConstructor
public class PingController {
    private final String PING_ENDPOINT = "ping";

    @GetMapping(PING_ENDPOINT)
    public String ping() {
        return "PONG";
    }
}
