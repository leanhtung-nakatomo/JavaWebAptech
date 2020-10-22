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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "Giohang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giohang.findAll", query = "SELECT g FROM Giohang g"),
    @NamedQuery(name = "Giohang.findByMaGH", query = "SELECT g FROM Giohang g WHERE g.maGH = :maGH"),
    @NamedQuery(name = "Giohang.findBySoluong", query = "SELECT g FROM Giohang g WHERE g.soluong = :soluong")})
public class Giohang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaGH")
    private Integer maGH;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluong")
    private int soluong;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maGH")
    private Collection<DatHangChiTiet> datHangChiTietCollection;
    @JoinColumn(name = "MaSPCT", referencedColumnName = "MaSPCT")
    @ManyToOne(optional = false)
    private SanPhamChiTiet maSPCT;

    public Giohang() {
    }

    public Giohang(Integer maGH) {
        this.maGH = maGH;
    }

    public Giohang(Integer maGH, int soluong) {
        this.maGH = maGH;
        this.soluong = soluong;
    }

    public Integer getMaGH() {
        return maGH;
    }

    public void setMaGH(Integer maGH) {
        this.maGH = maGH;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @XmlTransient
    public Collection<DatHangChiTiet> getDatHangChiTietCollection() {
        return datHangChiTietCollection;
    }

    public void setDatHangChiTietCollection(Collection<DatHangChiTiet> datHangChiTietCollection) {
        this.datHangChiTietCollection = datHangChiTietCollection;
    }

    public SanPhamChiTiet getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(SanPhamChiTiet maSPCT) {
        this.maSPCT = maSPCT;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maGH != null ? maGH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giohang)) {
            return false;
        }
        Giohang other = (Giohang) object;
        if ((this.maGH == null && other.maGH != null) || (this.maGH != null && !this.maGH.equals(other.maGH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Giohang[ maGH=" + maGH + " ]";
    }
    
}
