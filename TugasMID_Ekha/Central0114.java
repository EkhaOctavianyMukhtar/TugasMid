interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0114 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0114 obj = new Central0114();
        System.out.println("main");
        obj.aaa();
    }
}
