package gt.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BREAKS", schema = "public")
public class Breaks implements java.io.Serializable {
    
    private Long id;
    private Date startHour;
    private Integer minutsDuration;
    private SchoolYear schoolYear;
    
    public Breaks() {
    }
    
    public Breaks(Long id, Date startHour, Integer minutsDuration, SchoolYear schoolYear) {
        this.id = id;
        this.startHour = startHour;
        this.minutsDuration = minutsDuration;
        this.schoolYear = schoolYear;
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
    
    @Column(name = "startHour")
    @Temporal(TemporalType.TIME)
    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }
    
    @Column(name = "minutsDuration")
    public Integer getMinutsDuration() {
        return minutsDuration;
    }

    public void setMinutsDuration(Integer minutsDuration) {
        this.minutsDuration = minutsDuration;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSchoolYear", referencedColumnName = "id", nullable = false)
    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }
    
}