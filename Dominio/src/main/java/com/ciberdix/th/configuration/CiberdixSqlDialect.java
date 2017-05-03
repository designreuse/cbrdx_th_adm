package com.ciberdix.th.configuration;

import org.hibernate.dialect.SQLServer2012Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;

public class CiberdixSqlDialect extends SQLServer2012Dialect {

    public CiberdixSqlDialect() {
        super();
        registerFunction("REPLACE", new StandardSQLFunction("REPLACE"));
    }
}
