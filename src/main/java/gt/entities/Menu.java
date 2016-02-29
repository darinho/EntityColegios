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
import javax.persistence.Table;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "MENU", schema = "public")
public class Menu {

    private Long idMenu;
    private String txtName;
    private String txtLink;
    private String txtIcon;
    private String txtView;
    private String txtStateParent;
    private String txtController;
    private String txtTemplateUri;
    private Long idParent;
    private Boolean snActive;

    public Menu() {
    }

    public Menu(Long idWindow) {
        this.idMenu = idWindow;
    }

    public Menu(String txtName, String txtLink, String txtIcon, Long idParent, Boolean snActive) {
        this.txtName = txtName;
        this.txtLink = txtLink;
        this.txtIcon = txtIcon;
        this.idParent = idParent;
        this.snActive = snActive;
    }

    public Menu(Long idWindow, String txtName, String txtLink, String txtIcon, Long idParent) {
        this.idMenu = idWindow;
        this.txtName = txtName;
        this.txtLink = txtLink;
        this.txtIcon = txtIcon;
        this.idParent = idParent;
    }

    public Menu(String txtName, String txtLink, String txtIcon, String txtView, String txtStateParent, String txtController, String txtTemplateUri, Long idParent, Boolean snActive) {
        this.txtName = txtName;
        this.txtLink = txtLink;
        this.txtIcon = txtIcon;
        this.txtView = txtView;
        this.txtStateParent = txtStateParent;
        this.txtController = txtController;
        this.txtTemplateUri = txtTemplateUri;
        this.idParent = idParent;
        this.snActive = snActive;
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
    public Long getIdParent() {
        return idParent;
    }

    public void setIdParent(Long idParent) {
        this.idParent = idParent;
    }

    public String getTxtView() {
        return txtView;
    }

    public void setTxtView(String txtView) {
        this.txtView = txtView;
    }

    public String getTxtStateParent() {
        return txtStateParent;
    }

    public void setTxtStateParent(String txtStateParent) {
        this.txtStateParent = txtStateParent;
    }

    public String getTxtController() {
        return txtController;
    }

    public void setTxtController(String txtController) {
        this.txtController = txtController;
    }

    public String getTxtTemplateUri() {
        return txtTemplateUri;
    }

    public void setTxtTemplateUri(String txtTemplateUri) {
        this.txtTemplateUri = txtTemplateUri;
    }

    @Column(name = "snActive")
    public Boolean getSnActive() {
        return snActive;
    }

    public void setSnActive(Boolean snActive) {
        this.snActive = snActive;
    }

}
