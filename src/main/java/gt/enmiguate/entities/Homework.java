/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
public class Homework {

    private int idHomework;
    private Date dtPublishDate;
    private Date dtLimitDate;
    private String txtSubject;
    private Grade grade;

    public Homework() {
    }

    public Homework(int idHomework) {
        this.idHomework = idHomework;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idHomework", unique = true, nullable = false)
    public int getIdHomework() {
        return idHomework;
    }

    public void setIdHomework(int idHomework) {
        this.idHomework = idHomework;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtPublishDate", nullable = false)
    public Date getDtPublishDate() {
        return dtPublishDate;
    }

    public void setDtPublishDate(Date dtPublishDate) {
        this.dtPublishDate = dtPublishDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtLimitDate", nullable = false)
    public Date getDtLimitDate() {
        return dtLimitDate;
    }

    public void setDtLimitDate(Date dtLimitDate) {
        this.dtLimitDate = dtLimitDate;
    }

    @Column(name = "txtSubject", nullable = false)
    public String getTxtSubject() {
        return txtSubject;
    }

    public void setTxtSubject(String txtSubject) {
        this.txtSubject = txtSubject;
    }

    @ManyToOne
    @JoinColumn(name = "idGrade", referencedColumnName = "idGrade", nullable = false)
    @Cascade(CascadeType.ALL)
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
