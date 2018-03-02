package inheritance;

class X {
    void do1() {}
    public X(String s1){
        System.out.println(s1 + " from X");
    }
}

class Y extends X {
    void do2() {}
    public Y(String s2){
        super(s2);
        System.out.println(s2 + " from y");
    }
}

class Chrome {
    public static void main(String[] args) {
        Y y = new Y("abc");
    }
}
