<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="org.apache.velocity.runtime.directive.Foreach"%>
<%@page import="java.util.Random"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
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
	
	ServletContext context = request.getSession().getServletContext();
	String appName = context.getServletContextName();

	List<String> elements = new ArrayList<String>();
	BufferedReader reader = null;
	int min = 1;
	int max = 3;
	
	try {
		reader = new BufferedReader(
				new FileReader(
						new File( context.getRealPath("") + "\\WEB-INF\\comboArgs.txt")));
		String line = null;
		line = reader.readLine();
		if(line == null) {
			
		} else {
			String[] vals = line.split(";");
			for(String val: vals) {
				String[] v=val.split("=");
				if("min".equalsIgnoreCase(v[0])) {
					min = Integer.parseInt(v[1]);
					break;
				} else if("max".equalsIgnoreCase(v[0])) {
					max = Integer.parseInt(v[1]);
					break;
				} else {
					System.out.println("First line must be in format \"min=x;max=y\" Assuming min=1 and max=3");
					min = 1;
					max = 3;
					break;
				}
			}
		}
		while ((line = reader.readLine()) != null) {
			elements.add(line.trim());
		}
	} catch (IOException e) {
		System.out
				.println("Could not read comboArgs.txt file");
		System.out.println(e);
	} finally {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	int realmax = elements.size() < max? elements.size(): max;
	int num = (int) (new Random().nextInt(realmax-min + 1)) + min;
	System.out.println("num" + num);
	Map<String,String> selected = new HashMap<String,String>();
	Random r = new Random();
	for(int i = 0; i< num ;i++) {
		int j = r.nextInt(elements.size());
		String line = elements.remove(j);
		String[] vals = line.split(",");
		selected.put(vals[0],vals[1]);	
	}
%>
<body>
	<div id=<%=xxxx%> class="content" 
		style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;overflow-x: hidden; overflow-y: hidden;">
		Combo box with randomly selected elements<br>
				
		<SELECT name=combobox>
		<% for(String key:selected.keySet()) { %>
			<OPTION id=<%=key%> value =<%=key%> onclick=javascript:window.open('<%=selected.get(key)%>')><%=key%></OPTION>
		<% } %>
		</SELECT>
		
	</div>
</body>
</html>