package tribunal.plugin.demo;

import tribunal.core.Verdict;

public class Demo3 implements Verdict {

    public void init(){
        System.out.println(this.getClass().getName() + " - Demo3 verdict init.");
    }

    public Object call(Object[] args){
        System.out.println(this.getClass().getName() + " - Demo3 verdict call.");
        for(Object arg: args) {
            System.out.println(this.getClass().getName() + " - " + arg);
        }
        return null;
    }
}
