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
 * @author dc
 */
@Entity
@Table(name = "MENU",schema = "public")
public class Menu {

    private Long idMenu;
    private String txtName;
    private String txtLink;
    private String txtIcon;
    private Integer idParent;

    public Menu() {
    }

    public Menu(Long idWindow) {
        this.idMenu = idWindow;
    }

    public Menu(Long idWindow, String txtName, String txtLink, String txtIcon, Integer idParent) {
        this.idMenu = idWindow;
        this.txtName = txtName;
        this.txtLink = txtLink;
        this.txtIcon = txtIcon;
        this.idParent = idParent;
    }
    
    @Id()
    @Column(name = "idMenu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }
    
    @Column(name = "txtName", length = 50)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }
    
    @Column(name = "txtLink", length = 200)
    public String getTxtLink() {
        return txtLink;
    }

    public void setTxtLink(String txtLink) {
        this.txtLink = txtLink;
    }
    
    @Column(name = "txtIcon")
    public String getTxtIcon() {
        return txtIcon;
    }

    public void setTxtIcon(String txtIcon) {
        this.txtIcon = txtIcon;
    }
    
    @Column(name = "idParent")
    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }
    

}
