import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxJspServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("index.jsp")
				.forward(req, resp);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String appName = context.getServletContextName();

		System.out.println("full path = " + context.getRealPath(""));
		System.out.println("path = " + getServletContext().getContextPath());

		String pages = request.getParameter("pages");
		int minObjects=1;
		//String minObjects = request.getParameter("minObjects");
		String maxObjects = request.getParameter("maxObjects");
		String pagewidth = request.getParameter("pagewidth");
		String pageheight = request.getParameter("pageheight");
		String bgcolor = request.getParameter("bgcolor");
		bgcolor = bgcolor.trim();
		Generator g = new Generator(context.getRealPath(""),
				Integer.parseInt(pages), Integer.parseInt(pagewidth),
				Integer.parseInt(pageheight),minObjects,
				Integer.parseInt(maxObjects), bgcolor);
		g.generateInitialJsps();
		generateSuccessPage(response, appName);

	}

	private void generateSuccessPage(HttpServletResponse response,
			String appName) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<style type=\"text/css\">");
		out.println(".page_setup");
		out.println("{");
		out.println("margin-left: auto;");
		out.println("margin-right: auto;");
		out.println("max-height: 600px;");
		out.println("max-width: 800px;");
		out.println("height: 600px;");
		out.println("width: 800px;");
		out.println("padding: 10px;");
		out.println("border: 5px solid gray;");
		out.println("background-color: AliceBlue;");
		out.println("}");
		out.println("</style>");
		out.println("<title>Ajax Generator Completed</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"silver\">");
		out.println("<div class=\"page_setup\">");
		out.println("<h4>The Ajax application has been successfully generated </h4>");
		out.println("<a href=\"/" + appName + "/index.jsp\">"
				+ "Click here to go back to input page " + "</a>");
		out.println("<br/>");
		out.println("<a href=\"/" + appName + "/1.jsp\">"
				+ "Click here to go to the first generated page " + "</a>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	public void destroy() {

	}
}
