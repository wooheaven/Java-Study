package rwoo.research.design.pattern.behavioral.template.brutal;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaconSandwich {
    private Map<String, Boolean> baconSandwich;

    public BaconSandwich() {
        baconSandwich = new LinkedHashMap<>(5);
        baconSandwich.put("bottom white bread", false);
        baconSandwich.put("lettuce", false);
        baconSandwich.put("bacon", false);
        baconSandwich.put("tomato", false);
        baconSandwich.put("top white bread", false);
    }

    public void cook() {
        baconSandwich.put("bottom white bread", true);
        baconSandwich.put("lettuce", true);
        baconSandwich.put("bacon", true);
        baconSandwich.put("tomato", true);
        baconSandwich.put("top white bread", true);
    }

    public void printStatus() {
        for (String key: baconSandwich.keySet()) {
            System.out.println(key + "\t=\t" + baconSandwich.get(key));
        }
    }

    public Boolean getStatus(String stage) {
        return baconSandwich.get(stage);
    }
}
