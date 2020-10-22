/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "DatHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatHang.findAll", query = "SELECT d FROM DatHang d"),
    @NamedQuery(name = "DatHang.findByMaDH", query = "SELECT d FROM DatHang d WHERE d.maDH = :maDH"),
    @NamedQuery(name = "DatHang.findByHoTen", query = "SELECT d FROM DatHang d WHERE d.hoTen = :hoTen"),
    @NamedQuery(name = "DatHang.findByDiachigiaohang", query = "SELECT d FROM DatHang d WHERE d.diachigiaohang = :diachigiaohang"),
    @NamedQuery(name = "DatHang.findBySdt", query = "SELECT d FROM DatHang d WHERE d.sdt = :sdt"),
    @NamedQuery(name = "DatHang.findByEmail", query = "SELECT d FROM DatHang d WHERE d.email = :email"),
    @NamedQuery(name = "DatHang.findByNgayDH", query = "SELECT d FROM DatHang d WHERE d.ngayDH = :ngayDH"),
    @NamedQuery(name = "DatHang.findByGhiChu", query = "SELECT d FROM DatHang d WHERE d.ghiChu = :ghiChu"),
    @NamedQuery(name = "DatHang.findByTrangThai", query = "SELECT d FROM DatHang d WHERE d.trangThai = :trangThai")})
public class DatHang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDH")
    private Integer maDH;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "HoTen")
    private String hoTen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Diachigiaohang")
    private String diachigiaohang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SDT")
    private String sdt;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Email")
    private String email;
    @Column(name = "NgayDH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDH;
    @Size(max = 400)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "TrangThai")
    private Boolean trangThai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDH")
    private Collection<DatHangChiTiet> datHangChiTietCollection;

    public DatHang() {
    }

    public DatHang(Integer maDH) {
        this.maDH = maDH;
    }

    public DatHang(Integer maDH, String hoTen, String diachigiaohang, String sdt, String email) {
        this.maDH = maDH;
        this.hoTen = hoTen;
        this.diachigiaohang = diachigiaohang;
        this.sdt = sdt;
        this.email = email;
    }

    public Integer getMaDH() {
        return maDH;
    }

    public void setMaDH(Integer maDH) {
        this.maDH = maDH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayDH() {
        return ngayDH;
    }

    public void setNgayDH(Date ngayDH) {
        this.ngayDH = ngayDH;
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
    public Collection<DatHangChiTiet> getDatHangChiTietCollection() {
        return datHangChiTietCollection;
    }

    public void setDatHangChiTietCollection(Collection<DatHangChiTiet> datHangChiTietCollection) {
        this.datHangChiTietCollection = datHangChiTietCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDH != null ? maDH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatHang)) {
            return false;
        }
        DatHang other = (DatHang) object;
        if ((this.maDH == null && other.maDH != null) || (this.maDH != null && !this.maDH.equals(other.maDH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DatHang[ maDH=" + maDH + " ]";
    }
    
}
