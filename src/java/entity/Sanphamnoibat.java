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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "Sanphamnoibat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sanphamnoibat.findAll", query = "SELECT s FROM Sanphamnoibat s"),
    @NamedQuery(name = "Sanphamnoibat.findByMaSPCT", query = "SELECT s FROM Sanphamnoibat s WHERE s.maSPCT = :maSPCT")})
public class Sanphamnoibat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSPCT")
    private Integer maSPCT;
    @JoinColumn(name = "MaSPCT", referencedColumnName = "MaSPCT", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SanPhamChiTiet sanPhamChiTiet;

    public Sanphamnoibat() {
    }

    public Sanphamnoibat(Integer maSPCT) {
        this.maSPCT = maSPCT;
    }

    public Integer getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(Integer maSPCT) {
        this.maSPCT = maSPCT;
    }

    public SanPhamChiTiet getSanPhamChiTiet() {
        return sanPhamChiTiet;
    }

    public void setSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        this.sanPhamChiTiet = sanPhamChiTiet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSPCT != null ? maSPCT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanphamnoibat)) {
            return false;
        }
        Sanphamnoibat other = (Sanphamnoibat) object;
        if ((this.maSPCT == null && other.maSPCT != null) || (this.maSPCT != null && !this.maSPCT.equals(other.maSPCT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Sanphamnoibat[ maSPCT=" + maSPCT + " ]";
    }
    
}
