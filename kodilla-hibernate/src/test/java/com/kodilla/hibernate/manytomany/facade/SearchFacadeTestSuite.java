package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testProcessSearchingEmployee() throws SearchProcessException {
        //Given
        Employee pavelSmith = new Employee("Pavel", "Smith");
        Employee davidJohnson = new Employee("David", "Johnson");
        employeeDao.save(pavelSmith);
        int pavelSmithId = pavelSmith.getId();
        employeeDao.save(davidJohnson);
        int davidJohnsonId = davidJohnson.getId();

        //When
        List<Employee> employeeList = searchFacade.processSearchingEmployee("Smith");

        //Then
        assertEquals(1, employeeList.size());

        //CleanUp
        employeeDao.deleteById(pavelSmithId);
        employeeDao.deleteById(davidJohnsonId);
    }

    @Test
    void testProcessingSearchingCompany() throws SearchProcessException {
        //Given
        Company meta = new Company("Meta");
        Company lidl = new Company("Lidl");
        Company lidEnterprise = new Company("LidEnterprise");
        companyDao.save(meta);
        int metaId = meta.getId();
        companyDao.save(lidl);
        int lidlId = lidl.getId();
        companyDao.save(lidEnterprise);
        int lidEnterpriseId = lidEnterprise.getId();
        //When

        List<Company> companyList = searchFacade.processingSearchingCompany("Lid");

        //Then
        assertEquals(2, companyList.size());

        //CleanUp
        companyDao.deleteById(metaId);
        companyDao.deleteById(lidlId);
        companyDao.deleteById(lidEnterpriseId);
    }
}