package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Book");
        Product product1 = new Product("Watch");

        Item item = new Item(new BigDecimal(55), 2, new BigDecimal(110));
        Item item1 = new Item(new BigDecimal(255), 1, new BigDecimal(255));
        Item item2 = new Item(new BigDecimal(2), 5, new BigDecimal(10));

        product.getItems().add(item);
        product.getItems().add(item1);
        product.getItems().add(item2);
        product1.getItems().add(item);

        item.setProduct(product);
        item.setProduct(product1);
        item1.setProduct(product);
        item2.setProduct(product);

        Invoice invoice = new Invoice("FV/124/01/2023");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceDaoId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceDaoId);

        //CleanUp
        invoiceDao.deleteById(invoiceDaoId);
    }
}
