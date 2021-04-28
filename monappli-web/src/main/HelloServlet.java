import javax.servlet.* ;
import java.io.* ;

public class HelloServlet extends GenericServlet
{
	/**
	* @param request Requête
	* @param response Réponse
	**/
  public void service (HttpServletRequest request, HttpServletResponse response)
  {
    try
    {
      PrintWriter out = response.getWriter() ;
      out.println ("<!DOCTYPE html>") ;
      out.println ("<title>Bonjour tout le monde !</title>") ;
      out.println ("<p>Hello world!</p>") ;
    }
    catch (IOException e)
    {
      e.printStackTrace() ;
    }
  }
}
