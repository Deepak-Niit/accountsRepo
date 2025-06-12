package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to Hold Account Information"
)
public class AccountsDto {


    @NotEmpty
    @Pattern(regexp = "($|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of Eazy bank Account", example = "7876543454"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be null or empty")
    @Schema(
            description = "Account Type of Eazy bank Account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "Eazy Bank branch address" , example = "123 NewYork"
    )
    private String branchAddress;
}
