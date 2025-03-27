package com.falynsky.hex.domain.port.in;

import com.falynsky.hex.domain.CompanyHex;

import java.util.List;

public interface CompanyService {
    CompanyHex addCompany(String name);
    List<CompanyHex> getAllCompanies();
}