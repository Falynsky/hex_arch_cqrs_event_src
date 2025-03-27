package com.falynsky.hex.adapter.web;


import com.falynsky.hex.domain.CompanyHex;
import com.falynsky.hex.domain.port.in.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public CompanyHex addCompany(@RequestParam String name) {
        return companyService.addCompany(name);
    }

    @GetMapping
    public List<CompanyHex> getAll() {
        return companyService.getAllCompanies();
    }
}