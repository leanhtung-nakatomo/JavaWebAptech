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
@Table(name = "MauSac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MauSac.findAll", query = "SELECT m FROM MauSac m"),
    @NamedQuery(name = "MauSac.findByMaMauSac", query = "SELECT m FROM MauSac m WHERE m.maMauSac = :maMauSac"),
    @NamedQuery(name = "MauSac.findByTenMauSac", query = "SELECT m FROM MauSac m WHERE m.tenMauSac = :tenMauSac"),
    @NamedQuery(name = "MauSac.findByGhiChu", query = "SELECT m FROM MauSac m WHERE m.ghiChu = :ghiChu"),
    @NamedQuery(name = "MauSac.findByTrangThai", query = "SELECT m FROM MauSac m WHERE m.trangThai = :trangThai")})
public class MauSac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaMauSac")
    private Integer maMauSac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TenMauSac")
    private String tenMauSac;
    @Size(max = 400)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maMauSac")
    private Collection<SanPhamChiTiet> sanPhamChiTietCollection;

    public MauSac() {
    }

    public MauSac(Integer maMauSac) {
        this.maMauSac = maMauSac;
    }

    public MauSac(Integer maMauSac, String tenMauSac) {
        this.maMauSac = maMauSac;
        this.tenMauSac = tenMauSac;
    }

    public MauSac(String parameter) {
        this.tenMauSac = tenMauSac;
    }

    public Integer getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(Integer maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @XmlTransient
    public Collection<SanPhamChiTiet> getSanPhamChiTietCollection() {
        return sanPhamChiTietCollection;
    }

    public void setSanPhamChiTietCollection(Collection<SanPhamChiTiet> sanPhamChiTietCollection) {
        this.sanPhamChiTietCollection = sanPhamChiTietCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maMauSac != null ? maMauSac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MauSac)) {
            return false;
        }
        MauSac other = (MauSac) object;
        if ((this.maMauSac == null && other.maMauSac != null) || (this.maMauSac != null && !this.maMauSac.equals(other.maMauSac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MauSac[ maMauSac=" + maMauSac + " ]";
    }
    
}
