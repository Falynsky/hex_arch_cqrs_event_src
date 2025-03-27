//package com.falynsky.hex.adapter.persistence;
//
//import com.falynsky.hex.domain.Company;
//import com.falynsky.hex.domain.port.out.CompanyRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class InMemoryCompanyRepository implements CompanyRepository {
//    private final List<Company> companies = new ArrayList<>();
//
//    @Override
//    public Company save(Company company) {
//        companies.add(company);
//        return company;
//    }
//
//    @Override
//    public List<Company> findAll() {
//        return new ArrayList<>(companies);
//    }
//}