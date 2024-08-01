package com.sadiq1698.companyappmicroservice.company;

import com.sadiq1698.companyappmicroservice.company.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompany(Long id);
    Company getCompanyById(Long id);
}
