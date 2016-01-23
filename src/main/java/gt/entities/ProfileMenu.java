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
 * @author dc
 */
@Entity
@Table(name = "PROFILE_MENU")
public class ProfileMenu implements java.io.Serializable {

    private Long idProfileMenu;
    private Profile profile;
    private Menu menu;
    private boolean snActive;

    public ProfileMenu(Long idProfileWindow) {
        this.idProfileMenu = idProfileWindow;
    }

    public ProfileMenu() {
    }

    public ProfileMenu(Long idProfileWindow, Profile profile) {
        this.idProfileMenu = idProfileWindow;
        this.profile = profile;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProfileMenu", unique = true, nullable = false)
    public Long getIdProfileMenu() {
        return idProfileMenu;
    }

    public void setIdProfileMenu(Long idProfileMenu) {
        this.idProfileMenu = idProfileMenu;
    }

    @ManyToOne
    @JoinColumn(name = "idProfile", referencedColumnName = "idProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMenu", referencedColumnName = "idMenu")
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }
    

}
