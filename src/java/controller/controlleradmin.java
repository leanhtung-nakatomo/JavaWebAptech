/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Account;
import entity.DanhMuc;
import entity.DatHang;
import entity.DatHangChiTiet;
import entity.Image;
import entity.Imageproduct;
import entity.KichThuoc;
import entity.MauSac;
import entity.Nsx;
import entity.SanPham;
import entity.SanPhamChiTiet;
import entity.Sanphamnoibat;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.BASE64Encoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;

/**
 *
 * @author PT-LS
 */
@Controller
public class controlleradmin {

    // lưu trạng thái admin
    @RequestMapping("/processadmin")
    public String processadmin(@ModelAttribute("account") Account account,Model model) {
        Account acc = new DAO().findaccount(account.getTenDN());
        acc.setTrangThai(true);
        boolean deleteaccount = new DAO().deleteaccount(account);
        boolean saveinfomationaccount = new DAO().saveinfomationaccount(acc);
        if (saveinfomationaccount && deleteaccount) {
            List<Account> listaccountadmin = new DAO().listaccountadmin();
            
            List<Account> list = new DAO().listaccount();
            model.addAttribute("listadmin", listaccountadmin);
            model.addAttribute("account", new Account());
            model.addAttribute("list", list);
            return "forminsertAdmin";
        } else {       
            List<Account> list = new DAO().listaccount();
            model.addAttribute("account", new Account());
            model.addAttribute("list", list);
            return "forminsertAdmin";
        }
    }
//    @RequestMapping("/formrequest1")
//    public String formrequest1(){
//        return "from";
//    }

    @RequestMapping("/listaccountadmin")
    public String listadmin1(Model model) {
        List<Account> list = new DAO().listaccountadmin();
        model.addAttribute("list", list);
        return "accountadmin";
    }

    @RequestMapping("/listaccountmember")
    public String listaccountmember(Model model) {
        List<Account> list = new DAO().listaccountmember();
        model.addAttribute("list", list);
        return "accountmember";
    }

    @RequestMapping("/insign")
    public String insign(@ModelAttribute("account") Account account, Model model) {
        String pass = null;
        try {
            if (account.getMatKhau().length() != 0) {
                MessageDigest md;
                md = MessageDigest.getInstance("MD5");
                byte[] passAdmin = md.digest(account.getMatKhau().getBytes());
                BASE64Encoder encoder = new BASE64Encoder();
                pass = encoder.encode(passAdmin);
            }
        } catch (Exception e) {
        }
        String err = "";
        if ("Tên đăng nhập".equals(account.getTenDN())) {
            err = err + "Thiếu tên đăng nhập\n";
        }
        if ("Mật khẩu".equals(account.getMatKhau())) {
            err = err + "Thiếu mật khẩu\n";
        }

        if ("Số điện thoại".equals(account.getSdt())) {
            err = err + "Thiếu Số điện thoại\n";
        }

        if ("Email".equals(account.getEmail())) {
            err = err + "Thiếu Email\n";
        }

        if ("Địa chỉ".equals(account.getQueQuan())) {
            err = err + "Thiếu Địa chỉ\n";
        }

        if ("Họ tên".equals(account.getHoTen())) {
            err = err + "Thiếu họ tên\n";
        }
        account.setMatKhau(pass);
        if (err.equals("")) {
            boolean signin = new DAO().signin(account);
            if (signin) {
                model.addAttribute("result", "Đăng kí thành công");
                return "insign";
            } else {
                model.addAttribute("account", new Account());
                model.addAttribute("result", "Đăng kí thất bại");
                model.addAttribute("err", "1");
                return "insign";
            }
        } else {
            model.addAttribute("account", new Account());
            model.addAttribute("result", err);
            return "insign";
        }

    }

    // đăng nhập 
    @RequestMapping("/processlogin")
    public String processlogin(@ModelAttribute("account") Account account, Model model, HttpSession session) {
        String pass = null;
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("MD5");
            byte[] passAdmin = md.digest(account.getMatKhau().getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            pass = encoder.encode(passAdmin);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(controllerclient.class.getName()).log(Level.SEVERE, null, ex);
        }
        Account record = new DAO().getRecord(account.getTenDN(), pass);
        if (record != null) {
            model.addAttribute("result", "Đăng nhập thành công");
            session.setAttribute("login", record);
            return "redirect:/prelogin.htm";
        }
        model.addAttribute("result", "Đăng nhập thất bại");
        model.addAttribute("account", new Account());
        return "insign";
    }

