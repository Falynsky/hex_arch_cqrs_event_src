package com.falynsky.hex.application.ports.out;


import com.falynsky.hex.domain.model.Company;

public interface SaveCompanyPort {
    void save(Company company);
}
