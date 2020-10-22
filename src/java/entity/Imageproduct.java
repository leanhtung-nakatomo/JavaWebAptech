/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "imageproduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imageproduct.findAll", query = "SELECT i FROM Imageproduct i"),
    @NamedQuery(name = "Imageproduct.findByMaImage", query = "SELECT i FROM Imageproduct i WHERE i.maImage = :maImage")})
public class Imageproduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaImage")
    private Integer maImage;
    @JoinColumn(name = "MaHA", referencedColumnName = "MaHA")
    @ManyToOne(optional = false)
    private Image maHA;
    @JoinColumn(name = "MaSP", referencedColumnName = "MaSP")
    @ManyToOne(optional = false)
    private SanPham maSP;

    public Imageproduct() {
    }

    public Imageproduct(Integer maImage) {
        this.maImage = maImage;
    }

    public Integer getMaImage() {
        return maImage;
    }

    public void setMaImage(Integer maImage) {
        this.maImage = maImage;
    }

    public Image getMaHA() {
        return maHA;
    }

    public void setMaHA(Image maHA) {
        this.maHA = maHA;
    }

    public SanPham getMaSP() {
        return maSP;
    }

    public void setMaSP(SanPham maSP) {
        this.maSP = maSP;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maImage != null ? maImage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imageproduct)) {
            return false;
        }
        Imageproduct other = (Imageproduct) object;
        if ((this.maImage == null && other.maImage != null) || (this.maImage != null && !this.maImage.equals(other.maImage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Imageproduct[ maImage=" + maImage + " ]";
    }
    
}
