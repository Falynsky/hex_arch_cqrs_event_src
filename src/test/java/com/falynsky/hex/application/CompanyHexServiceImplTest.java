package com.falynsky.hex.application;

import com.falynsky.hex.domain.CompanyHex;
import com.falynsky.hex.domain.port.out.CompanyRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class CompanyHexServiceImplTest {

    @Test
    void shouldAddCompany() {
        CompanyRepository repo = mock(CompanyRepository.class);
        CompanyServiceImpl service = new CompanyServiceImpl(repo);

        CompanyHex mockCompanyHex = new CompanyHex(1L, "Test");
        when(repo.save(any())).thenReturn(mockCompanyHex);

        CompanyHex result = service.addCompany("Test");

        assertEquals("Test", result.getName());
    }

    @Test
    void shouldGetAllCompanies() {
        CompanyRepository repo = mock(CompanyRepository.class);
        List<CompanyHex> mockList = List.of(new CompanyHex(1L, "A"), new CompanyHex(2L, "B"));
        when(repo.findAll()).thenReturn(mockList);

        CompanyServiceImpl service = new CompanyServiceImpl(repo);
        List<CompanyHex> result = service.getAllCompanies();

        assertEquals(2, result.size());
    }
}