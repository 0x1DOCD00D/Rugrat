<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="ria" uri="http://sweetdev-ria.ideotechnologies.com"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ideo.sweetdevria.taglib.alert.AlertTag"%>
<%@ page import="com.ideo.sweetdevria.taglib.frame.FrameTag"%>
<html>
<%
	String width = request.getParameter("width");
	String height = request.getParameter("height");
	String margin = request.getParameter("margin");
	String border = request.getParameter("border");
	String padding = request.getParameter("padding");
	String xxxx = request.getParameter("xxxx");
%>
<body>
	<div id=<%=xxxx%> class="content" 
		style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;overflow-x: hidden; overflow-y: hidden;">
		List Box
		<ria:list id="listope"
            list="${products}"
            format="formatData"
            canResize="false"
            beanClass="com.bnpparibas.sweetRef.commons.bean.Product"
            itemPerPage="4">
        Artist Name : <input type="text" name="artistName"/><br/>
        Genre Name : <input type="text" name="genreName"/><br/>
        Price : <input type="text" name="price"/><br/>
      </ria:list>
	</div>
</body>
</html>