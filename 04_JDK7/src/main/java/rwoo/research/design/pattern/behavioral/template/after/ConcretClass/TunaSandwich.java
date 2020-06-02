package rwoo.research.design.pattern.behavioral.template.after.ConcretClass;

import rwoo.research.design.pattern.behavioral.template.after.AbstractClass.Sandwich;

public class TunaSandwich extends Sandwich{
    public TunaSandwich() {
        super("tuna");
    }


    @Override
    public void bodyPrepare() {
        sandwich.put("lettuce", false);
        sandwich.put("tomato", false);
        sandwich.put(topping, false);
    }

    @Override
    public void bodyCook() {
        sandwich.put("lettuce", true);
        sandwich.put("tomato", true);
        sandwich.put(topping, true);
    }
}
