package org.feuzme.terrace.api;

import jakarta.validation.Valid;
import org.feuzme.terrace.domain.beans.StreetProps;
import org.feuzme.terrace.infrastructure.exceptions.BadRequestException;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("${spring.application.root}")
public class IsItSunnyController {
    protected final String SUNNY_ENDPOINT = "sunny";

    @PostMapping(SUNNY_ENDPOINT)
    public Boolean isItSunny(@Valid StreetProps props) {
        if (ObjectUtils.isEmpty(props)) {
            throw new BadRequestException("Street props are not set");
        }
        LocalDateTime requestDate = LocalDateTime.now();
        return false;
    }
}
