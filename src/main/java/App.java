import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App{
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

  get("/",(request, response) ->{
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
  },new VelocityTemplateEngine());

    post("/heroes", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String name = request.queryParams("name");
      String secretIdentity = request.queryParams("secretIdentity");
      String sex = request.queryParams("sex");
      int age = request.queryParams(age);
      String powers = request.queryParams("powers");   
      Hero newHero = new Hero(name, secretIdentity, sex, age, powers);
      request.session().attribute("hero", newHero);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}