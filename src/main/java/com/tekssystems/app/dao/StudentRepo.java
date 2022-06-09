package com.tekssystems.app.dao;

import com.tekssystems.app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
    Student findByName(String name);
    // select * from Student where name = "";
}
