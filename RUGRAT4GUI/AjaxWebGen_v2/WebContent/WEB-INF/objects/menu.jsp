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
		<ria:menu id="menusimple">
			<ria:menuitem id="menu1" label="Menuitem 1">
				<ria:menuitem id="disa1" label="SubMenuitem 1" disabled="true"
					onclick="alert('impossible');" />
				<ria:menuitem id="submenu2" label="Enable SubMenuitem 1"
					checkbox="true"
					oncheck="SweetDevRia.$('disa1').setDisabled(false);"
					onuncheck="SweetDevRia.$('disa1').setDisabled(true);" />
				<ria:menuitem id="submenu3" label="SubMenuitem 3">
					<ria:menuitem id="ssubmenu1" label="SubSubMenuitem 1" />
					<ria:menuitem id="ssubmenu2" label="SubSubMenuitem 2" />
				</ria:menuitem>
				<ria:menuitem id="submenu4" label="SubMenuitem 4" />
				<ria:menuitem id="submenu5" label="SubMenuitem 5" />
				<ria:menuitem id="submenu6" label="SubMenuitem 6">
					<ria:menuitem id="ssubmenu3" label="SubSubMenuitem 3" />
				</ria:menuitem>
				<ria:menuitem id="submenu7" label="SubMenuitem 7" />
				<ria:menuitem id="submenu8" onclick="alert('SubMenuitem 8');"
					label="Send Alert" />
			</ria:menuitem>
			<ria:menuitem id="menu2" onclick="alert('Menuitem 2')"
				label="Send Alert" />
			<ria:menuitem id="menu3" label="Disabled Menuitem 3" disabled="true" />
			<ria:menuitem id="menu4" label="Checkable Menuitem 4" checkbox="true"
				checked="true" />
			<ria:menuitem id="menu5" label="Menuitem 10" />
			<ria:menuitem id="menu6" label="Menuitem 25"
				image="./images/icon.jpg" />
		</ria:menu>
	</div>
</body>
</html>