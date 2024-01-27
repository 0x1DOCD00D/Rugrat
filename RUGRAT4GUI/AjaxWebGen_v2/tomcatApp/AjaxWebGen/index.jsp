<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.page_setup {
	margin-left: auto;
	margin-right: auto;
	max-height: 600px;
	max-width: 800px;
	height: 600px;
	width: 800px;
	padding: 10px;
	border: 5px solid gray;
	background-color: AliceBlue;
}
</style>
<title>Ajax JSP Application Generator</title>
</head>
<body bgcolor="silver">
	<div class="page_setup">
		<h3> Welcome to the JSP Generator Application </h3>
		<h3>Please enter the below details</h3>
		<form action="ajaxJspServlet" method="post">
			<table>
				<tr>
					<td>Number of pages to be generated:</td>
					<td><input type="text" name="pages"></td>
				</tr>
				<tr>
                    <td>Background color:</td>
                    <td><input type="text" name="bgcolor"></td>
                </tr>
                <tr>
                    <td>Page Width:</td>
                    <td><input type="text" name="pagewidth">
                    <td>Page Height:</td>
                    <td><input type="text" name="pageheight"></td>
                </tr>
                <tr>
					<td>Maximum number of objects to be displayed in each page:
					<td><input type="text" name="maxObjects">
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit">&nbsp; <input
						type="reset">
					</td>
					<td></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>