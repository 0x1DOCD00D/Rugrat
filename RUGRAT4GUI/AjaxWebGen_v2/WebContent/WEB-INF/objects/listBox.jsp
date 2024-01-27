<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
	String elementStr = request.getParameter("elements");
	
	ServletContext context = request.getSession().getServletContext();
	String appName = context.getServletContextName();

	List<String> elements = new ArrayList<String>();
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(
				new FileReader(
						new File( context.getRealPath("") + "\\WEB-INF\\listArgs.txt")));
		String line = null;
		while ((line = reader.readLine()) != null) {
			elements.add(line.trim());
		}
	} catch (IOException e) {
		System.out
				.println("Could not read listArgs.txt file");
		System.out.println(e);
	} finally {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	int num = (int) (new Random().nextInt(elements.size())) + 1;
	System.out.println("num" + num);
	List<String> selected = new ArrayList<String>();
	Random r = new Random();
	for(int i = 0; i< num ;i++) {
		int j = r.nextInt(elements.size());
		selected.add(elements.remove(j));	
	}
%>
<body>
	<div id=<%=xxxx%> class="content" 
		style="width:<%=width%>;height:<%=height%>;margin:<%=margin%>;border:<%=border%>;padding:<%=padding%>;overflow-x: hidden; overflow-y: hidden;">
		List box with randomly selected elements<br>
		<ria:list id="listopp"
            list="<%=selected%>"
            canResize="false"
            beanClass="java.lang.String"
            itemPerPage="25">
      </ria:list>
	</div>
</body>
</html>