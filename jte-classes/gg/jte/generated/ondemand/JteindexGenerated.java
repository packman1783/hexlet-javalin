package gg.jte.generated.ondemand;
import org.example.hexlet.Course;
import org.example.hexlet.CoursePage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,10,10,10,10,11,11,13,13,14,14,16,16,16,16,16,16,16,17,17,17,19,19,20,20,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <title>Hexlet</title>\r\n</head>\r\n<body>\r\n<h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\r\n");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\r\n    <p>Пока не добавлено ни одного курса</p>\r\n");
		} else {
			jteOutput.writeContent("\r\n    ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\r\n        <div>\r\n            <h2><a href=\"/courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</a></h2>\r\n            <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\r\n        </div>\r\n    ");
			}
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
