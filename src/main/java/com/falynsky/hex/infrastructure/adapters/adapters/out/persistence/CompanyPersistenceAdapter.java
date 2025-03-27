package com.falynsky.hex.infrastructure.adapters.adapters.out.persistence;


import com.falynsky.hex.application.ports.out.GetCompanyPort;
import com.falynsky.hex.application.ports.out.SaveCompanyPort;
import com.falynsky.hex.domain.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompanyPersistenceAdapter implements SaveCompanyPort, GetCompanyPort {

    private final CompanyJpaRepository repository;

    @Override
    public void save(Company company) {
        CompanyEntity entity = new CompanyEntity();
        String name = company.name();
        entity.setName(name);
        repository.save(entity);
    }

    @Override
    public Company get(String name) {
        return repository.getByName(name).orElse(null);
    }
}