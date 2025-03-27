package com.falynsky.hex.infrastructure.adapters.adapters.out.persistence;

import com.falynsky.hex.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> {

    Optional<Company> getByName(String name);
}