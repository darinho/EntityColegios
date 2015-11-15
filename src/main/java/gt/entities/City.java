/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
@Entity
@Table(name = "CITY")
public class City implements java.io.Serializable {

    private int idCity;
    private String txtName;
    private State state;

    public City() {
    }

    public City(int idCity) {
        this.idCity = idCity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCity", unique = true, nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    @ManyToOne
    @JoinColumn(name = "idState", referencedColumnName = "idState", nullable = false)
    @Cascade(CascadeType.PERSIST)
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
