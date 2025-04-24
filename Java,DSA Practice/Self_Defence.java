/* After the phenomenal success of the 36th chamber of shooln son te has decided to start 37th chamber of 
   shaolin. The aim this time is to equip women with shaolin self-defence techniques . The only condition for 
   a women to be eliglibe for special training is that she must be between 10 and 60 years of agel, inclusive
   of both 10 and 60. Given the ages of N women in his village .please help son to find out how many of them 
   are eligible for the special training. */
   
import java.util.ArrayList;
import java.util.Scanner;

class Special_Training {
    int n;

    public Special_Training(int n) {
        this.n = n;
    }

    int getTraining() {
        return n;
    }
}

interface Chamber {
    ArrayList<Integer> training();
}

class Women_eligible extends Special_Training implements Chamber {
    int[] arr;
    ArrayList<Integer> res = new ArrayList<>();

    public Women_eligible(int n) {
        super(n);
        arr = new int[n];
    }

    public ArrayList<Integer> training(Scanner in) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 10 && arr[i] <= 60) {
                count++;
            }
        }
        res.add(count);
        return res;
    }
}

class Self_Defence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of women in the village:");
        int n = in.nextInt();

        Women_eligible w = new Women_eligible(n);
        ArrayList<Integer> rs = w.training(in);

        System.out.println("Given the ages of N women in his village: " + rs);
    }
}



