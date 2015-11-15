/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

import gt.enmiguate.entities.UserProfile;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ELIUDNORIEGA
 */
@Entity
@Table(name="subject")
public class Subject implements Serializable{
    private int idSubject;
    private UserProfile uerProfiles;
    
    public Subject() {
    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
}
