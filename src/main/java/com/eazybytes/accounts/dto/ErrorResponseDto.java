package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to Hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API Path invoke by Client"
    )
    private String apiPath;

    @Schema(
            description = "The code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error happened"
    )
    private String errorMessage;

    @Schema(
            description = "Representing when the error happened"
    )
    private LocalDateTime errorTime;
}
