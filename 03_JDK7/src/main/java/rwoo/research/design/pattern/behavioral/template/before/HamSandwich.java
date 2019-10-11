package rwoo.research.design.pattern.behavioral.template.before;

import java.util.LinkedHashMap;
import java.util.Map;

public class HamSandwich {
    private Map<String, Boolean> hamSandwich;

    public HamSandwich() {
        hamSandwich = new LinkedHashMap<>(5);
        hamSandwich.put("bottom white bread", false);
        hamSandwich.put("lettuce", false);
        hamSandwich.put("ham", false);
        hamSandwich.put("top white bread", false);
    }

    public void cook() {
        hamSandwich.put("bottom white bread", true);
        hamSandwich.put("lettuce", true);
        hamSandwich.put("ham", true);
        hamSandwich.put("top white bread", true);
    }

    public void printStatus() {
        for (String key: hamSandwich.keySet()) {
            System.out.println(key + "\t=\t" + hamSandwich.get(key));
        }
    }

    public Boolean getStatus(String stage) {
        return hamSandwich.get(stage);
    }
}
