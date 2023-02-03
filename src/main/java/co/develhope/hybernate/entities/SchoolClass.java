package co.develhope.hybernate.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class SchoolClass{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "schoolClass",fetch = FetchType.LAZY)
    private List<Enrollment> enrollmentList;

}