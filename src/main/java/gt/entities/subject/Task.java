/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author ELIUDNORIEGA
 */
@Entity
@Table(name="task")
public class Task implements Serializable{
    private int idTask;
    private Subject subject;
}
