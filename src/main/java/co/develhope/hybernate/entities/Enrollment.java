package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Enrollment{
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id", nullable = false)
        private Long id;

        @ManyToOne(fetch =  FetchType.LAZY)
        private SchoolClass schoolClass;

        @ManyToOne
        private Student student;

}