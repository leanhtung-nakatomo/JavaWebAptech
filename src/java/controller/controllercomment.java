///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import dao.DAO;
//import entity.Account;
//import entity.CommentSP;
//import entity.SanPhamChiTiet;
//import java.util.Date;
//import java.util.List;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.portlet.ModelAndView;
//
///**
// *
// * @author PT-LS
// */
//@Controller
//public class controllercomment {
//    @RequestMapping(method = RequestMethod.POST, value = "/ajax2")
//    public ModelAndView cmt(HttpServletRequest request, HttpServletResponse response,Model model) {
//        String textcmt = request.getParameter("content");
//        String spct = request.getParameter("idpost");
//        HttpSession session = request.getSession();
//        Account account = (Account) session.getAttribute("login");
//        SanPhamChiTiet sanpham = new SanPhamChiTiet();
//        Integer idpost = Integer.parseInt(spct);
//        if (account != null) {
//            List<SanPhamChiTiet> spctlist = new DAO().SPCT();
//            for (SanPhamChiTiet spct1 : spctlist) {
//                if (spct1.getMaSPCT() == idpost) {
//                    sanpham = spct1;
//                }
//            }
//            int sizelistcomment = new DAO().sizelistcomment(idpost);
//            CommentSP newcmt = new CommentSP();
//            newcmt.setMaSPCT(sanpham);
//            newcmt.setTenDN(account);
//            newcmt.setContent(textcmt);
//            newcmt.setTimecomment(new Date());
//            newcmt.setStatuscomment(sizelistcomment + 1);
//            newcmt.setStatusreply(0);
//            boolean addcomment = new dao.DAO().addcomment(newcmt);
//            if (addcomment) {
//                List<CommentSP> selectcomment = new DAO().selectcomment(idpost);
//                model.addAttribute("listcomment", selectcomment);
//                return new ModelAndView("index");
//            }
//        } else {       
//            List<CommentSP> selectcomment = new DAO().selectcomment(idpost);
//            model.addAttribute("listcomment", selectcomment);
//            return new ModelAndView("index");
//        }
//        return null;
//    }
//}
