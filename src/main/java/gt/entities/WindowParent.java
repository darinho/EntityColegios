/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import gt.enmiguate.entities.*;
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
 * @author dc
 */
@Entity
@Table(name = "WINDOW_PARENT")
public class WindowParent {

    private int idWindoParent;
    private Window parent;

    public WindowParent() {
    }

    public WindowParent(int idWindoParent, Window windowParent) {
        this.idWindoParent = idWindoParent;
        this.parent = windowParent;
    }

    public WindowParent(int idWindoParent) {
        this.idWindoParent = idWindoParent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idWindowParent", unique = true, nullable = false)
    public int getIdWindoParent() {
        return idWindoParent;
    }

    public void setIdWindoParent(int idWindoParent) {
        this.idWindoParent = idWindoParent;
    }

    @ManyToOne
    @JoinColumn(name = "idWindow", referencedColumnName = "idWindow", nullable = false)
    @Cascade(CascadeType.ALL)
    public Window getParent() {
        return parent;
    }

    public void setParent(Window parent) {
        this.parent = parent;
    }

}
