<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="ria" uri="http://sweetdev-ria.ideotechnologies.com"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ideo.sweetdevria.taglib.alert.AlertTag"%>
<%@ page import="com.ideo.sweetdevria.taglib.frame.FrameTag"%>
<html>
<body>
	<div id="footer">
		<%
			String[] pageLinks = request.getParameter("pageLinks").split(";");
			if (pageLinks.length > 0 && !pageLinks[0].trim().isEmpty()) {
		%>
		<label> Linked pages: </label>
		<div>
			<%
				for (int i = 0; i < pageLinks.length; i++) {
						String pageLink = pageLinks[i];
						if (!pageLink.trim().isEmpty()) {
			%>
			
				<button id=<%=pageLink%> class="pgLinkButton" onClick="NextPage(<%=pageLink%>)">
					Page
					<%=pageLink%>
				</button>

			<%
					} // end if
				} // end for
			%>
		</div>
		<%
			} //end if
		%>
		
		<div>
		<button id="previous" class="pgLinkButton" onClick="javascript: history.go(-1)">Previous Page</button>
		</div>
	</div>
</body>
</html>