package com.byoskill.trainings.cleancode;

import java.util.List;

public class Query {
    private final QueryType mode;
    private final String query;
    private final List<?> parameters;

    public Query(QueryType mode, String query, List<?> parameters) {
        this.mode = mode;
        this.query = query;
        this.parameters = parameters;
    }

    public QueryType getMode() {
        return mode;
    }

    public String getQuery() {
        return query;
    }

    public List<?> getParameters() {
        return parameters;
    }
}
