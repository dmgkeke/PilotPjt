package com.sds.anyframe.mobile.amplt.rest.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.anyframe.mobile.amplt.rest.vo.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
