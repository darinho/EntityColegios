/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

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
@Table(name = "WINDOW")
public class Window {

    private int idWindow;
    private String txtNameEsp;
    private String txtNameEng;
    private String txtLink;
    private String txtStatesCode;
    private Window parent;
//    private List<Window> children;

    public Window() {
    }

    public Window(int idWindow) {
        this.idWindow = idWindow;
    }

    public Window(int idWindow, String txtWindowEsp, String txtWindowEng) {
        this.idWindow = idWindow;
        this.txtNameEsp = txtWindowEsp;
        this.txtNameEng = txtWindowEng;
    }

    public Window(int idWindow, String txtNameEsp, String txtNameEng, String txtLink, String txtStatesCode) {
        this.idWindow = idWindow;
        this.txtNameEsp = txtNameEsp;
        this.txtNameEng = txtNameEng;
        this.txtLink = txtLink;
        this.txtStatesCode = txtStatesCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idWindow", unique = true, nullable = false)
    public int getIdWindow() {
        return idWindow;
    }

    public void setIdWindow(int idWindow) {
        this.idWindow = idWindow;
    }

    @Column(name = "txtNameEsp", nullable = false)
    public String getTxtNameEsp() {
        return txtNameEsp;
    }

    public void setTxtNameEsp(String txtNameEsp) {
        this.txtNameEsp = txtNameEsp;
    }

    @Column(name = "txtNameEng", nullable = false)
    public String getTxtNameEng() {
        return txtNameEng;
    }

    public void setTxtNameEng(String txtNameEng) {
        this.txtNameEng = txtNameEng;
    }

    @Column(name = "txtLink")
    public String getTxtLink() {
        return txtLink;
    }

    public void setTxtLink(String txtLink) {
        this.txtLink = txtLink;
    }

    @Column(name = "txtStatesCode")
    public String getTxtStatesCode() {
        return txtStatesCode;
    }

    public void setTxtStatesCode(String txtStatesCode) {
        this.txtStatesCode = txtStatesCode;
    }

    @ManyToOne
    @JoinColumn(name = "idWindowParent", referencedColumnName = "idWindow", nullable = false)
    @Cascade(CascadeType.ALL)
    public Window getParent() {
        return parent;
    }

    public void setParent(Window parent) {
        this.parent = parent;
    }

//    @OneToMany(mappedBy = "window")
//    @Cascade(CascadeType.ALL)
//    public List<Window> getChildren() {
//        return children;
//    }
//
//    public void setChildren(List<Window> children) {
//        this.children = children;
//    }
}
