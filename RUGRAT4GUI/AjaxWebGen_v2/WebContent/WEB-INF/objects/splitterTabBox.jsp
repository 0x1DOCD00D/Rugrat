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
		Multi-level split tab box
		<ria:spliterlayout style="width: <%=width%>; overflow-x: hidden; overflow-y: hidden; height: <%=height%>; ">
			<ria:slcolumn width="43%">
				<ria:slCell height="18%" style="background-color:#FFD24D">Top left cell</ria:slCell>
				<ria:slCell height="19%" style="background-color:#C6B3FF">Middle left cell</ria:slCell>
				<ria:slCell height="59%" style="background-color:#FFAA88">Bottom left cell</ria:slCell>
			</ria:slcolumn>
			<ria:slcolumn style="background-color:#CCDAFF" width="29%">Middle column</ria:slcolumn>
			<ria:slcolumn style="background-color:#88AAFF" width="24%">Right column</ria:slcolumn>
		</ria:spliterlayout>
	</div>
</body>
</html>