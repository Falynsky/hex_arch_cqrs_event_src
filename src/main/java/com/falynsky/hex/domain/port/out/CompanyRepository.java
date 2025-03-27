package com.falynsky.hex.domain.port.out;


import com.falynsky.hex.domain.CompanyHex;

import java.util.List;

public interface CompanyRepository {
    CompanyHex save(CompanyHex companyHex);
    List<CompanyHex> findAll();
}