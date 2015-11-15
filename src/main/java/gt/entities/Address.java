/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "ADDRESS")
public class Address implements java.io.Serializable {

    private int idAddress;
    private City city;
    private String txtNumberHouse;
    private String txtColony;
    private int intZone;
    private String txtIndications;

    public Address() {
    }

    public Address(int idAddress) {
        this.idAddress = idAddress;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAddress", unique = true, nullable = false)
    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCity", referencedColumnName = "idCity", nullable = false)
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "txtNumberHouse")
    public String getTxtNumberHouse() {
        return txtNumberHouse;
    }

    public void setTxtNumberHouse(String txtNumberHouse) {
        this.txtNumberHouse = txtNumberHouse;
    }

    @Column(name = "txtColony")
    public String getTxtColony() {
        return txtColony;
    }

    public void setTxtColony(String txtColony) {
        this.txtColony = txtColony;
    }

    @Column(name = "intZone")
    public int getIntZone() {
        return intZone;
    }

    public void setIntZone(int intZone) {
        this.intZone = intZone;
    }

    @Column(name = "txtIndications")
    public String getTxtIndications() {
        return txtIndications;
    }

    public void setTxtIndications(String txtIndications) {
        this.txtIndications = txtIndications;
    }

}
