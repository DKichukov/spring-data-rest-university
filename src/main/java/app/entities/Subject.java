package app.entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer mark;
    @ManyToOne
    private Student student;

}
