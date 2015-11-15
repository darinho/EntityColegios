/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
public class HomeworkDetail {

    private int idHomeworkDetail;
    private String txtDescription;
    private Homework homework;

    public HomeworkDetail() {
    }

    public HomeworkDetail(int idHomeworkDetail) {
        this.idHomeworkDetail = idHomeworkDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idHomeworkDetail", unique = true, nullable = false)
    public int getIdHomeworkDetail() {
        return idHomeworkDetail;
    }

    public void setIdHomeworkDetail(int idHomeworkDetail) {
        this.idHomeworkDetail = idHomeworkDetail;
    }

    @Column(name = "txtDescription", nullable = false)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @ManyToOne
    @JoinColumn(name = "idHomework", referencedColumnName = "idHomework", nullable = false)
    @Cascade(CascadeType.ALL)
    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }

}
