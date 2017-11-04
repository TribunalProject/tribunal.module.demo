package tribunal.plugin.demo;

import tribunal.core.VerdictManager;

public class DemoPluginManager extends VerdictManager{

    @Override
    public void start() {
        System.out.println(this.getClass().getName() + " - Verdict management start.");
    }
}
