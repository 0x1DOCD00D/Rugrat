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
		style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;">
		<script type="text/javascript">
			function autoHide() {
				SweetDevRia.ModalPanel.hideModalPanel();
			}
		</script>
		<input type="button"
			onclick="SweetDevRia.ModalPanel.showModalPanel(1);window.setTimeout('autoHide()',3000);"
			value="Show Modal Panel" /> <br />
		<input type="button"
			onclick="SweetDevRia.ModalPanel.hideModalPanel();"
			value="Hide Modal Panel" />
	</div>
</body>
</html>