    @RequestMapping("/prelogin")
    public String login(Model model, HttpSession session) {
        Account account = (Account) session.getAttribute("login");
        if (account == null) {
            model.addAttribute("account", new Account());
            return "insign";
        } else {
            if (account.getTrangThai() == null) {
                model.addAttribute("account", account);
                return "detailaccount";
            } else {
                return "redirect:/listadmin.htm";
            }

        }
    }

    @RequestMapping("/listadmin")
    public String listadmin(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("login");
        if (account == null) {
            return "redirect:/prelogin.htm";
        } else {
            List<DatHang> nguoidathang = new DAO().nguoidathang();
            Collections.reverse(nguoidathang);
            model.addAttribute("dathang", nguoidathang);
            return "home2";
        }
    }
//    @RequestMapping("/repass")
//    public String repass(){
//        
//        return "repass";        
//    }
    // lấy lại mật khẩu
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphaUpperCase = alpha.toUpperCase();
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALL = alpha + alphaUpperCase + digits + specials;
    private static Random generator = new Random();

    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }

    public String randomPassword(int numberOfCharactor) {
        List<String> result = new ArrayList<>();
        Consumer<String> appendChar = s -> {
            int number = randomNumber(0, s.length() - 1);
            result.add("" + s.charAt(number));
        };
        appendChar.accept(digits);
        appendChar.accept(specials);
        while (result.size() < numberOfCharactor) {
            appendChar.accept(ALL);
        }
        Collections.shuffle(result, generator);
        return String.join("", result);
    }

    

    @RequestMapping("/insertadmin")
    public String themquyenadmin(Model model) {
        List<Account> list = new DAO().listaccount();
        List<Account> listaccountadmin = new DAO().listaccountadmin();
        model.addAttribute("listadmin", listaccountadmin);
        model.addAttribute("account", new Account());
        model.addAttribute("list", list);
        return "forminsertAdmin";
    }

    @RequestMapping("/preinsertimageSP")
    public String preinsertimageSP(Model model) {
        List<Imageproduct> allimageSP = new DAO().getallimageSP();
        List<SanPham> allsanpham = new DAO().getallsanpham();
        model.addAttribute("listtable1", allimageSP);
        model.addAttribute("image1", new Imageproduct());
        model.addAttribute("listtable",allsanpham);
        return "forminsertImage1";
    }

    @RequestMapping("/insertimageSP")
    public String saveimageSP(@ModelAttribute("image1") Imageproduct image, Model model, HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        String path1 = request.getRealPath("jspadmin/resources/imagesfrontend");
        path1 = path1.substring(0, path1.indexOf("build")); // cắt chuỗi con từ đầu cho đến build 
        path1 = path1 + "web/jspadmin/resources/imagesfrontend";

//        String maSP = request.getParameter("maSP");
//        int parseInt = Integer.parseInt(maSP);
        DiskFileItemFactory item = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(item);
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fi : list) {
                if (fi.isFormField()) {
                    String fieldName = fi.getFieldName();
                    String value = fi.getString();
                    if (fieldName.equals("maImage")) {
                        image.setMaImage(new Integer(value));
                    } else if (fieldName.equals("maSP.maSP")) {
                        SanPham spById = new DAO().getSPById(new Integer(value));
                        image.setMaSP(spById);
                    }
                } else {
                    //day la du lieu cua anh
                    if (fi.getFieldName().equals("maHA.image")) {
                        
                        File file = new File("C:/Users/PT-LS/Documents/NetBeansProjects/DuAnJAVAWeb/web/jspadmin/resources/imagesfrontend/" + fi.getName());              
                        file.delete();
                        fi.write(new File(path1 + "/" + fi.getName()));
                        // tìm xem link hình ảnh đã có trong file chưa
                       
//                         nếu ko thấy link hình ảnh
                            Image imageHA = new Image();
                            imageHA.setImage(fi.getName());
                            imageHA.setRoleimage(true);
                            boolean insertImage = new DAO().insertImage(imageHA);
                            if (insertImage) {
                                image.setMaHA(imageHA);
                            }
                        
                    }
                }
            }

        } catch (FileUploadException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean saveimageSP = new DAO().saveimageSP(image);
        if (saveimageSP) {
            
            model.addAttribute("status", "Insert success!");
            List<Imageproduct> allimageSP = new DAO().getallimageSP();
            model.addAttribute("listtable1", allimageSP);
            
            return "forminsertImage1";
        } else {
            model.addAttribute("status", "Insert fail!");
            List<Imageproduct> allimageSP = new DAO().getallimageSP();
            model.addAttribute("listtable1", allimageSP);
            return "forminsertImage1";
        }
    }

    @RequestMapping("/saveimageoutsanding")
    public String saveimageoutsanding(@ModelAttribute("image") Sanphamnoibat image, Model model) {
        boolean insertImageoutsanding = new DAO().insertImageoutsanding(image);
        if (insertImageoutsanding) {
            return "redirect:/listadmin.htm";
        } else {
            model.addAttribute("image", new Sanphamnoibat());
            return "imageoutsanding";
        }
    }

    

    @RequestMapping("/PreUpdateNsx")
    public String preUpdateNsx(@RequestParam("id") Integer maNSX, Model model) {
        Nsx nsx = new DAO().getNsxById(maNSX);
        model.addAttribute("p", nsx);
        return "updateNsx";
    }

    @RequestMapping("/UpdateNsx")
    public String updateNsx(@ModelAttribute("p") Nsx p, Model model) {
        boolean bl = new DAO().updateNsx(p);
        if (bl) {
            return "redirect:/Nsx.htm";
        } else {
            model.addAttribute("error", "Sửa thất bại!");
            model.addAttribute("p", p);
            return "updateNsx";
        }
    }

    @RequestMapping("/PreUpdateDM")
    public String preUpdateDM(@RequestParam("id") Integer maDM, Model model) {
        DanhMuc danhmuc = new DAO().getDMById(maDM);
        model.addAttribute("d", danhmuc);
        return "updateDM";
    }

    @RequestMapping("/UpdateDM")
    public String updateDM(@ModelAttribute("d") DanhMuc d, Model model) {
        boolean bl = new DAO().updateDM(d);
        if (bl) {
            return "redirect:/DanhMuc.htm";
        } else {
            model.addAttribute("error", "Sửa thất bại!");
            model.addAttribute("d", d);
            return "updateDM";
        }
    }

    @RequestMapping("/PreUpdateSP")
    public String preUpdateSP(@RequestParam("id") Integer maSP, Model model) {
        SanPham sp = new DAO().getSPById(maSP);
        model.addAttribute("s", sp);
        List<Nsx> allNSX = new DAO().allNSX();
        List<DanhMuc> allDM = new DAO().allDM();
        model.addAttribute("Nsx", allNSX);
        model.addAttribute("DM", allDM);
        return "updateSP";
    }

    @RequestMapping("/UpdateSP")
    public String updateSP(@ModelAttribute("s") SanPham s, Model model) {
        boolean bl = new DAO().updateSP(s);
        if (bl) {
            return "redirect:/SanPham.htm";
        } else {
            model.addAttribute("error", "Sửa thất bại!");
            model.addAttribute("s", s);
            return "updateSP";
        }
    }

    @RequestMapping("/PreUpdateSize")
    public String preUpdateSize(@RequestParam("id") Integer maKichThuoc, Model model) {
        KichThuoc size = new DAO().getSizeById(maKichThuoc);
        model.addAttribute("s", size);
        return "updateSize";
    }

    @RequestMapping("/UpdateSize")
    public String updateSize(@ModelAttribute("s") KichThuoc s, Model model) {
        boolean bl = new DAO().updateSize(s);
        if (bl) {
            return "redirect:/Size.htm";
        } else {
            model.addAttribute("error", "Sửa thất bại!");
            model.addAttribute("s", s);
            return "updateSize";
        }
    }
    //maMauSac PreUpdateColor

    @RequestMapping("/PreUpdateColor")
    public String preUpdateColor(@RequestParam("id") Integer maMauSac, Model model) {
        MauSac mau = new DAO().getColorById(maMauSac);
        model.addAttribute("s", mau);
        return "updateColor";
    }

    @RequestMapping("/UpdateColor")
    public String updateColor(@ModelAttribute("s") MauSac s, Model model) {
        boolean bl = new DAO().updateColor(s);
        if (bl) {
            return "redirect:/Color.htm";
        } else {
            model.addAttribute("error", "Sửa thất bại!");
            model.addAttribute("s", s);
            return "updateColor";
        }
    }

    @RequestMapping("/PreUpdateSPCT")
    public String preUpdateSPCT(@RequestParam("id") Integer maSPCT, Model model) {
        SanPhamChiTiet spct = new DAO().getSPCTById(maSPCT);
        model.addAttribute("c", spct);

        List<Nsx> allNSX = new DAO().allNSX();
        List<DanhMuc> allDM = new DAO().allDM();
        List<KichThuoc> allSize = new DAO().allSize();
        List<MauSac> allColor = new DAO().allColor();
        List<SanPham> allSP = new DAO().allSP();
        model.addAttribute("allmausac", allColor);
        model.addAttribute("allkichthuoc", allSize);
        model.addAttribute("allsanpham", allSP);
        return "formupdateSPCT";
    }

    @RequestMapping("/UpdateSPCT")
    public String updateSPCT(@ModelAttribute("c") SanPhamChiTiet c, Model model, HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String path = request.getRealPath("jspadmin/resources/images");
        path = path.substring(0, path.indexOf("build"));
        path = path + "web/jspadmin/resources/images";
//        
//        String path1 = request.getRealPath("jspadmin/resources/images");
//        path1 = path1.substring(0, path1.indexOf("build")); // cắt chuỗi con từ đầu cho đến build 
//        path1 = path1 + "web/jspadmin/resources/images";
//        
        DiskFileItemFactory item = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(item);
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fi : list) {
                if (fi.isFormField()) {
                    //day la du lieu cua form
                    String fieldName = fi.getFieldName();
                    String value = fi.getString();
                    if (fieldName.equals("maSPCT")) {
                        c.setMaSPCT(new Integer(value));
                    } else if (fieldName.equals("soLuong")) {
                        c.setSoLuong(new Integer(value));
                    } else if (fieldName.equals("giaGoc")) {
                        c.setGiaGoc(new Double(value));
                    } else if (fieldName.equals("giaKM")) {
                        c.setGiaKM(new Double(value));
                    } // thieu truong roi ban oi bao sao ko hien dc
                    else if (fieldName.equals("maKichThuoc.maKichThuoc")) {
                        KichThuoc kt = new KichThuoc();
                        kt.setMaKichThuoc(new Integer(value));
                        c.setMaKichThuoc(kt);
                    } else if (fieldName.equals("maMauSac.maMauSac")) {
                        MauSac mausac = new MauSac();
                        mausac.setMaMauSac(new Integer(value));
                        c.setMaMauSac(mausac);
                    } else if (fieldName.equals("maSP.maSP")) {
                        SanPham sp = new SanPham();
                        sp.setMaSP(new Integer(value));
                        c.setMaSP(sp);
                    }else if (fieldName.equals("ghiChu")) {
                        c.setGhiChu(value);
                    }
                    

                } else {
                    //day la du lieu cua anh
                    File file = new File("C:\\Users\\PT-LS\\Documents\\NetBeansProjects\\DuAnJAVAWeb\\web\\jspadmin\\resources\\images\\" + fi.getName());

                    file.delete();
                    
                    if (fi.getFieldName().equals("imageSP")) {
                        fi.write(new File(path + "/" + fi.getName()));
                        c.setImageSP(fi.getName());
                    }
                }
            }
        } catch (FileUploadException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
//        boolean deleteSPCT = new DAO().deleteSPCT(c.getMaSPCT());
        boolean bl = new DAO().updateSPCT(c);
        if (bl) {
            return "redirect:/preInsertSPCT.htm";
        } else {
//            model.addAttribute("c", c);
            return "redirect:/preInsertSPCT.htm";
        }
      
 }

    @RequestMapping("/SearchNsxByName")
    public String searchNsxByName(Model model, HttpServletRequest request) {
        String tenNSX = request.getParameter("tenNSX");
        List<Nsx> list = new DAO().getNsxByName(tenNSX);
        model.addAttribute("Nsx", list);
        return "Nsxlist";
    }

    @RequestMapping("/SearchDmByName")
    public String searchDmByName(String tenDM, Model model) {
        List<DanhMuc> list = new DAO().getDmByName(tenDM);
        model.addAttribute("DM", list);
        return "DMlist";
    }

    @RequestMapping("/SearchSPByName")
    public String searchSPByName(String tenSP, Model model) {
        List<SanPham> list = new DAO().getSPByName(tenSP);
        model.addAttribute("SP", list);
        return "SPlist";
    }

    @RequestMapping("/SearchSizeByName")
    public String searchSizeByName(String tenKichThuoc, Model model) {
        List<KichThuoc> list = new DAO().getSizeByName(tenKichThuoc);
        model.addAttribute("Size2", list);
        return "Sizelist";
    }

    @RequestMapping("/SearchColorByName")
    public String searchColorByName(String tenMauSac, Model model) {
        List<MauSac> list = new DAO().getColorByName(tenMauSac);
        model.addAttribute("color", list);
        return "Colorlist";
    }

    @RequestMapping("/preInsertNSX1")
    public String preInsertNSX(Model model) {
        model.addAttribute("n", new Nsx());
        List<Nsx> allNsx = new DAO().getAllNsx1();
        model.addAttribute("Nsx", allNsx);
//        model.addAttribute("status", "success!");
        return "forminsertNXS";
    }
