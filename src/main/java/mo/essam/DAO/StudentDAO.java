package mo.essam.DAO;

import mo.essam.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "student" ,path = "student" )
public interface StudentDAO extends JpaRepository<Student,Integer> {

//    List<Student> findByName(String name);
//
//    List<Student> findByIdGreaterThan(int id);
//
//    @Query("from Student where name = ?1 order by email")
//    List<Student>  findByNameSorted(String name);
}
