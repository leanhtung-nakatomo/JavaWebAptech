/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "Image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Image.findAll", query = "SELECT i FROM Image i"),
    @NamedQuery(name = "Image.findByMaHA", query = "SELECT i FROM Image i WHERE i.maHA = :maHA"),
    @NamedQuery(name = "Image.findByImage", query = "SELECT i FROM Image i WHERE i.image = :image")})
public class Image implements Serializable {
    @Column(name = "roleimage")
    private Boolean roleimage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maHA")
    private Collection<Imageproduct> imageproductCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHA")
    private Integer maHA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "image")
    private String image;

    public Image() {
    }

    public Image(Integer maHA) {
        this.maHA = maHA;
    }

    public Image(Boolean roleimage, Collection<Imageproduct> imageproductCollection, Integer maHA, String image) {
        this.roleimage = roleimage;
        this.imageproductCollection = imageproductCollection;
        this.maHA = maHA;
        this.image = image;
    }

    
    public Integer getMaHA() {
        return maHA;
    }

    public void setMaHA(Integer maHA) {
        this.maHA = maHA;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maHA != null ? maHA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Image)) {
            return false;
        }
        Image other = (Image) object;
        if ((this.maHA == null && other.maHA != null) || (this.maHA != null && !this.maHA.equals(other.maHA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Image[ maHA=" + maHA + " ]";
    }

    public Boolean getRoleimage() {
        return roleimage;
    }

    public void setRoleimage(Boolean roleimage) {
        this.roleimage = roleimage;
    }

    @XmlTransient
    public Collection<Imageproduct> getImageproductCollection() {
        return imageproductCollection;
    }

    public void setImageproductCollection(Collection<Imageproduct> imageproductCollection) {
        this.imageproductCollection = imageproductCollection;
    }
    
}
