package be.teachngo.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "TeachersMode")
public class TeacherMode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_modes", nullable = false)
    private Mode mode;


    @ManyToOne
    @JoinColumn(name = "id_teacher", nullable = false)
    private Teacher teacher;
}
