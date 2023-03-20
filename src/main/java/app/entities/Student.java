package app.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "studens")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToOne
    private Department department;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Subject> subjects = new ArrayList<>();
}
