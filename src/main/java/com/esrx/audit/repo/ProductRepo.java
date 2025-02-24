package com.esrx.audit.repo;

import com.esrx.audit.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>, RevisionRepository<Product,Integer,Integer> {
}
