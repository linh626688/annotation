package annotation.model;

import javax.persistence.*;


@Entity
@Table(name = "grade")
public class Grade{

    @Id
    @Column(name = "grade_id")
    private int grade_id;

    @Column(name="name")
    private String name;

    @Column(name = "descrip")
    private String descrip;

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
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
