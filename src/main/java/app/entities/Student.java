package app.entities;

import lombok.Data;

import javax.persistence.*;

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
}
