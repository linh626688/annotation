package annotation.model;

import javax.persistence.*;

@Entity
@Table(name = "classroom_student")
public class ClassRoomStudent  {

    @Id
    @Column(name = "classroom_student")
    private int classRoomStudentId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id")
    private ClassRoom classRoom;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public int getClassRoomStudentId() {
        return classRoomStudentId;
    }

    public void setClassRoomStudentId(int classRoomStudentId) {
        this.classRoomStudentId = classRoomStudentId;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