//    @RequestMapping("/Nsx")
//    public String listNsx(Integer offset, Integer maxResult, Model model){
//        List<Nsx> allNsx = new DAO().getAllNsx(offset, maxResult);
//        model.addAttribute("Nsx", allNsx);
//        long total = new DAO().getTotalSPCTRecord();
//        model.addAttribute("total", total);
//        model.addAttribute("offset", offset);
//        return "Nsxlist";
//    }

    @RequestMapping("/InsertNSX")
    public String insertNSX(@ModelAttribute("n") Nsx n, Model model) {
        boolean bl = new DAO().insertNSX(n);
        List<Nsx> allNsx = new DAO().getAllNsx1();
        if (bl) {
            model.addAttribute("Nsx", allNsx);
            model.addAttribute("status", "success!");
            return "forminsertNXS";
        } else {
            model.addAttribute("status", "Thêm mới thất bại!");
            return "forminsertNXS";
        }
    }

    @RequestMapping("/preInsertDM")
    public String preInsertDM(Model model) {
        List<DanhMuc> allDM = new DAO().getAllDM1();
        model.addAttribute("DM", allDM);
        model.addAttribute("d", new DanhMuc());
        return "forminsertDMSP";
    }

    @RequestMapping("/InsertDM")
    public String insertDM(@ModelAttribute("d") DanhMuc d, Model model) {
        boolean bl = new DAO().insertDM(d);
        if (bl) {
            List<DanhMuc> allDM = new DAO().getAllDM1();
            model.addAttribute("DM", allDM);
            model.addAttribute("status", "success");
            return "forminsertDMSP";
        } else {
            model.addAttribute("status", "Thêm mới thất bại!");
            return "forminsertDMSP";
        }
    }

    @RequestMapping("/preInsertSP")
    public String preInsertProduct(Model model) {
        model.addAttribute("s", new SanPham());
        List<SanPham> allsanpham = new DAO().getallsanpham();
        List<Nsx> allNSX = new DAO().allNSX();
        List<DanhMuc> allDM = new DAO().allDM();
        model.addAttribute("listtable", allsanpham);
        model.addAttribute("Nsx", allNSX);
        model.addAttribute("DM", allDM);
        return "forminsertSP";
    }

    @RequestMapping("/InsertProduct")
    public String insertProduct(@ModelAttribute("s") SanPham s, Model model) {
        boolean bl = new DAO().insertProduct(s);
        List<SanPham> allsanpham = new DAO().getallsanpham();
        if (bl) {
            model.addAttribute("s", s);
            List<Nsx> allNSX = new DAO().allNSX();
            List<DanhMuc> allDM = new DAO().allDM();
            model.addAttribute("Nsx", allNSX);
            model.addAttribute("DM", allDM);
            model.addAttribute("listtable", allsanpham);
            model.addAttribute("status", "Insert success!");
            return "forminsertSP";
        } else {
            model.addAttribute("s", new SanPham());
            List<Nsx> allNSX = new DAO().allNSX();
            List<DanhMuc> allDM = new DAO().allDM();
            model.addAttribute("Nsx", allNSX);
            model.addAttribute("DM", allDM);
            model.addAttribute("status", "Insert failed!");
            return "forminsertSP";
        }
    }

    //  preInsertSize
    @RequestMapping("/preInsertSize")
    public String preInsertSize(Model model) {
        List<KichThuoc> allSize = new DAO().getAllSize1();
        model.addAttribute("Size2", allSize);
        model.addAttribute("s", new KichThuoc());
        return "forminsertSize";
    }

    @RequestMapping("/InsertSize")
    public String insertSize(@ModelAttribute("s") KichThuoc s, Model model) {
        boolean bl = new DAO().insertSize(s);
        if (bl) {
            model.addAttribute("status", "success");
            List<KichThuoc> allSize = new DAO().getAllSize1();
            model.addAttribute("Size2", allSize);
            return "forminsertSize";
        } else {
            List<KichThuoc> allSize = new DAO().getAllSize1();
            model.addAttribute("Size2", allSize);
            model.addAttribute("status", "Thêm mới thất bại!");
            return "forminsertSize";
        }
    }

    @RequestMapping("/preInsertColor")
    public String preInsertColor(Model model) {
        List<MauSac> allColor = new DAO().getAllColor1();
        model.addAttribute("color", allColor);
        model.addAttribute("c", new MauSac());
        return "forminsertMS";
    }

    @RequestMapping("/InsertColor")
    public String insertColor(@ModelAttribute("c") MauSac c, Model model) {
        boolean bl = new DAO().insertColor(c);
        if (bl) {
            model.addAttribute("status", "Success");
            List<MauSac> allColor = new DAO().getAllColor1();
            model.addAttribute("color", allColor);
            return "forminsertMS";
        } else {
            List<MauSac> allColor = new DAO().getAllColor1();
            model.addAttribute("color", allColor);
            model.addAttribute("status", "Thêm mới thất bại!");
            return "forminsertMS";
        }
    }

    @RequestMapping("/preInsertSPCT")
    public String preInsertSPCT(Model model) {
        List<SanPham> allsanpham = new DAO().getallsanpham();
        List<MauSac> allmausac = new DAO().getallmausac();
        List<KichThuoc> allkichthuoc = new DAO().getallkichthuoc();
        List<SanPhamChiTiet> SPCTbyProduct = new DAO().SPCT();
        model.addAttribute("listtable", SPCTbyProduct);
        model.addAttribute("c", new SanPhamChiTiet());
        model.addAttribute("allsanpham", allsanpham);
        model.addAttribute("allmausac", allmausac);
        model.addAttribute("allkichthuoc", allkichthuoc);
        return "forminsertSPCT";
    }

    @RequestMapping("/InsertSPCT")
    public String insertSPCT(@ModelAttribute("c") SanPhamChiTiet c, Model model, HttpServletRequest request) {

        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<KichThuoc> allSize1 = new DAO().getAllSize1();
        List<MauSac> allColor1 = new DAO().getAllColor1();
        int allcolor = allColor1.size();
        int allsize = allSize1.size();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 1; i <= allsize; i++) {
            String stt = String.valueOf(i);
            String parameter = request.getParameter("Size" + stt);
            if (parameter != null) {
                list1.add(parameter);
            }
//            KichThuoc kichthuoc = new KichThuoc();
//            kichthuoc.setTenKichThuoc(parameter);
//            boolean insertSize = new DAO().insertSize(kichthuoc);
        }

        for (int i = 1; i <= allcolor; i++) {
            String stt = String.valueOf(i);
            String parameter = request.getParameter("Color" + stt);
            if (parameter != null) {
                list2.add(parameter);
            }
//            MauSac mauSac = new MauSac();
//            mauSac.setTenMauSac(parameter);
//            boolean insertColor = new DAO().insertColor(mauSac);
        }

        String path1 = request.getRealPath("jspadmin/resources/images");
        path1 = path1.substring(0, path1.indexOf("build")); // cắt chuỗi con từ đầu cho đến build 
        path1 = path1 + "web/jspadmin/resources/images";
