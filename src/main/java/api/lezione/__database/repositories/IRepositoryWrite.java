package api.lezione.__database.repositories;

import java.util.List;

public interface IRepositoryWrite<T>{

    boolean Insert(T obj);
    boolean Update(T obj);
    boolean Delete(int id);
}
