package orm;

import entity.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public interface DbContext<E> {

    // create, alter and drop DB tables
    boolean createTable(E entity);

    boolean alterTable(E entity);

    boolean dropTable(E entity);

    // Insert or Update Entity
    boolean persists(E entity) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException;

    // Delete Entity
    boolean delete(E entity);

    Iterable<E> find(Class<?> table) throws SQLException;

    Iterable<E> find(Class<?> table, String where);

    E findFirst(Class<E> table);

    E findFirst(Class<E> table, String where);
}
