package annotation.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vanluong on 26/05/2017.
 */
@Entity
@Table(name = "exam")
public class Exam{

    @Id
    @Column(name = "exam_id")
    private int examId;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_type_id")
    private ExamType examType;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
}
