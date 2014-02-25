/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Internet
 */
@Entity
@Table(name = "deal", catalog = "pi_dev", schema = "")
@NamedQueries({
    @NamedQuery(name = "Deal.findAll", query = "SELECT d FROM Deal d"),
    @NamedQuery(name = "Deal.findByIdDeal", query = "SELECT d FROM Deal d WHERE d.idDeal = :idDeal"),
    @NamedQuery(name = "Deal.findByTitreDeal", query = "SELECT d FROM Deal d WHERE d.titreDeal = :titreDeal"),
    @NamedQuery(name = "Deal.findByPrixDeal", query = "SELECT d FROM Deal d WHERE d.prixDeal = :prixDeal"),
    @NamedQuery(name = "Deal.findByNbrachatactuel", query = "SELECT d FROM Deal d WHERE d.nbrachatactuel = :nbrachatactuel"),
    @NamedQuery(name = "Deal.findByNbrAchatValidation", query = "SELECT d FROM Deal d WHERE d.nbrAchatValidation = :nbrAchatValidation"),
    @NamedQuery(name = "Deal.findByEtatDeal", query = "SELECT d FROM Deal d WHERE d.etatDeal = :etatDeal"),
    @NamedQuery(name = "Deal.findByStatutDeal", query = "SELECT d FROM Deal d WHERE d.statutDeal = :statutDeal"),
    @NamedQuery(name = "Deal.findByDateDebut", query = "SELECT d FROM Deal d WHERE d.dateDebut = :dateDebut"),
    @NamedQuery(name = "Deal.findByDateFin", query = "SELECT d FROM Deal d WHERE d.dateFin = :dateFin"),
    @NamedQuery(name = "Deal.findByNbrAffichage", query = "SELECT d FROM Deal d WHERE d.nbrAffichage = :nbrAffichage"),
    @NamedQuery(name = "Deal.findByIdVendeur", query = "SELECT d FROM Deal d WHERE d.idVendeur = :idVendeur")})
public class Deal implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDeal")
    private Integer idDeal;
    @Basic(optional = false)
    @Column(name = "titreDeal")
    private String titreDeal;
    @Basic(optional = false)
    @Lob
    @Column(name = "descDeal")
    private String descDeal;
    @Basic(optional = false)
    @Column(name = "prixDeal")
    private double prixDeal;
    @Basic(optional = false)
    @Column(name = "nbrachatactuel")
    private int nbrachatactuel;
    @Basic(optional = false)
    @Column(name = "nbrAchatValidation")
    private int nbrAchatValidation;
    @Basic(optional = false)
    @Column(name = "etatDeal")
    private String etatDeal;
    @Basic(optional = false)
    @Column(name = "StatutDeal")
    private boolean statutDeal;
    @Basic(optional = false)
    @Column(name = "dateDebut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Basic(optional = false)
    @Column(name = "dateFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @Column(name = "nbrAffichage")
    private Integer nbrAffichage;
    @Column(name = "idVendeur")
    private Integer idVendeur;

    public Deal() {
    }

    public Deal(Integer idDeal) {
        this.idDeal = idDeal;
    }

    public Deal(Integer idDeal, String titreDeal, String descDeal, double prixDeal, int nbrachatactuel, int nbrAchatValidation, String etatDeal, boolean statutDeal, Date dateDebut, Date dateFin) {
        this.idDeal = idDeal;
        this.titreDeal = titreDeal;
        this.descDeal = descDeal;
        this.prixDeal = prixDeal;
        this.nbrachatactuel = nbrachatactuel;
        this.nbrAchatValidation = nbrAchatValidation;
        this.etatDeal = etatDeal;
        this.statutDeal = statutDeal;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Integer getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Integer idDeal) {
        Integer oldIdDeal = this.idDeal;
        this.idDeal = idDeal;
        changeSupport.firePropertyChange("idDeal", oldIdDeal, idDeal);
    }

    public String getTitreDeal() {
        return titreDeal;
    }

    public void setTitreDeal(String titreDeal) {
        String oldTitreDeal = this.titreDeal;
        this.titreDeal = titreDeal;
        changeSupport.firePropertyChange("titreDeal", oldTitreDeal, titreDeal);
    }

    public String getDescDeal() {
        return descDeal;
    }

    public void setDescDeal(String descDeal) {
        String oldDescDeal = this.descDeal;
        this.descDeal = descDeal;
        changeSupport.firePropertyChange("descDeal", oldDescDeal, descDeal);
    }

    public double getPrixDeal() {
        return prixDeal;
    }

    public void setPrixDeal(double prixDeal) {
        double oldPrixDeal = this.prixDeal;
        this.prixDeal = prixDeal;
        changeSupport.firePropertyChange("prixDeal", oldPrixDeal, prixDeal);
    }

    public int getNbrachatactuel() {
        return nbrachatactuel;
    }

    public void setNbrachatactuel(int nbrachatactuel) {
        int oldNbrachatactuel = this.nbrachatactuel;
        this.nbrachatactuel = nbrachatactuel;
        changeSupport.firePropertyChange("nbrachatactuel", oldNbrachatactuel, nbrachatactuel);
    }

    public int getNbrAchatValidation() {
        return nbrAchatValidation;
    }

    public void setNbrAchatValidation(int nbrAchatValidation) {
        int oldNbrAchatValidation = this.nbrAchatValidation;
        this.nbrAchatValidation = nbrAchatValidation;
        changeSupport.firePropertyChange("nbrAchatValidation", oldNbrAchatValidation, nbrAchatValidation);
    }

    public String getEtatDeal() {
        return etatDeal;
    }

    public void setEtatDeal(String etatDeal) {
        String oldEtatDeal = this.etatDeal;
        this.etatDeal = etatDeal;
        changeSupport.firePropertyChange("etatDeal", oldEtatDeal, etatDeal);
    }

    public boolean getStatutDeal() {
        return statutDeal;
    }

    public void setStatutDeal(boolean statutDeal) {
        boolean oldStatutDeal = this.statutDeal;
        this.statutDeal = statutDeal;
        changeSupport.firePropertyChange("statutDeal", oldStatutDeal, statutDeal);
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        Date oldDateDebut = this.dateDebut;
        this.dateDebut = dateDebut;
        changeSupport.firePropertyChange("dateDebut", oldDateDebut, dateDebut);
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        Date oldDateFin = this.dateFin;
        this.dateFin = dateFin;
        changeSupport.firePropertyChange("dateFin", oldDateFin, dateFin);
    }

    public Integer getNbrAffichage() {
        return nbrAffichage;
    }

    public void setNbrAffichage(Integer nbrAffichage) {
        Integer oldNbrAffichage = this.nbrAffichage;
        this.nbrAffichage = nbrAffichage;
        changeSupport.firePropertyChange("nbrAffichage", oldNbrAffichage, nbrAffichage);
    }

    public Integer getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(Integer idVendeur) {
        Integer oldIdVendeur = this.idVendeur;
        this.idVendeur = idVendeur;
        changeSupport.firePropertyChange("idVendeur", oldIdVendeur, idVendeur);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDeal != null ? idDeal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deal)) {
            return false;
        }
        Deal other = (Deal) object;
        if ((this.idDeal == null && other.idDeal != null) || (this.idDeal != null && !this.idDeal.equals(other.idDeal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pi.bestdeal.gui.Deal[ idDeal=" + idDeal + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
