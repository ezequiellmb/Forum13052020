package servlet;

import FileParser.FileParser;
import entidade.Aluno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(
        name = "Upload",
        urlPatterns = {"/up"}
)

public class Upload extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileParser fp = new FileParser();
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Up</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("<form action='lista-aluno' method='GET' enctype='multipart/form-data'>");
        out.println("Arquivo: <input type='file' name='arquivo'>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}
