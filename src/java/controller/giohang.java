/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Giohang;
import entity.SanPhamChiTiet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PT-LS
 */
@WebServlet(name = "giohang", urlPatterns = {"/giohang"})
public class giohang extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String idspct = request.getParameter("id");
        Integer id = Integer.parseInt(idspct);
        
        SanPhamChiTiet sanpham = new DAO().getSPCTById(id);
        HttpSession session = request.getSession();
        List<Giohang> list = (List<Giohang>) session.getAttribute("list");
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
        request.getRequestDispatcher("jspclient/giohang1.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
