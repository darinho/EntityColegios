/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "SCHOOL", schema = "dbo", catalog = "COLEGIOS")
public class School implements Serializable {

    private int idSchool;
    private String txtNombre;
    private Address address;
    private List<Phone> phones = new ArrayList<>();

    public School() {
    }

    public School(int idSchool) {
        this.idSchool = idSchool;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idSchool", unique = true, nullable = false)
    public int getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(int idSchool) {
        this.idSchool = idSchool;
    }

    @Column(name = "txtNombre", nullable = false)
    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    @ManyToOne
    @JoinColumn(name = "idAddress", referencedColumnName = "idAddress", nullable = false)
    @Cascade(CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany
    @JoinColumn(name = "idPhone", referencedColumnName = "idPhone", nullable = false)
    @Cascade(CascadeType.ALL)
    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

}
