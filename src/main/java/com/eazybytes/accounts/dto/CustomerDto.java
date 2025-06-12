package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to Hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer", example = "Eazy Bytes"
    )
    @NotNull(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the Customer", example = "tutor@gmail.com"
    )
    @NotNull(message = "Name cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile number of the Customer", example = "8787654567"
    )
    @NotEmpty
    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
