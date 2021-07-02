package com.example.repository;

import com.example.domain.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepositoryCustom{

    @PersistenceContext
    private EntityManager pr;


    @Override
    public List<Product> getAllProduct() {
        StoredProcedureQuery findByYearProcedure =
                pr.createNamedStoredProcedureQuery("getAllProduct");
        return findByYearProcedure.getResultList();
    }
}

