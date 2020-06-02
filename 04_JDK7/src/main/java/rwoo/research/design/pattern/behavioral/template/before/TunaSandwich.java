package rwoo.research.design.pattern.behavioral.template.before;

import java.util.LinkedHashMap;
import java.util.Map;

public class TunaSandwich {
    private Map<String, Boolean> tunaSandwich;

    public TunaSandwich() {
        tunaSandwich = new LinkedHashMap<>(5);
        tunaSandwich.put("bottom white bread", false);
        tunaSandwich.put("lettuce", false);
        tunaSandwich.put("tuna", false);
        tunaSandwich.put("top white bread", false);
    }

    public void cook() {
        tunaSandwich.put("bottom white bread", true);
        tunaSandwich.put("lettuce", true);
        tunaSandwich.put("tuna", true);
        tunaSandwich.put("top white bread", true);
    }

    public void printStatus() {
        for (String key: tunaSandwich.keySet()) {
            System.out.println(key + "\t=\t" + tunaSandwich.get(key));
        }
    }

    public Boolean getStatus(String stage) {
        return tunaSandwich.get(stage);
    }
}
