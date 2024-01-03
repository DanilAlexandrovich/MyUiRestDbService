package ru.dubovitskiy.MyUiRestDbService.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dubovitskiy.MyUiRestDbService.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
