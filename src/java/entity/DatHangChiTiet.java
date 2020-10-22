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
@Table(name = "DatHangChiTiet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatHangChiTiet.findAll", query = "SELECT d FROM DatHangChiTiet d"),
    @NamedQuery(name = "DatHangChiTiet.findByMaDHCT", query = "SELECT d FROM DatHangChiTiet d WHERE d.maDHCT = :maDHCT")})
public class DatHangChiTiet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDHCT")
    private Integer maDHCT;
    @JoinColumn(name = "MaDH", referencedColumnName = "MaDH")
    @ManyToOne(optional = false)
    private DatHang maDH;
    @JoinColumn(name = "MaGH", referencedColumnName = "MaGH")
    @ManyToOne(optional = false)
    private Giohang maGH;

    public DatHangChiTiet() {
    }

    public DatHangChiTiet(Integer maDHCT) {
        this.maDHCT = maDHCT;
    }

    public DatHangChiTiet( DatHang maDH, Giohang maGH) {
        this.maDH = maDH;
        this.maGH = maGH;
    }
    
    public Integer getMaDHCT() {
        return maDHCT;
    }

    public void setMaDHCT(Integer maDHCT) {
        this.maDHCT = maDHCT;
    }

    public DatHang getMaDH() {
        return maDH;
    }

    public void setMaDH(DatHang maDH) {
        this.maDH = maDH;
    }

    public Giohang getMaGH() {
        return maGH;
    }

    public void setMaGH(Giohang maGH) {
        this.maGH = maGH;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDHCT != null ? maDHCT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatHangChiTiet)) {
            return false;
        }
        DatHangChiTiet other = (DatHangChiTiet) object;
        if ((this.maDHCT == null && other.maDHCT != null) || (this.maDHCT != null && !this.maDHCT.equals(other.maDHCT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DatHangChiTiet[ maDHCT=" + maDHCT + " ]";
    }
    
}
