/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

import gt.entities.SchoolYear;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dario.calderon
 */
@Entity
@Table(name = "DEGREE")
public class Degree {

    private Long id;
    private String txtDescription;
    private boolean snActive;
    private SchoolYear schoolYear;
    
    public Degree() {
    }

    public Degree(Long id) {
        this.id = id;
    }

    public Degree(Long id, String txtDescription, boolean snActive, SchoolYear schoolYear) {
        this.id = id;
        this.txtDescription = txtDescription;
        this.snActive = snActive;
        this.schoolYear = schoolYear;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "txtDescription", length = 100)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSchooYear", referencedColumnName = "idSchoolYear")
    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }
    
}
