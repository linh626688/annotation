package annotation.model;

import javax.persistence.*;


@Entity
@Table(name ="exam_type")
public class ExamType{

    @Id
    @Column(name = "exam_type_id")
    private int examTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "descrip")
    private String descrip;

    public int getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(int examTypeId) {
        this.examTypeId = examTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
