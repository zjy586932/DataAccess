package com.zjy.service;

import com.zjy.dao.RsProductDao;
import com.zjy.entity.RsProduct;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class RsProductService {

    RsProductDao rsProductDao;

    public RsProductService(RsProductDao rsProductDao) {
        this.rsProductDao = rsProductDao;
    }

    public List<RsProduct> selectAll(){
        return rsProductDao.findAll();
    }
}
