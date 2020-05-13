package com.dataway.hasor;


import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

import java.util.function.Supplier;

/**
 * @author mqz
 * @description
 * @since 2020/5/13
 */
@DimModule
@Component
public class ExampleModule implements SpringModule {

    @Autowired
    private DataSource dataSource;
    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable {
        apiBinder.installModule(new JdbcModule(Level.Full,this.dataSource));
    }
}
