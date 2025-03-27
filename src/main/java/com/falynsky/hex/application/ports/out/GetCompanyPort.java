package com.falynsky.hex.application.ports.out;


import com.falynsky.hex.domain.model.Company;

public interface GetCompanyPort {
    Company get(String name);
}
