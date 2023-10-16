package org.feuzme.terrace.domain.beans;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.feuzme.terrace.domain.enums.CardinalEnum;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class StreetProps {
    @NotBlank
    CardinalEnum orientation;
    @NotBlank
    Integer BuildingsFloors;
    @NotBlank
    CardinalEnum streetSide;
}
