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
 * @author Dario Calderon
 */
@Entity
@Table(name = "DOCUMENT_TYPE")
public class DocumentType {

    private Long idDocumentType;
    private String txtName;

    public DocumentType() {
    }

    public DocumentType(Long idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocumentType", unique = true, nullable = false)
    public Long getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(Long idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

}
