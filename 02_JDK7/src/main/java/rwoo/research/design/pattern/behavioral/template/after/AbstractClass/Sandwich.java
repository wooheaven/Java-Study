package rwoo.research.design.pattern.behavioral.template.after.AbstractClass;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Sandwich {
    protected Map<String, Boolean> sandwich;
    protected String topping;

    public Sandwich(String topping) {
        this.topping = topping;
        sandwich = new LinkedHashMap<>(5);
        sandwich.put("bottom white bread", false);
        bodyPrepare();
        sandwich.put("top white bread", false);
    }

    public abstract void bodyPrepare();

    public void cook() {
        sandwich.put("bottom white bread", true);
        bodyCook();
        sandwich.put("top white bread", true);
    }

    public abstract void bodyCook();

    public void printStatus() {
        for (String key: sandwich.keySet()) {
            System.out.println(key + "\t=\t" + sandwich.get(key));
        }
    }

    public Boolean getStatus(String stage) {
        return sandwich.get(stage);
    }
}
