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
 * @author Dario Calderon
 */
@Entity
@Table(name = "DOCUMENT")
public class Document {

    private Long idDocument;
    private DocumentType documentType;
    private Person person;
    private String txtDocument;
    private boolean snActive;

    public Document() {
    }

    public Document(Long idDocument) {
        this.idDocument = idDocument;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocument", unique = true, nullable = false)
    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    @ManyToOne
    @JoinColumn(name = "idDocumentType", referencedColumnName = "idDocumentType", nullable = false)
    @Cascade(CascadeType.PERSIST)
    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    @ManyToOne
    @JoinColumn(name = "idPerson", referencedColumnName = "idPerson", nullable = false)
    @Cascade(CascadeType.PERSIST)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "txtDocument", unique = true, nullable = false)
    public String getTxtDocument() {
        return txtDocument;
    }

    public void setTxtDocument(String txtDocument) {
        this.txtDocument = txtDocument;
    }

    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }
}
