package com.tekssystems.app;

import com.tekssystems.app.dao.StudentRepo;
import com.tekssystems.app.models.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component @Slf4j
public class AppCommandLineRunner implements CommandLineRunner {

    private StudentRepo studentRepo;

    @Autowired
    public AppCommandLineRunner(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepo.save(new Student("jafer@gmail.com", "jafer", "password"));
        Student s = studentRepo.findByName("Jafer");

        log.info(s.toString());
    }
}
