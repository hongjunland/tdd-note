package com.tddnote.user;

import lombok.*;
import org.springframework.http.codec.cbor.Jackson2CborEncoder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserDto{
    @NotBlank
    @Pattern(regexp = ".*[^0-9].*", message = "name must not contain only numbers")
    private String name;
}
