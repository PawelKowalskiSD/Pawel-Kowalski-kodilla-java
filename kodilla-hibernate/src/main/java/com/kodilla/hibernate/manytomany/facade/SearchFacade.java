package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private final CompanyDao companyDao;

    private final EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Employee> processSearchingEmployee(String lastname) throws SearchProcessException {

        List<Employee> employeeList = employeeDao.retrieveLastname(lastname);
        LOGGER.info("Searching Employee");
        if (employeeList.isEmpty()) {
            LOGGER.error(SearchProcessException.ERR_NOT_FOUND_EMPLOYEE);
            throw new SearchProcessException(SearchProcessException.ERR_NOT_FOUND_EMPLOYEE);
        }
        return employeeList;
    }

    public List<Company> processingSearchingCompany(String name) throws SearchProcessException {
        List<Company> companyList = companyDao.retrieveThreeCharacter(name);
        LOGGER.info("Searching Company");
        if (companyList.isEmpty()) {
            LOGGER.error(SearchProcessException.ERR_NOT_FOUND_COMPANY);
            throw new SearchProcessException(SearchProcessException.ERR_NOT_FOUND_COMPANY);
        }
        return companyList;
    }
}
