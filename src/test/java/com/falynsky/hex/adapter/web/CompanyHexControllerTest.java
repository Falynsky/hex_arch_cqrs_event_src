package com.falynsky.hex.adapter.web;


import com.falynsky.hex.domain.CompanyHex;
import com.falynsky.hex.domain.port.in.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(CompanyController.class)
class CompanyHexControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CompanyService companyService;

    @Test
    void shouldReturnAllCompanies() throws Exception {
        when(companyService.getAllCompanies()).thenReturn(List.of(
                new CompanyHex(1L, "A"), new CompanyHex(2L, "B")));

        mockMvc.perform(get("/companies"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }
}