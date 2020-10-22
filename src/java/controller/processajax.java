/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Account;
import entity.CommentSP;
import entity.Giohang;
import entity.SanPhamChiTiet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author PT-LS
 */
@Controller
public class processajax {

    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    public String process(HttpServletRequest request, HttpServletResponse response) {
        String soluong = request.getParameter("soluong");
        String maSP = request.getParameter("maSP");     
        HttpSession session = request.getSession();
        
        List<Giohang> list = (List<Giohang>) session.getAttribute("list");
        
        Integer id = Integer.parseInt(maSP);
        
        SanPhamChiTiet sanpham = new SanPhamChiTiet();
        List<SanPhamChiTiet> spct = new DAO().SPCT();
        for (SanPhamChiTiet spct1 : spct) {
            if (spct1.getMaSPCT() == id ) {
                 sanpham = spct1;
            }
        }
        if (list == null) {
            list = new ArrayList<>();
            Giohang giohang = new Giohang();
            giohang.setSoluong(1);
            giohang.setMaSPCT(sanpham);      
            list.add(giohang);
            session.setAttribute("list", list);
            
        } else {
            int check = 1;
            for (Giohang list1 : list) {
                if (list1.getMaSPCT().getMaSPCT() == sanpham.getMaSPCT()) {
                    list1.setSoluong(list1.getSoluong()+ 1);
                    check = 0;
                }
            }
            if (check == 1) {
                Giohang giohang = new Giohang();
                giohang.setSoluong(1);
                giohang.setMaSPCT(sanpham);
                list.add(giohang);
                
            }
            session.setAttribute("list", list);
        }
        return "Success";
    } 
    
    
}
