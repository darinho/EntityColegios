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
public class Degree {

    private int idDegree;
    private String txtDescription;
    private SchoolLevel schoolLevel;

    public Degree() {
    }

    public Degree(int idDegree) {
        this.idDegree = idDegree;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idDegree", unique = true, nullable = false)
    public int getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(int idDegree) {
        this.idDegree = idDegree;
    }

    @Column(name = "txtDescription", nullable = false)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @ManyToOne
    @JoinColumn(name = "idSchoolLevel", referencedColumnName = "idSchoolLevel", nullable = false)
    @Cascade(CascadeType.PERSIST)
    public SchoolLevel getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(SchoolLevel schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

}
