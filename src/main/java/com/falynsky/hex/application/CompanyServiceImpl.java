package com.falynsky.hex.application;

import com.falynsky.hex.domain.CompanyHex;
import com.falynsky.hex.domain.port.in.CompanyService;
import com.falynsky.hex.domain.port.out.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final AtomicLong idGenerator = new AtomicLong();

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyHex addCompany(String name) {
        CompanyHex companyHex = new CompanyHex(null, name);
        return companyRepository.save(companyHex);
    }

    @Override
    public List<CompanyHex> getAllCompanies() {
        return companyRepository.findAll();
    }
}
