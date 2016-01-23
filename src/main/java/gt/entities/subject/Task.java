/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

import java.io.Serializable;
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

/**
 *
 * @author ELIUDNORIEGA
 */
@Entity
@Table(name = "TASK", schema = "public")
public class Task implements Serializable {

    private long id;
    private SubjectSection subjectSection;
    private Date startDate;
    private Date endDate;
    private Unit unit;
    private String title;
    private String description;

    public Task() {
    }
    
    public Task(long id) {
        this.id = id;
    }
    
    public Task(long id, SubjectSection subjectSection, Date startDate, Date endDate, Unit unit, String title, String description) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unit = unit;
        this.title = title;
        this.description = description;
    }
    
    @Id()
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUnit", referencedColumnName = "id")
    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    
    @Column(name = "title", length = 300)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name = "description", length = 1024)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}