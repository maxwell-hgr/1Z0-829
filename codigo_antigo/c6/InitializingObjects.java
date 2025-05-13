class GiraffeFamily {
    static { System.out.print("A"); } // 1
    
    { System.out.print("B"); } // 3 ; 9
    
    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C"); // 5 ; 11
    }
    
    public GiraffeFamily() {
        System.out.print("D");
    }
    
    public GiraffeFamily(int stripes) {
        System.out.print("E"); // 4 ; 10
    }
}

public class InitializingObjects extends GiraffeFamily {
    static { System.out.print("F"); } // 2
    
    { System.out.print("H"); } // 6 ; 12
    
    public InitializingObjects(int stripes) {
        super("sugar");
        System.out.print("G"); // 7 ; 13
    }
    
    public static void main(String[] grass) {
        new InitializingObjects(1);
        System.out.println(); // 8
        new InitializingObjects(2);
    }
}

// A, F, B, E, C, H, G
// B, E, C, H, G