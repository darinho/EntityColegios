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
@Table(name = "SCHOOL_YEAR", schema = "public")
public class SchoolYear implements java.io.Serializable {
    
    private Long id;
    private Integer iYear;
    private SchoolDayType schoolDayType;
    private Integer daysByWeek;
    private Integer periodQuantity;
    private Date startHour;
    private Integer quantityHourByDay;

    public SchoolYear() {
    }
    
    public SchoolYear(Long id) {
        this.id = id;
    }
    
    public SchoolYear(Long id, Integer iYear, SchoolDayType schoolDayType, Integer daysByWeek, Integer periodQuantity, Date startHour, Integer quantityHourByDay) {
        this.id = id;
        this.iYear = iYear;
        this.schoolDayType = schoolDayType;
        this.daysByWeek = daysByWeek;
        this.periodQuantity = periodQuantity;
        this.startHour = startHour;
        this.quantityHourByDay = quantityHourByDay;
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
    
    @Column(name = "iYear")
    public Integer getiYear() {
        return iYear;
    }
    
    public void setiYear(Integer iYear) {
        this.iYear = iYear;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSchoolDayType", referencedColumnName = "id", nullable = false)
    public SchoolDayType getSchoolDayType() {
        return schoolDayType;
    }
    
    public void setSchoolDayType(SchoolDayType schoolDayType) {
        this.schoolDayType = schoolDayType;
    }
    
    @Column(name = "daysByWeek")
    public Integer getDaysByWeek() {
        return daysByWeek;
    }
    
    public void setDaysByWeek(Integer daysByWeek) {
        this.daysByWeek = daysByWeek;
    }
    
    @Column(name = "periodQuantity")
    public Integer getPeriodQuantity() {
        return periodQuantity;
    }
    
    public void setPeriodQuantity(Integer periodQuantity) {
        this.periodQuantity = periodQuantity;
    }
    
    @Temporal(TemporalType.TIME)
    @Column(name = "startHour")
    public Date getStartHour() {
        return startHour;
    }
    
    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }
    
    @Column(name = "quantityHourByDay")
    public Integer getQuantityHourByDay() {
        return quantityHourByDay;
    }
    
    public void setQuantityHourByDay(Integer quantityHourByDay) {
        this.quantityHourByDay = quantityHourByDay;
    }
    
}