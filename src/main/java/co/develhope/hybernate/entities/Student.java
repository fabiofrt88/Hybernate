package co.develhope.hybernate.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, name = "userEmail", length = 100)
    private String email;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<Enrollment> enrollmentList;

 }