/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
@Entity
@Table(name = "COUNTRY")
public class Country implements java.io.Serializable {

    private int idCountry;
    private String txtName;
    private List<State> states = new ArrayList<>();

    public Country() {
    }

    public Country(Country country) {
        this.idCountry = country.getIdCountry();
        this.txtName = country.getTxtName();
        for (State s : country.getStates()) {
            s.setCountry(null);
            for (City c : s.getCities()) {
                c.setState(null);

            }
        }
        this.states = country.getStates();
    }

    public Country(int idCountry, String txtName, List<State> states) {
        this.idCountry = idCountry;
        this.txtName = txtName;
        for (State s : states) {
            s.setCountry(null);
            for (City c : s.getCities()) {
                c.setState(null);

            }
        }
        this.states = states;
    }

    public Country(int idCountry) {
        this.idCountry = idCountry;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCountry", unique = true, nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    @OneToMany(mappedBy = "country")
    @Cascade(CascadeType.ALL)
    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

}
