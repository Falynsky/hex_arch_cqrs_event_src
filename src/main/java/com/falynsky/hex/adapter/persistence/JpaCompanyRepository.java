package com.falynsky.hex.adapter.persistence;


import com.falynsky.hex.domain.CompanyHex;
import com.falynsky.hex.domain.port.out.CompanyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCompanyRepository extends JpaRepository<CompanyHex, Long>, CompanyRepository {
}