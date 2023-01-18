package tech.tresearchgroup.dao.controller;

import java.util.List;

public interface DatabaseAccessObject {
    boolean create(Object object);

    Object read(Long id);

    List<Object> readAll();

    List readPaginated(int resultCount, int page);

    List readNewestPaginated(int resultCount, int page);

    List readPopularPaginated(int resultCount, int page);

    boolean update(Object object);

    boolean delete(long id);

    long getTotal();

    long getTotalPages(int maxResultsSize);

    List databaseSearch(int maxResultsSize, String query, String returnColumn, String searchColumn);
}
