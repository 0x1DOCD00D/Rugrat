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
		<ria:alert id="alert1" type="<%=AlertTag.ERROR%>"
			actionType="<%=AlertTag.CLOSE%>">ERROR ALERT<br />
			<br />
		</ria:alert>
		<ria:alert id="alert2" type="<%=AlertTag.WARN%>"
			actionType="<%=AlertTag.OK%>" modal="true">WARN ALERT<br />
			<br />
		</ria:alert>
		<ria:alert id="alert3" type="<%=AlertTag.INFO%>"
			actionType="<%=AlertTag.OK_CANCEL%>">INFO ALERT<br />
			<br />
		</ria:alert>
		<script type="text/javascript">
			SweetDevRia.$('alert3').onOk = function() {
				alert('ok pressed');
			}
		</script>
		<input type="button" onclick="SweetDevRia.$('alert').show();"
			value="Show ERROR Alert" /> <input type="button"
			onclick="SweetDevRia.$('alert2').show();" value="Show WARN Alert" />
		<input type="button" onclick="SweetDevRia.$('alert3').show();"
			value="Show INFO Alert" />
	</div>
</body>
</html>