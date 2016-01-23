package gt.entities.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "SCHEDULE", schema = "public")
public class Schedule implements java.io.Serializable {

    private Long id;
    private SubjectSection subjectSection;
    private Integer intPeriod;
    private Integer intDay;

    public Schedule() {
    }

    public Schedule(Long id) {
        this.id = id;
    }

    public Schedule(Long id, SubjectSection subjectSection, Integer intPeriod, Integer intDay) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.intPeriod = intPeriod;
        this.intDay = intDay;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSubjectSection", referencedColumnName = "id", nullable = false)
    public SubjectSection getSubjectSection() {
        return subjectSection;
    }

    public void setSubjectSection(SubjectSection subjectSection) {
        this.subjectSection = subjectSection;
    }

    @Column(name = "intPeriod")
    public Integer getIntPeriod() {
        return intPeriod;
    }

    public void setIntPeriod(Integer intPeriod) {
        this.intPeriod = intPeriod;
    }

    @Column(name = "intDay")
    public Integer getIntDay() {
        return intDay;
    }

    public void setIntDay(Integer intDay) {
        this.intDay = intDay;
    }
    
}
