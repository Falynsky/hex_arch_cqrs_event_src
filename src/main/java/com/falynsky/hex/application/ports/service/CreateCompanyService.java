package com.falynsky.hex.application.ports.service;

import com.falynsky.hex.application.ports.in.CreateCompanyUseCase;
import com.falynsky.hex.application.ports.out.GetCompanyPort;
import com.falynsky.hex.application.ports.out.SaveCompanyPort;
import com.falynsky.hex.domain.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyService implements CreateCompanyUseCase {

    private final SaveCompanyPort saveCompanyPort;
    private final GetCompanyPort getCompanyPort;

    @Override
    public void create(Company company) {
        Company companyExists = getCompanyPort.get(company.name());

        if (companyExists == null) {
            saveCompanyPort.save(company);
        }
    }
}
