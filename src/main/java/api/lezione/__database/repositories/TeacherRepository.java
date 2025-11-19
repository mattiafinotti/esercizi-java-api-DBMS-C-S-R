package api.lezione.__database.repositories;

import api.lezione.__database.models.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherRepository implements IRepositoryRead<Teacher> {
    @Override
    public Teacher getById(int id) {
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return List.of();
    }
}
