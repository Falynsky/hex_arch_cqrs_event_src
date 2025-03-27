package com.falynsky.hex.application.ports.in;


import com.falynsky.hex.domain.model.Company;

public interface CreateCompanyUseCase {
    void create(Company company);
}
