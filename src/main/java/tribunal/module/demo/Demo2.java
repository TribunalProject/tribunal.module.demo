package tribunal.module.demo;

import tribunal.core.Verdict;

public class Demo2 implements Verdict {

    public void init(){
        System.out.println(this.getClass().getName() + " - Demo2 verdict init.");
    }

    public Object call(Object[] args){
        System.out.println(this.getClass().getName() + " - Demo2 verdict call.");
        for(Object arg: args) {
            System.out.println(this.getClass().getName() + " - " + arg);
        }
        return null;
    }

}
