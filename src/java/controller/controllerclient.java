/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Account;
import entity.CommentSP;
import entity.DatHang;
import entity.DatHangChiTiet;
import entity.Giohang;
import entity.Image;
import entity.Imageproduct;
import entity.KichThuoc;
import entity.MauSac;
import entity.SanPham;
import entity.SanPhamChiTiet;
import entity.Sanphamnoibat;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PT-LS
 */
@Controller
public class controllerclient {

    @RequestMapping("/signout")
    public String signout(HttpServletRequest request) {
        HttpSession session = request.getSession();
//        Account account = (Account) session.getAttribute("login");
        session.removeAttribute("login");
        return "redirect:/prelogin.htm";
    }

    @RequestMapping("/imagefrontend")
    public String ImageFrontend(Model model) {
        model.addAttribute("image", new Image());
        return "Insertimage";
    }

    @RequestMapping("/imageoutsanding")
    public String imageoutsanding(Model model) {
        model.addAttribute("image", new Sanphamnoibat());
        List<SanPhamChiTiet> spct = new DAO().SPCT();
        model.addAttribute("spct", spct);
        return "imageoutsanding";
    }



    @RequestMapping("/list")
    public String index(Model model, Integer offset, Integer maxResult) {


        List<SanPhamChiTiet> apple = new DAO().getAllSPCT(offset, maxResult);
        List<SanPhamChiTiet> xiaomi = new DAO().getallxiaomiproduct(offset, maxResult);

        List<SanPhamChiTiet> result = new ArrayList<SanPhamChiTiet>();
        List<SanPham> allsanpham = new DAO().getallsanpham();
//        for (SanPham allsanpham1 : allsanpham) {
//            SanPhamChiTiet spctBymaSP = new DAO().getSPCTBymaSP(allsanpham1.getMaSP());
//            result.add(spctBymaSP);
//        }
        List<Image> allimage = new DAO().getallimage();
        List<SanPhamChiTiet> samsung = new DAO().getallsamsungproduct(offset, maxResult);
        
            model.addAttribute("xiaomi", xiaomi);
            model.addAttribute("samsung", samsung);
        
            model.addAttribute("apple", apple);
        
       
            model.addAttribute("allimage", allimage);
        

        long totalSPCTRecord = new DAO().getTotalSPCTRecord();
        long allxiaomiproductsize = new DAO().getallxiaomiproductsize();
        model.addAttribute("total1", totalSPCTRecord);
        model.addAttribute("offset1", offset);

        model.addAttribute("total", allxiaomiproductsize);
        model.addAttribute("offset", offset);
        List<Sanphamnoibat> SPNB = new DAO().SPNB();
        if (SPNB.size() == 4) {
            model.addAttribute("SPNB1", SPNB.get(0));
            model.addAttribute("SPNB2", SPNB.get(1));
            model.addAttribute("SPNB3", SPNB.get(2));
            model.addAttribute("SPNB4", SPNB.get(3));
        }
        return "home";
    }

    @RequestMapping("/viewgiohang")
    public String viewgiohang(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Giohang> list = (List<Giohang>) session.getAttribute("list");
//        model.addAttribute("dathang", new DatHang());
        model.addAttribute("list", list);
        return "giohang1";
    }
   

