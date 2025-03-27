package com.falynsky.hex.infrastructure.adapters.adapters.in.rest;

import com.falynsky.hex.application.ports.in.CreateCompanyUseCase;
import com.falynsky.hex.infrastructure.adapters.adapters.in.rest.dto.CreateCompanyRequest;
import com.falynsky.hex.domain.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CreateCompanyUseCase createCompanyUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCompany(@RequestBody CreateCompanyRequest request) {
        Company company = new Company(request.name);
        createCompanyUseCase.create(company);
    }
}