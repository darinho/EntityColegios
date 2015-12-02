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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ELIUDNORIEGA
 */
@Entity
@Table(name = "TASK")
public class Task implements Serializable {

    private long id;
    private SubjectSection subjectSection;
    private String txtSubject;
    private Date dateStart;
    private Date dateEnd;
    private String txtContent;
    private byte[] attach;
    private boolean snActive;

    public Task() {
    }

    public Task(long id) {
        this.id = id;
    }

    public Task(long id, SubjectSection subjectSection, String txtSubject, Date dateStart, Date dateEnd, String txtContent) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.txtSubject = txtSubject;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.txtContent = txtContent;
    }

    public Task(long id, SubjectSection subjectSection, String txtSubject, Date dateStart, Date dateEnd, String txtContent, byte[] attach) {
        this.id = id;
        this.subjectSection = subjectSection;
        this.txtSubject = txtSubject;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.txtContent = txtContent;
        this.attach = attach;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "idSubjectSection", nullable = false)
    public SubjectSection getSubjectSection() {
        return subjectSection;
    }

    public void setSubjectSection(SubjectSection subjectSection) {
        this.subjectSection = subjectSection;
    }

    @Column(name = "txtSubject", nullable = false, length = 75)
    public String getTxtSubject() {
        return txtSubject;
    }

    public void setTxtSubject(String txtSubject) {
        this.txtSubject = txtSubject;
    }

    @Column(name = "dateStart")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Column(name = "dateEnd")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Column(name = "txtContent", nullable = false, length = Integer.MAX_VALUE)
    public String getTxtContent() {
        return txtContent;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }

    @Column(name = "attach")
    public byte[] getAttach() {
        return attach;
    }

    public void setAttach(byte[] attach) {
        this.attach = attach;
    }

    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }

}
