/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PT-LS
 */
@Entity
@Table(name = "commentSP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CommentSP.findAll", query = "SELECT c FROM CommentSP c"),
    @NamedQuery(name = "CommentSP.findByMaComment", query = "SELECT c FROM CommentSP c WHERE c.maComment = :maComment"),
    @NamedQuery(name = "CommentSP.findByContent", query = "SELECT c FROM CommentSP c WHERE c.content = :content"),
    @NamedQuery(name = "CommentSP.findByTimecomment", query = "SELECT c FROM CommentSP c WHERE c.timecomment = :timecomment"),
    @NamedQuery(name = "CommentSP.findByStatuscomment", query = "SELECT c FROM CommentSP c WHERE c.statuscomment = :statuscomment"),
    @NamedQuery(name = "CommentSP.findByStatusreply", query = "SELECT c FROM CommentSP c WHERE c.statusreply = :statusreply")})
public class CommentSP implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaComment")
    private Integer maComment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timecomment")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timecomment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statuscomment")
    private int statuscomment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusreply")
    private int statusreply;
    @JoinColumn(name = "TenDN", referencedColumnName = "TenDN")
    @ManyToOne(optional = false)
    private Account tenDN;
    @JoinColumn(name = "MaSPCT", referencedColumnName = "MaSPCT")
    @ManyToOne(optional = false)
    private SanPhamChiTiet maSPCT;

    public CommentSP() {
    }

    public CommentSP(Integer maComment) {
        this.maComment = maComment;
    }

    public CommentSP(Integer maComment, String content, Date timecomment, int statuscomment, int statusreply) {
        this.maComment = maComment;
        this.content = content;
        this.timecomment = timecomment;
        this.statuscomment = statuscomment;
        this.statusreply = statusreply;
    }

    public Integer getMaComment() {
        return maComment;
    }

    public void setMaComment(Integer maComment) {
        this.maComment = maComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimecomment() {
        return timecomment;
    }

    public void setTimecomment(Date timecomment) {
        this.timecomment = timecomment;
    }

    public int getStatuscomment() {
        return statuscomment;
    }

    public void setStatuscomment(int statuscomment) {
        this.statuscomment = statuscomment;
    }

    public int getStatusreply() {
        return statusreply;
    }

    public void setStatusreply(int statusreply) {
        this.statusreply = statusreply;
    }

    public Account getTenDN() {
        return tenDN;
    }

    public void setTenDN(Account tenDN) {
        this.tenDN = tenDN;
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
        hash += (maComment != null ? maComment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommentSP)) {
            return false;
        }
        CommentSP other = (CommentSP) object;
        if ((this.maComment == null && other.maComment != null) || (this.maComment != null && !this.maComment.equals(other.maComment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CommentSP[ maComment=" + maComment + " ]";
    }
    
}
