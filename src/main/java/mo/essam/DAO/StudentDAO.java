package mo.essam.DAO;

import mo.essam.models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDAO extends CrudRepository<Student,Integer> {

    List<Student> findByName(String name);

    List<Student> findByIdGreaterThan(int id);

    @Query("from Student where name = ?1 order by email")
    List<Student>  findByNameSorted(String name);
}
