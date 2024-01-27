<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="ria" uri="http://sweetdev-ria.ideotechnologies.com"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ideo.sweetdevria.taglib.alert.AlertTag"%>
<%@ page import="com.ideo.sweetdevria.taglib.frame.FrameTag"%>
<html>
<head>
<%
	String width = request.getParameter("width") + "px";
	String height = request.getParameter("height") + "px";
	String color = request.getParameter("bgColor");
%>
<style type ="text/css">
#wrapper {
	margin-left:auto;
    margin-right:auto;
	padding: 0px;
	max-height: <%=height %>;
	max-width: <%=width %>;
	height: <%=height %>;
	width: <%=width %>;
	background-color: <%=color %>;
	position:relative;
}
#pageSize {
	margin: 0px;
	padding: 0px;
	max-height: <%=height %>;
	max-width: <%=width %>;
	height: <%=height %>;
	width: <%=width %>;
	background-color: <%=color %>;
	position: absolute;
	visibility: hidden;
}
#main_body {
	margin: 0px;
	padding: 0px;
	max-height: <%=height %>;
	max-width: <%=width %>;
	height: <%=height %>;
	width: <%=width %>;
	background-color: <%=color %>;
	position:relative;
	overflow: hidden;	
}
#side {
	height: <%=height %>;
	width: 0px;
	position: absolute;
	visibility: hidden;
}
#footer {
	clear: both;
	max-width: <%=width %>;
	height: 80px;
	width: <%=width %>;
	border: 1px solid gray;
	background-color: <%=color %>;
	position: relative;
}
.content {
	float: left;
	position: relative;
}
.pgLinkButton {
	float: left;
}	
</style>

<script type="text/javascript">
   function NextPage(pgno)  {
	  window.location.href=pgno + ".jsp";
   }
</script>
<ria:resourcesImport />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%
	String currentPageNumber = request.getParameter("currentPage");
%>
<title>Page <%=currentPageNumber%></title>
</head>
</html>
