/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Account;
import entity.CommentSP;
import entity.DanhMuc;
import entity.DatHang;
import entity.DatHangChiTiet;
import entity.Giohang;
import entity.Image;
import entity.Imageproduct;
import entity.KichThuoc;
import entity.MauSac;
import entity.Nsx;
import entity.SanPham;
import entity.SanPhamChiTiet;
import entity.Sanphamnoibat;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public class DAO {
    public boolean updateNsx(Nsx p){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
       
    public boolean updateDM(DanhMuc d){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(d);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean updateSP(SanPham s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean updateSize(KichThuoc s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean updateColor(MauSac s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean updateSPCT(SanPhamChiTiet c){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(c);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public Nsx getNsxById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Nsx p = (Nsx) session.createQuery("from Nsx where maNSX = :maNSX")
                    .setParameter("maNSX", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public List<SanPhamChiTiet> SPCTbyProduct(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet where maSP.maSP = :id").setParameter("id", id).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public DanhMuc getDMById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            DanhMuc d = (DanhMuc) session.createQuery("from DanhMuc where maDM = :maDM")
                    .setParameter("maDM", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return d;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public SanPham getSPById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SanPham s = (SanPham) session.createQuery("from SanPham where maSP = :maSP")
                    .setParameter("maSP", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public KichThuoc getSizeById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            KichThuoc s = (KichThuoc) session.createQuery("from KichThuoc where maKichThuoc = :maKichThuoc")
                    .setParameter("maKichThuoc", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public MauSac getColorById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            MauSac s = (MauSac) session.createQuery("from MauSac where maMauSac = :maMauSac")
                    .setParameter("maMauSac", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public SanPhamChiTiet getSPCTById(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SanPhamChiTiet c = (SanPhamChiTiet) session.createQuery("from SanPhamChiTiet where maSPCT = :maSPCT")
                    .setParameter("maSPCT", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public SanPhamChiTiet getSPCTBymaSP(Integer id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SanPhamChiTiet c = (SanPhamChiTiet) session.createQuery("from SanPhamChiTiet where maSP = :maSP")
                    .setParameter("maSP", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public SanPhamChiTiet getspctbymausacvakichthuoc(Integer maSP ,Integer makichthuoc ,Integer mausac ){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SanPhamChiTiet c = (SanPhamChiTiet) session.createQuery("from SanPhamChiTiet where maSP.maSP = :maSP and maKichThuoc.maKichThuoc = :makichthuoc and maMauSac.maMauSac = :mausac")
                    .setParameter("maSP", maSP).setParameter("makichthuoc", makichthuoc).setParameter("mausac", mausac)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Account> listaccount(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Account").list();
        
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<MauSac> getColorByName(String tenMauSac){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(tenMauSac==null || tenMauSac.length()==0)
                tenMauSac ="%";
            else tenMauSac = "%"+tenMauSac+"%";
            List list = session.createQuery("from MauSac where tenMauSac like :tenMauSac")
                    .setParameter("tenMauSac", tenMauSac).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<KichThuoc> getSizeByName(String tenKichThuoc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(tenKichThuoc==null || tenKichThuoc.length()==0)
                tenKichThuoc ="%";
            else tenKichThuoc = "%"+tenKichThuoc+"%";
            List list = session.createQuery("from KichThuoc where tenKichThuoc like :tenKichThuoc")
                    .setParameter("tenKichThuoc", tenKichThuoc).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
     
    public List<SanPham> getSPByName(String tenSP){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(tenSP==null || tenSP.length()==0)
                tenSP ="%";
            else tenSP = "%"+tenSP+"%";
            List list = session.createQuery("from SanPham where tenSP like :tenSP")
                    .setParameter("tenSP", tenSP).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
     public List<DanhMuc> allDM (){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DanhMuc").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<MauSac> allColor (){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from MauSac").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public List<KichThuoc> allSize (){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from KichThuoc").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public List<SanPham> allSP (){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPham").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<DanhMuc> getDmByName(String tenDM){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(tenDM==null || tenDM.length()==0)
                tenDM ="%";
            else tenDM = "%"+tenDM+"%";
            List list = session.createQuery("from DanhMuc where tenDM like :tenDM")
                    .setParameter("tenDM", tenDM).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Nsx> getNsxByName(String tenNSX){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(tenNSX==null || tenNSX.length()==0)
                tenNSX ="%";
            else tenNSX = "%"+tenNSX+"%";
            List list = session.createQuery("from Nsx where tenNSX like :tenNSX")
                    .setParameter("tenNSX", tenNSX).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public Account findaccount(String tenDN){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Account uniqueResult = (Account) session.createQuery("from Account where tenDN = :tenDN").setParameter("tenDN",tenDN).uniqueResult();      
            session.getTransaction().commit();
            session.close();
            return uniqueResult;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public boolean addcomment(CommentSP comment){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(comment);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public List<CommentSP> selectcomment(Integer maspct){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from CommentSP where maSPCT.maSPCT = :maspct").setParameter("maspct",maspct).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
     public List<CommentSP> listcomment(Integer masp){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from CommentSP where maSPCT.maSPCT = :masp").setParameter("maspct", masp).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    //  số lượng bình luận trong bài viết
    public int sizelistcomment(Integer maspct){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from CommentSP where maSPCT.maSPCT = :maspct and statusreply = 0").setParameter("maspct",maspct).list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    // số lượng bình luận của comment cụ thể có trong bài viết 
//    public int sizelistcommentdetail(Integer maspct){
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        try {
//            session.beginTransaction();
//            session.createQuery("from CommentSP where maSPCT.maSPCT = :maspct and statusreply = 0").setParameter("maspct",maspct);
//            session.getTransaction().commit();
//            session.close();
//            return list.size();
//        } catch (Exception e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//            session.close();
//        }
//        return 0;
//    }
   
    public boolean deleteaccount(Account account){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from Account where tenDN = :tenDN")
                    .setParameter("tenDN", account.tenDN)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean saveinfomationaccount(Account account){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean saveimage(Image image){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(image);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean saveimageSP(Imageproduct image){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(image);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean updateaccount(Account account){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(account);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean insertProduct(SanPham s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean insertImage(Image s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean insertImageSP(Imageproduct s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public Image searchimage(String s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Image image = (Image) session.createQuery("from Image where image = :image").setParameter("image", s).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return image;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public boolean insertImageoutsanding(Sanphamnoibat s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public Account getinfoAccount(String gmail){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Account uniqueResult = (Account) session.createQuery("from Account a WHERE a.email = :email").setParameter("email",gmail).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return uniqueResult;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Account> listaccountadmin(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Account where trangThai = true").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Account> listaccountmember(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Account").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> getSPCT(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet ")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?5:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> SPCT(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet ")
                   .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Imageproduct> listImage(Integer maSP){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = (List) session.createQuery("from Imageproduct s where s.maSP.maSP = :maSP").setParameter("maSP",maSP)
                   .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> loaisanpham(Integer masp){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = (List) session.createQuery("from SanPhamChiTiet where maSP.maSP = :maSP").setParameter("maSP",masp).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Sanphamnoibat> SPNB(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Sanphamnoibat")
                   .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public boolean signin(Account account){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean inserdonhang(DatHangChiTiet donhang){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(donhang);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean insertdathang(DatHang dathang){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(dathang);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean insertgiohang(Giohang giohang){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(giohang);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean insertNSX (Nsx n){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(n);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean insertDM (DanhMuc d){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(d);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean insertSize (KichThuoc s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean insertColor (MauSac c){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(c);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean insertSPCT (SanPhamChiTiet c){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(c);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public List<SanPhamChiTiet> getAllSPCT(Integer offset1, Integer maxResult1){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String search = "%" + "apple" + "%";
            List list = session.createQuery("from SanPhamChiTiet where  ghiChu = 'list' and maSP.tenSP like :search").setParameter("search", search)
                    .setFirstResult(offset1==null?0:offset1)
                    .setMaxResults(maxResult1==null?4:maxResult1).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
     public long getTotalSPCTRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet where MaSP = 1")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    public List<Image> getallimage(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Image where roleimage = 0")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Imageproduct> getallimageSP(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Imageproduct")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> getallxiaomiproduct(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String search = "%" + "xiaomi" + "%";
            List list = session.createQuery("from SanPhamChiTiet where ghiChu = 'list' and maSP.tenSP like :search").setParameter("search", search)
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?4:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> getallsamsungproduct(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String search = "%" + "Samsung" + "%";
            List list = session.createQuery("from SanPhamChiTiet where ghiChu = 'list' and maSP.tenSP like :search").setParameter("search", search)
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?4:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public long getallxiaomiproductsize(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet where MaSP = 2")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    public List<DatHangChiTiet> getdonhang(Integer offset , Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
           List list = session.createQuery("from DatHangChiTiet").setFirstResult(offset==null?0:offset).setMaxResults(maxResult==null?10:maxResult)
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<DatHang> nguoidathang(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DatHang").list();               
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPhamChiTiet> searchbyname(String search){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            if(search==null||search.length()==0) 
               search = "%";
            else
               search = "%" + search + "%";
            List list = session.createQuery("from SanPhamChiTiet c where c.maSP.tenSP like :search").setParameter("search",search).list();               
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;      
    }
    public MauSac searchmausac(Integer maMS){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            MauSac mausac = (MauSac) session.createQuery("from MauSac c where c.maMauSac = :maMS").setParameter("maMS",maMS).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return mausac;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;      
    }
    public KichThuoc searchkichthuoc(Integer maKT){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            KichThuoc kichthuoc = (KichThuoc) session.createQuery("from KichThuoc c where c.maKichThuoc = :maKT").setParameter("maKT",maKT).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return kichthuoc;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;      
    }
    public long getsizedonhang(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DatHangChiTiet")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    public List<Nsx> getAllNsx1(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Nsx")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<Nsx> getAllNsx(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Nsx")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?15:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
     public List<Nsx> allNSX (){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Nsx").list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public long getTotalNsxRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Nsx")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    public Account getRecord(String tenDN ,String matKhau){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Account uniqueResult = (Account) session.createQuery("from Account where tenDN = :tenDN and matKhau = :matKhau" ).setParameter("tenDN", tenDN).setParameter("matKhau", matKhau).uniqueResult();
            session.getTransaction().commit();
            session.close();
            return uniqueResult;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public List<SanPham> getallsanpham(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPham")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<SanPham> getallimagesanpham(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Imageproduct")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<DanhMuc> getAllDM(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DanhMuc")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?15:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<DanhMuc> getAllDM1(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DanhMuc")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public long getTotalDMRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DanhMuc")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    public List<SanPham> getAllSP(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPham")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?15:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public long getTotalSPRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPham")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    public List<KichThuoc> getAllSize(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from KichThuoc")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?15:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<KichThuoc> getAllSize1(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from KichThuoc")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<DatHangChiTiet> getalldathangchitietbynguoidathang(Integer maDH){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from DatHangChiTiet where maDH.maDH = :maDH").setParameter("maDH", maDH)
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<KichThuoc> getallkichthuoc(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from KichThuoc")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public long getTotalSizeRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from KichThuoc")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    public List<MauSac> getAllColor(Integer offset, Integer maxResult){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from MauSac")
                    .setFirstResult(offset==null?0:offset)
                    .setMaxResults(maxResult==null?15:maxResult).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<MauSac> getAllColor1(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from MauSac")
                   .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    
    public List<SanPhamChiTiet> getallmausacbySP(Integer s){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from SanPhamChiTiet s where s.maSP.maSP = :maSP").setParameter("maSP", s)
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
    public List<MauSac> getallmausac(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from MauSac")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return null;
    }
   
    public long getTotalColorRecord(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from MauSac")
                    .list();
            session.getTransaction().commit();
            session.close();
            return list.size();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return 0;
    }
    
    public boolean deleteNSX(Integer maNSX){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from Nsx where maNSX = :maNSX")
                    .setParameter("maNSX", maNSX)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteDM(Integer maDM){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from DanhMuc where maDM = :maDM")
                    .setParameter("maDM", maDM)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteSP(Integer maSP){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from SanPham where maSP = :maSP")
                    .setParameter("maSP", maSP)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteSize(Integer maKichThuoc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from KichThuoc where maKichThuoc = :maKichThuoc")
                    .setParameter("maKichThuoc", maKichThuoc)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteColor(Integer maMauSac){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from MauSac where maMauSac = :maMauSac")
                    .setParameter("maMauSac", maMauSac)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    
    public boolean deleteSPCT(Integer maSPCT){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from SanPhamChiTiet where maSPCT = :maSPCT")
                    .setParameter("maSPCT", maSPCT)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean deleteImagefrontend(Integer maHA){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from Image where maHA = :maHA")
                    .setParameter("maHA", maHA)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
    public boolean deleteImageSP(Integer maImage){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int i = session.createQuery("delete from Imageproduct where maImage = :maImage")
                    .setParameter("maImage", maImage)
                    .executeUpdate();
            session.getTransaction().commit();
            session.close();
            if(i>0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return false;
    }
}
