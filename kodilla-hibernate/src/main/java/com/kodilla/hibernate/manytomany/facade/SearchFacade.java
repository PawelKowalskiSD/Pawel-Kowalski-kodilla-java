package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);


    public void processSearching(final EmployeeDao employee, String lastname) throws SearchProcessException {
        boolean wasError = false;
        employee.retrieveLastname(lastname);
    }
}