    @RequestMapping("/dathang")
    public String Dathang(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Giohang> list = (List<Giohang>) session.getAttribute("list");
        Account account = (Account) session.getAttribute("login");
        if (account != null) {
            DatHang dathang = new DatHang();
            dathang.setHoTen(account.getHoTen());
            dathang.setEmail(account.getEmail());
            dathang.setSdt(account.getSdt());
            dathang.setDiachigiaohang(account.getQueQuan());
            model.addAttribute("dathang", dathang);
        } else {
            model.addAttribute("dathang", new DatHang());
        }

        model.addAttribute("list", list);
        return "dathang";
    }
    @RequestMapping("/xulydieuhuong")
    public String xulyhinhanh(@RequestParam("mausac")Integer mausac , @RequestParam("makichthuoc")Integer makichthuoc ,@RequestParam("maspct1")Integer maspct,Model model){
        SanPhamChiTiet spctById = new DAO().getSPCTById(maspct);    
        SanPhamChiTiet spctbymausacvakichthuoc = new DAO().getspctbymausacvakichthuoc(spctById.getMaSP().getMaSP(),makichthuoc,mausac);
      
        List<MauSac> allmausac = new DAO().getallmausac();
        List<KichThuoc> allkichthuoc = new DAO().getallkichthuoc();
        
      
        List<CommentSP> selectcomment = new DAO().selectcomment(maspct);
//                List<SanPhamChiTiet> allmausacbySP = new DAO().getallmausacbySP(spct1.getMaSP().getMaSP());
        List<Imageproduct> listImage = new DAO().listImage(spctById.getMaSP().getMaSP());
        model.addAttribute("listcomment", selectcomment);
        model.addAttribute("listimage", listImage);
        model.addAttribute("allmausac", allmausac);
        model.addAttribute("allkichthuoc", allkichthuoc);
//                model.addAttribute("allmausacbySP",allmausacbySP);
        if (spctbymausacvakichthuoc == null) {
            model.addAttribute("c", spctById);
        } else {
            model.addAttribute("c", spctbymausacvakichthuoc);
        }
        return "detail5"; 
    }
    @RequestMapping("/ghidonhang")
    public String ghidonhang(@ModelAttribute("dathang") DatHang dathang, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = "";
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//        String datestring = sdf.format(new Date());
        dathang.setNgayDH(new Date());
        boolean insertdathang = new DAO().insertdathang(dathang);
        List<Giohang> list = (List<Giohang>) session.getAttribute("list");
        int chuaxet = 1;
        for (Giohang list1 : list) {
            boolean insertgiohang = new DAO().insertgiohang(list1);
            DatHangChiTiet dathangchitiet = new DatHangChiTiet(dathang, list1);
            boolean b1 = new DAO().inserdonhang(dathangchitiet);
            if (b1) {
                result = result + " " + dathangchitiet.getMaGH().getMaSPCT().getMaSP().getTenSP() + " đặt thành công\n";
            } else {
                result = result + " " + dathangchitiet.getMaGH().getMaSPCT().getMaSP().getTenSP() + " đặt thất bại\n";
                chuaxet = 0;
            }
        }
        if (chuaxet == 1) {
            list = new ArrayList<>();
            session.setAttribute("list", list);
            return "redirect:/list.htm";
        } else {
            model.addAttribute("result", result);
            return "dathang";
        }
//        for (DatHangChiTiet list1 : list) {
//            DatHangChiTiet dathangchitiet = new DatHangChiTiet(dathang.getMaDH(), list1.getSanPhamChiTiet().getMaSPCT());
//            dathangchitiet.setGiaBan(list1.getGiaBan());
//            dathangchitiet.setSoLuong(list1.getSoLuong());
//            dathangchitiet.setDatHang(dathang);
//
//            dathangchitiet.setSanPhamChiTiet(list1.getSanPhamChiTiet());
//            
//            boolean b1 = new DAO().inserdonhang(dathangchitiet);
//            if (b1) {
//                result = result + " " + dathangchitiet.getSanPhamChiTiet().getMaSP().getTenSP() + " đặt thành công\n";
//            } else {
//                result = result + " " + dathangchitiet.getSanPhamChiTiet().getMaSP().getTenSP() + " đặt thất bại\n";
//                chuaxet = 0;
//            }
//        }
        
    }

    @RequestMapping("/detail")
    public String detail1(@RequestParam("id") Integer maSPCT, Model model) {
       
        SanPhamChiTiet spctById = new DAO().getSPCTById(maSPCT);
        List<MauSac> allmausac = new DAO().getallmausac();
        List<KichThuoc> allkichthuoc = new DAO().getallkichthuoc();
        
        model.addAttribute("c", spctById);
        List<CommentSP> selectcomment = new DAO().selectcomment(maSPCT);
//                List<SanPhamChiTiet> allmausacbySP = new DAO().getallmausacbySP(spct1.getMaSP().getMaSP());
        List<Imageproduct> listImage = new DAO().listImage(spctById.getMaSP().getMaSP());
        model.addAttribute("listcomment", selectcomment);
        model.addAttribute("listimage", listImage);
        model.addAttribute("allmausac", allmausac);
        model.addAttribute("allkichthuoc", allkichthuoc);
        
//                model.addAttribute("allmausacbySP",allmausacbySP);

        return "detail5";
    }

    @RequestMapping("/searchbyname")
    public String searchbyname(String search, Model model) {
        List<SanPhamChiTiet> searchbyname = new DAO().searchbyname(search);
        model.addAttribute("list", searchbyname);
        return "search";
    }

    @RequestMapping("/products")
    public String searchbyname(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().SPCT();
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/xiaomi")
    public String xiaomi(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(2);
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/iphone")
    public String iphone(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(1);
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/samsung")
    public String samsung(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(3);
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/google")
    public String google(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(4);
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/sony")
    public String sony(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(5);
        model.addAttribute("list", SPCT);
        return "search";
    }

    @RequestMapping("/huawei")
    public String huawei(Model model) {
        List<SanPhamChiTiet> SPCT = new DAO().loaisanpham(6);
        model.addAttribute("list", SPCT);
        return "search";
    }

}
