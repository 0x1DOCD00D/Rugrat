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
	<div id=<%=xxxx%> class="content" style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;">
	 <ria:accordion width="100%">
		<ria:accordionItem id="accordion_item1" title="First Section"
			contentStyleClass="ideo-acc-mycontent"> First accordian section </ria:accordionItem>
		<ria:accordionItem id="accordion_item2" title="Second Section"
			contentStyleClass="ideo-acc-mycontent">Second accordian section </ria:accordionItem>
		<ria:accordionItem id="accordion_item3" title="Last	Section"
			openAtStartup="true" contentStyleClass="ideo-acc-mycontent">Last accordian section, opened at startup </ria:accordionItem>
	</ria:accordion>
	</div>
</body>
</html>