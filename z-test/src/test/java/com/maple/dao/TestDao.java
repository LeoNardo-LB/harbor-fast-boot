package com.maple.dao;

import com.maple.ServiceTestBase;
import com.maple.dal.dao.TestTableDao;
import com.maple.dal.entity.TestTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDao extends ServiceTestBase {

    @Autowired
    private TestTableDao testTableDao;

    @Test
    public void test_(){
        TestTable entity = new TestTable();
        int insert = testTableDao.insert(entity);
        System.out.println(insert);
    }

}
