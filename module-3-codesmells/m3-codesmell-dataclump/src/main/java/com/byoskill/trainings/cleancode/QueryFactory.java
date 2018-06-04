package com.byoskill.trainings.cleancode;

import java.util.List;

public enum QueryFactory {

    INSTANCE;

    public Query createSelectQuery(final String query, final List<?> parameters) {
        return new Query(QueryType.SELECT, query, parameters);
    }

    public Query createInsertQuery(final String query, final List<?> parameters) {
        return new Query(QueryType.INSERT, query, parameters);
    }

    public Query createUpdateQuery(final String query, final List<?> parameters) {
        return new Query(QueryType.UPDATE, query, parameters);
    }

    public Query createDeleteQuery(final String query, final List<?> parameters) {
        return new Query(QueryType.DELETE, query, parameters);
    }
}
