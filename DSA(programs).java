package com.company;

public class Counter {
        private int count;
        public Counter(){}
        public Counter(int initial){
            count= initial;
        }
        public void getCount(){
            System.out.println(count);
        }
        public void increment() {
            count++;
        }
        public void increment(int delta){
            count+=delta;
        }
        public void reset(){
            count=0;
        }
}

public class CounterDemo {
public static void main(String[]args){
        Counter c;
        c= new Counter(2);
        c.increment(5);
        c.increment();
//        c.getCount();
        c.reset();
        c.getCount();
        Counter d= new Counter();
        d.increment(10);
        d.getCount();
        Counter e=d;
        e.increment(2);
        e.getCount();
    }

}
