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
@Table(name = "ASSISTANCE", schema = "public")
public class Assistance implements java.io.Serializable {
    
    private Long id;
    private SubjectSection subjectSection;
    private SubjectUserProfile subectUserProfile;

    public Assistance() {
    }

    public Assistance(Long id, SubjectSection subjectSection, SubjectUserProfile subectUserProfile) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.subectUserProfile = subectUserProfile;
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
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSubjectUserProfile", referencedColumnName = "id", nullable = false)
    public SubjectUserProfile getSubectUserProfile() {
        return subectUserProfile;
    }

    public void setSubectUserProfile(SubjectUserProfile subectUserProfile) {
        this.subectUserProfile = subectUserProfile;
    }
    
}