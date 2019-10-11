package rwoo.research.design.pattern.behavioral.template.after.ConcretClass;

import rwoo.research.design.pattern.behavioral.template.after.AbstractClass.Sandwich;

public class HamSandwich extends Sandwich {
    public HamSandwich() {
        super("ham");
    }

    @Override
    public void bodyPrepare() {
        sandwich.put("lettuce", false);
        sandwich.put(topping, false);
        sandwich.put("tomato", false);
    }

    @Override
    public void bodyCook() {
        sandwich.put("lettuce", true);
        sandwich.put(topping, true);
        sandwich.put("tomato", true);
    }
}