//      String path2 = request.getRealPath("jsp/resources/images");
//      path2 = path2.substring(0, path2.indexOf("build")-1); // cắt chuỗi con từ đầu cho đến build 
//      path2 = path2 + "DuAnJAVAWeb/web/jsp/resources/images";
        DiskFileItemFactory item = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(item);
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fi : list) {
                if (fi.isFormField()) {
                    //day la du lieu cua form
                    String fieldName = fi.getFieldName();
                    String value = fi.getString();
                    if (fieldName.equals("maSPCT")) {
                        c.setMaSPCT(new Integer(value));
                    } else if (fieldName.equals("soLuong")) {
                        c.setSoLuong(new Integer(value));
                    } else if (fieldName.equals("giaGoc")) {
                        c.setGiaGoc(new Double(value));
                    } else if (fieldName.equals("giaKM")) {
                        c.setGiaKM(new Double(value));
                    } // thieu truong roi ban oi bao sao ko hien dc
                    else if (fieldName.equals("ghiChu")) {
                        c.setGhiChu(value);
                    } 
                    //                   else if(fieldName.equals("maKichThuoc.maKichThuoc")){
                    //                        KichThuoc kt = new KichThuoc();
                    //                        kt.setMaKichThuoc(new Integer(value));
                    //                        c.setMaKichThuoc(kt);
                    //                    }
                    //                    else if(fieldName.equals("maMauSac.maMauSac")){
                    //                        MauSac mausac = new MauSac();
                    //                        mausac.setMaMauSac(new Integer(value));
                    //                        c.setMaMauSac(mausac);
                    //                    }
                    else if (fieldName.equals("maSP.maSP")) {
                        SanPham sp = new SanPham();
                        sp.setMaSP(new Integer(value));
                        c.setMaSP(sp);
                    }

                } else {
                    //day la du lieu cua anh
                    
                    File file = new File("C:/Users/PT-LS/Documents/NetBeansProjects/DuAnJAVAWeb/web/jspadmin/resources/images/"+fi.getName());
                    file.delete();
//                    
                    if (fi.getFieldName().equals("imageSP")) {
                        fi.write(new File(path1 + "/" + fi.getName()));
                        c.setImageSP(fi.getName());
                    }
                }
            }
        } catch (FileUploadException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean bl = false;
        for (int i = 0; i < list1.size(); i++) { // list1 size list 2 color
            for (int j = 0; j < list2.size(); j++) {
                MauSac mausac = new DAO().searchmausac(Integer.parseInt(list2.get(j)));
                c.setMaMauSac(mausac);
                KichThuoc kichthuoc = new DAO().searchkichthuoc(Integer.parseInt(list1.get(i)));
                c.setMaKichThuoc(kichthuoc);
                bl = new DAO().insertSPCT(c);
            }
        }

        if (bl) {

            List<SanPhamChiTiet> SPCTbyProduct = new DAO().SPCTbyProduct(c.getMaSP().getMaSP());
            model.addAttribute("listtable", SPCTbyProduct);
            model.addAttribute("status", "Insert susscess!");
            List<SanPham> allsanpham = new DAO().getallsanpham();
            List<MauSac> allmausac = new DAO().getallmausac();
            List<KichThuoc> allkichthuoc = new DAO().getallkichthuoc();
            model.addAttribute("c", c);

            model.addAttribute("allsanpham", allsanpham);
            model.addAttribute("allmausac", allmausac);
            model.addAttribute("allkichthuoc", allkichthuoc);

            return "forminsertSPCT";
        } else {
            model.addAttribute("status", "Insert failed!");
            List<SanPham> allsanpham = new DAO().getallsanpham();
            List<MauSac> allmausac = new DAO().getallmausac();
            List<KichThuoc> allkichthuoc = new DAO().getallkichthuoc();
            model.addAttribute("c", new SanPhamChiTiet());
            model.addAttribute("allsanpham", allsanpham);
            model.addAttribute("allmausac", allmausac);
            model.addAttribute("allkichthuoc", allkichthuoc);

            return "forminsertSPCT";
        }
//        List<SanPhamChiTiet> list = new DAO().getAllSPCT(Integer.MIN_VALUE, Integer.SIZE);
//        model.addAttribute("list", list);

    }

    @RequestMapping("/SPCT")
    public String listSPCT(Integer offset, Integer maxResult, Model model) {
        List<SanPhamChiTiet> allSPCT = new DAO().getAllSPCT(offset, maxResult);
        model.addAttribute("SPCT", allSPCT);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "SPCTlist";
    }

    @RequestMapping("/SPCTlist")
    public String listSPCT(Model model, Integer offset, Integer maxResult) {
        List<SanPhamChiTiet> allSPCT = new DAO().getSPCT(offset, maxResult);
        model.addAttribute("SPCT", allSPCT);
        return "SPCTlist";
    }

    @RequestMapping("/Nsx")
    public String listNsx(Integer offset, Integer maxResult, Model model) {
        List<Nsx> allNsx = new DAO().getAllNsx(offset, maxResult);
        model.addAttribute("Nsx", allNsx);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Nsxlist";
    }

    @RequestMapping("/DanhMuc")
    public String listDM(Integer offset, Integer maxResult, Model model) {
        List<DanhMuc> allDM = new DAO().getAllDM(offset, maxResult);
        model.addAttribute("DM", allDM);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "DMlist";
    }

    @RequestMapping("/SanPham")
    public String listSP(Integer offset, Integer maxResult, Model model) {
        List<SanPham> allSP = new DAO().getAllSP(offset, maxResult);
        model.addAttribute("SP", allSP);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "SPlist";
    }

    @RequestMapping("/Size")
    public String listSize(Integer offset, Integer maxResult, Model model) {
        List<KichThuoc> allSize = new DAO().getAllSize(offset, maxResult);
        model.addAttribute("Size2", allSize);
        long total = new DAO().getTotalSizeRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Sizelist";
    }

    @RequestMapping("/Color")
    public String listColor(Integer offset, Integer maxResult, Model model) {
        List<MauSac> allColor = new DAO().getAllColor(offset, maxResult);
        model.addAttribute("color", allColor);
        long total = new DAO().getTotalColorRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Colorlist";
    }

    @RequestMapping("/deleteNsx")
    public String deleteNsx(@RequestParam("id") Integer maNSX, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteNSX(maNSX);
        if (bl) {
            model.addAttribute("status1", "Deleted successfully!");
        } else {
            model.addAttribute("status2", "Delete failed!");
        }
        List<Nsx> allNsx = new DAO().getAllNsx(offset, maxResult);
        model.addAttribute("Nsx", allNsx);
        long total = new DAO().getTotalNsxRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "redirect:/preInsertNSX1.htm";
    }

    @RequestMapping("/deleteDM")
    public String deleteDM(@RequestParam("id") Integer maDM, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteDM(maDM);
        return "redirect:/preInsertDM.htm";
    }

    @RequestMapping("/deleteSP")
    public String deleteSP(@RequestParam("id") Integer maSP, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteSP(maSP);
        if (bl) {
            model.addAttribute("status1", "Deleted successfully!");
        } else {
            model.addAttribute("status2", "Delete failed!");
        }
        List<SanPham> allSP = new DAO().getAllSP(offset, maxResult);
        model.addAttribute("SP", allSP);
        long total = new DAO().getTotalSPRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "redirect:/preInsertSP.htm";
    }

    @RequestMapping("/deleteSize")
    public String deleteSize(@RequestParam("id") Integer maKichThuoc, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteSize(maKichThuoc);

        return "redirect:/preInsertSize.htm";
    }

    @RequestMapping("/deleteColor")
    public String deleteColor(@RequestParam("id") Integer maMauSac, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteColor(maMauSac);
        return "redirect:/preInsertColor.htm";
    }

    @RequestMapping("/deleteSPCT")
    public String deleteSPCT(@RequestParam("id") Integer maSPCT, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteSPCT(maSPCT);
        return "redirect:/preInsertSPCT.htm";
    }
    @RequestMapping("/deleteImage")
    public String deleteImage(@RequestParam("id") Integer maHA, Model model, Integer offset, Integer maxResult) {
        boolean bl = new DAO().deleteImagefrontend(maHA);
        return "redirect:/preinsertImagefrontend.htm";
    }
    
    @RequestMapping("/Saveimage")
    public String ImageFrontend(@ModelAttribute("image2") Image image, Model model, HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String path1 = request.getRealPath("jspadmin/resources/imagesfrontend");
        path1 = path1.substring(0, path1.indexOf("build")); // cắt chuỗi con từ đầu cho đến build 
        path1 = path1 + "web/jspadmin/resources/imagesfrontend";

        DiskFileItemFactory item = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(item);
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fi : list) {
                if (fi.isFormField()) {
                    String fieldName = fi.getFieldName();
                    String value = fi.getString();
                    if (fieldName.equals("maHA")) {
                        image.setMaHA(new Integer(value));
                    }
                } else {
                    //day la du lieu cua anh
                    if (fi.getFieldName().equals("image")) {
                        fi.write(new File(path1 + "/" + fi.getName()));
                        image.setImage(fi.getName());
                    }
                }
            }

        } catch (FileUploadException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(controlleradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        image.setRoleimage(false);
        boolean insertImage = new DAO().insertImage(image);
//        List<SanPhamChiTiet> list = new DAO().getAllSPCT(Integer.MIN_VALUE, Integer.SIZE);
//        model.addAttribute("list", list);
        if (insertImage) {
            model.addAttribute("status","insert success");
            model.addAttribute("image", new Image());
            List<Image> allimage = new DAO().getallimage();
            model.addAttribute("listimage", allimage);
            return "forminsertImagefrontend";
        } else {
            model.addAttribute("status","insert fail");
            model.addAttribute("image", new Image());
            List<Image> allimage = new DAO().getallimage();
            model.addAttribute("listimage", allimage);
            return "forminsertImagefrontend";
        }
    }
    
    @RequestMapping("/preinsertImagefrontend")
    public String preinssertImagefrontend(Model model){
        List<Image> allimage = new DAO().getallimage();
        model.addAttribute("image2" , new Image());
        model.addAttribute("listimage", allimage);
        return "forminsertImagefrontend";
    }
    @RequestMapping("/deleteimagesp")
    public String xoaimagesp(@RequestParam("id")Integer id){
        boolean deleteImageSP = new DAO().deleteImageSP(id);
        return "redirect:/preinsertimageSP.htm";     
    }
    
    @RequestMapping("/chitietdonhang")
    public String chitietdonhang1(@RequestParam("id")Integer id , Model model){
        List<DatHangChiTiet> alldathangchitietbynguoidathang = new DAO().getalldathangchitietbynguoidathang(id);
        model.addAttribute("listgiohang", alldathangchitietbynguoidathang);
        return "chitietdonhang";       
    }
}
