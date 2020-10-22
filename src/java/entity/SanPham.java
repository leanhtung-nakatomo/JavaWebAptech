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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "SanPham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPham.findAll", query = "SELECT s FROM SanPham s"),
    @NamedQuery(name = "SanPham.findByMaSP", query = "SELECT s FROM SanPham s WHERE s.maSP = :maSP"),
    @NamedQuery(name = "SanPham.findByTenSP", query = "SELECT s FROM SanPham s WHERE s.tenSP = :tenSP"),
    @NamedQuery(name = "SanPham.findByTrangThai", query = "SELECT s FROM SanPham s WHERE s.trangThai = :trangThai")})
public class SanPham implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSP")
    private Collection<Imageproduct> imageproductCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSP")
    private Integer maSP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TenSP")
    private String tenSP;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSP")
    private Collection<SanPhamChiTiet> sanPhamChiTietCollection;
    @JoinColumn(name = "MaDM", referencedColumnName = "MaDM")
    @ManyToOne(optional = false)
    private DanhMuc maDM;
    @JoinColumn(name = "MaNSX", referencedColumnName = "MaNSX")
    @ManyToOne(optional = false)
    private Nsx maNSX;

    public SanPham() {
    }

    public SanPham(Integer maSP) {
        this.maSP = maSP;
    }

    public SanPham(Integer maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public Integer getMaSP() {
        return maSP;
    }

    public void setMaSP(Integer maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    public DanhMuc getMaDM() {
        return maDM;
    }

    public void setMaDM(DanhMuc maDM) {
        this.maDM = maDM;
    }

    public Nsx getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(Nsx maNSX) {
        this.maNSX = maNSX;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSP != null ? maSP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SanPham)) {
            return false;
        }
        SanPham other = (SanPham) object;
        if ((this.maSP == null && other.maSP != null) || (this.maSP != null && !this.maSP.equals(other.maSP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SanPham[ maSP=" + maSP + " ]";
    }

    @XmlTransient
    public Collection<Imageproduct> getImageproductCollection() {
        return imageproductCollection;
    }

    public void setImageproductCollection(Collection<Imageproduct> imageproductCollection) {
        this.imageproductCollection = imageproductCollection;
    }
    
}
