<%-- 
    Document   : index
    Created on : May 18, 2020, 10:41:18 PM
    Author     : PT-LS
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<c:forEach items="${listcomment2}" var="comment" >
    <div class="card card-inner">
        <div class="card-body">
            <div class="row">
                <div class="col-md-2">
                    <!--<img src="https://image.ibb.co/jw55Ex/def_face.jpg" width="50" height="50" class="img img-rounded img-fluid"/>-->
                    <p class="text-secondary text-center">${comment.timecomment}</p>
                </div>
                <div class="col-md-10">
                    <p><a href="https://maniruzzaman-akash.blogspot.com/p/contact.html"><strong>${comment.tenDN.tenDN}</strong></a></p>
                    <p>${comment.content}</p>

                </div>
            </div>
        </div>
    </div> 
</c:forEach>
