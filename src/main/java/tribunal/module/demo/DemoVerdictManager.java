package tribunal.module.demo;

import tribunal.core.VerdictManager;

public class DemoVerdictManager extends VerdictManager{

    @Override
    public void start() {
        System.out.println(this.getClass().getName() + " - Verdict management start.");
    }
}
