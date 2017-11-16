package au.com.westpac.inf.bnkng.parties.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("1. Information API to retrieve customer details based on the given customer. 2. Information API to retrieve customer relationships based on the given customer. 3.  Information API to search existing customers based on the search criteria's. Searches for the customer across all brands. Individual and Organization customer types will be supported. API will return number of customers in the response based up on a fuzzy match. 4. Information API to load the customer profile")
      .termsOfService("")
      .contact(new Contact()
        .email(""))
      .license(new License()
        .name("")
        .url(""));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
