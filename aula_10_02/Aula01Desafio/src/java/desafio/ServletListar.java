package desafio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listar")
public class ServletListar extends HttpServlet
{

    @Override
    protected void service(HttpServletRequest requisicao, 
            HttpServletResponse resposta) throws IOException
    {
        resposta.setContentType("text/html;charset=UTF-8");
        try (PrintWriter saida = resposta.getWriter())
        {
            saida.println("<html>");
            saida.println("<body>");
            saida.println("<h1>Qtde: " + SingletonContador.getInstance().getQtde() + "</h1>");
            saida.println("<a href=\"http://localhost:8080/desafio/adicionar\">Adicionar</a>");
            saida.println("</body>");
            saida.println("</html>");
        }
    }
}
