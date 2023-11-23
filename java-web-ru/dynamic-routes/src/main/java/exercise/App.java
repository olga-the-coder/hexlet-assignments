package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

// BEGIN
import java.util.HashMap;
import io.javalin.http.NotFoundResponse;
// END

public final class App {

    private static final List<Map<String, String>> COMPANIES = Data.getCompanies();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/companies/{id}", ctx -> {
            var id = ctx.pathParam("id");
            Map<String, String> copmanieResult = new HashMap<>();
            boolean flag = false;
            for (Map<String, String> companie: COMPANIES) {
                for (Map.Entry<String, String> entry : companie.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key.equals("id") && value.equals(id)) {
                        copmanieResult = companie;
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                ctx.json(copmanieResult);
            } else {
                throw new NotFoundResponse("Company not found");
            }
        });
        // END

        app.get("/companies", ctx -> {
            ctx.json(COMPANIES);
        });

        app.get("/", ctx -> {
            ctx.result("open something like (you can change id): /companies/5");
        });

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
