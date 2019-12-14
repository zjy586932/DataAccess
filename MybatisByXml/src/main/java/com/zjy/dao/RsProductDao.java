package com.zjy.dao;

import com.zjy.entity.RsProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RsProductDao {
    List<RsProduct> findAll();
}
