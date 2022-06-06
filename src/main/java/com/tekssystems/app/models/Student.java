package com.tekssystems.app.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter @ToString
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    //fields

    String email;
    String name;
    String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return email.equals(student.email) && name.equals(student.name) && password.equals(student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, password);
    }
}
