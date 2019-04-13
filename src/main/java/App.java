import org.apache.log4j.BasicConfigurator;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        BasicConfigurator.configure();


        get("squads", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squads", Squad.all());
            model.put("template", "templates/categories.vtl");
            return new VelocityTemplateEngine().render(
                    new ModelAndView(model, layout)
            );
        });

        get("squads/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("template", "templates/categories_form.vtl");
            return new VelocityTemplateEngine().render(
                    new ModelAndView(model, layout)
            );
        });


    }
}
