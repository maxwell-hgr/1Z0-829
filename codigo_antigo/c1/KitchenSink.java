public class KitchenSink{
    private int numForks;
    public static void main(String[] args) {
        int numKnives = 0;
        System.out.print("""
            "# forks = " + numForks + 
            " # knives = " + numKnives + 
            # cups = 0"""
        );
    }
}
