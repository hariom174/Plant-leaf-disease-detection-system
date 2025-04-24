 /* public class Main {
        // Correct constructor with appropriate parameters
        Main(int first, int second) {
            // Any initialization code goes here
        }
    
        Main print() {
            return this;
        }
    
        public static void main(String... args) {
            Main fi = new Main(1, 2); // Create an instance of Main with correct arguments
        }
    }*/
	public class Main {
    public static void main(String... args) {
        for (final int i = 2; i < 10; i++) {
            if ((i & 1) == 1) {
                System.out.println(i);
            }
        }
    }
}

    

