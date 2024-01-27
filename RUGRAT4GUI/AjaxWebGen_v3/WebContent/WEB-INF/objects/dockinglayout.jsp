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
	<div id=<%=xxxx%> class="content" style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;overflow-x: hidden; overflow-y: hidden;">
		<ria:dockinglayout>
			<ria:dockingcolumn width="35%" styleClass="blue">
				<ria:newwindow id="window1" title="Docking column" message="Docking column"
					maximize="false" minimize="false"></ria:newwindow>
			</ria:dockingcolumn>
			<ria:dockingcolumn width="55%" styleClass="red">
				<ria:newwindow id="window3" title="Custom docking layout content" maximize="false"
					minimize="false">Hello World !!</ria:newwindow>
			</ria:dockingcolumn>
			<ria:dockingcolumn width="10%" styleClass="yellow">Empty column</ria:dockingcolumn>
		</ria:dockinglayout>
	</div>
</body>
</html>