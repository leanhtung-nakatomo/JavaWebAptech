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
import javax.persistence.OneToOne;
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
@Table(name = "SanPhamChiTiet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPhamChiTiet.findAll", query = "SELECT s FROM SanPhamChiTiet s"),
    @NamedQuery(name = "SanPhamChiTiet.findByMaSPCT", query = "SELECT s FROM SanPhamChiTiet s WHERE s.maSPCT = :maSPCT"),
    @NamedQuery(name = "SanPhamChiTiet.findBySoLuong", query = "SELECT s FROM SanPhamChiTiet s WHERE s.soLuong = :soLuong"),
    @NamedQuery(name = "SanPhamChiTiet.findByGiaGoc", query = "SELECT s FROM SanPhamChiTiet s WHERE s.giaGoc = :giaGoc"),
    @NamedQuery(name = "SanPhamChiTiet.findByGiaKM", query = "SELECT s FROM SanPhamChiTiet s WHERE s.giaKM = :giaKM"),
    @NamedQuery(name = "SanPhamChiTiet.findByImageSP", query = "SELECT s FROM SanPhamChiTiet s WHERE s.imageSP = :imageSP"),
    @NamedQuery(name = "SanPhamChiTiet.findByGhiChu", query = "SELECT s FROM SanPhamChiTiet s WHERE s.ghiChu = :ghiChu"),
    @NamedQuery(name = "SanPhamChiTiet.findByTrangThai", query = "SELECT s FROM SanPhamChiTiet s WHERE s.trangThai = :trangThai")})
public class SanPhamChiTiet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSPCT")
    private Integer maSPCT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoLuong")
    private int soLuong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GiaGoc")
    private double giaGoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GiaKM")
    private double giaKM;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "imageSP")
    private String imageSP;
    @Size(max = 400)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    @JoinColumn(name = "MaKichThuoc", referencedColumnName = "MaKichThuoc")
    @ManyToOne(optional = false)
    private KichThuoc maKichThuoc;
    @JoinColumn(name = "MaMauSac", referencedColumnName = "MaMauSac")
    @ManyToOne(optional = false)
    private MauSac maMauSac;
    @JoinColumn(name = "MaSP", referencedColumnName = "MaSP")
    @ManyToOne(optional = false)
    private SanPham maSP;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "sanPhamChiTiet")
    private Sanphamnoibat sanphamnoibat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSPCT")
    private Collection<Giohang> giohangCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maSPCT")
    private Collection<CommentSP> commentSPCollection;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(Integer maSPCT) {
        this.maSPCT = maSPCT;
    }

    public SanPhamChiTiet(Integer maSPCT, int soLuong, double giaGoc, double giaKM, String imageSP) {
        this.maSPCT = maSPCT;
        this.soLuong = soLuong;
        this.giaGoc = giaGoc;
        this.giaKM = giaKM;
        this.imageSP = imageSP;
    }

    public Integer getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(Integer maSPCT) {
        this.maSPCT = maSPCT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    public double getGiaKM() {
        return giaKM;
    }

    public void setGiaKM(double giaKM) {
        this.giaKM = giaKM;
    }

    public String getImageSP() {
        return imageSP;
    }

    public void setImageSP(String imageSP) {
        this.imageSP = imageSP;
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

    public KichThuoc getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(KichThuoc maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public MauSac getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(MauSac maMauSac) {
        this.maMauSac = maMauSac;
    }

    public SanPham getMaSP() {
        return maSP;
    }

    public void setMaSP(SanPham maSP) {
        this.maSP = maSP;
    }

    public Sanphamnoibat getSanphamnoibat() {
        return sanphamnoibat;
    }

    public void setSanphamnoibat(Sanphamnoibat sanphamnoibat) {
        this.sanphamnoibat = sanphamnoibat;
    }

    @XmlTransient
    public Collection<Giohang> getGiohangCollection() {
        return giohangCollection;
    }

    public void setGiohangCollection(Collection<Giohang> giohangCollection) {
        this.giohangCollection = giohangCollection;
    }

    @XmlTransient
    public Collection<CommentSP> getCommentSPCollection() {
        return commentSPCollection;
    }

    public void setCommentSPCollection(Collection<CommentSP> commentSPCollection) {
        this.commentSPCollection = commentSPCollection;
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
        if (!(object instanceof SanPhamChiTiet)) {
            return false;
        }
        SanPhamChiTiet other = (SanPhamChiTiet) object;
        if ((this.maSPCT == null && other.maSPCT != null) || (this.maSPCT != null && !this.maSPCT.equals(other.maSPCT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SanPhamChiTiet[ maSPCT=" + maSPCT + " ]";
    }
    
}
