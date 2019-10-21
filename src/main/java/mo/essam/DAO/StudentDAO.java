package mo.essam.DAO;

import mo.essam.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,Integer> {
}
