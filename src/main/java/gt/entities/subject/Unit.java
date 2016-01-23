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
@Table(name = "UNIT", schema = "public")
public class Unit implements java.io.Serializable {
    
    private Long id;
    private SubjectSection subjectSection;
    private String txtName;
    private boolean snActive;

    public Unit() {
    }

    public Unit(Long id) {
        this.id = id;
    }
    
    public Unit(Long id, SubjectSection subjectSection, String txtName, boolean snActive) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.txtName = txtName;
        this.snActive = snActive;
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
    
    @Column(name = "txtName", length = 128)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }
    
    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }
    
}