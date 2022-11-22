public class MiniFRQ1 {
    public static void main(String[] args) {
        MiniFRQ1 test = new MiniFRQ1();
        System.out.println(); // print a blank line after test case
        test.printNums(7, 3);  // three lines all ending in 7
        System.out.println(); // blank line
        test.printNums(1, 8);  // eight lines all ending in 1
        System.out.println(); // blank line
        test.printNums(9, 10); // ten lines all ending in 9
    }
    public void printNums(int value, int numRounds) {
        int temp = -0;
        String str = "";
        for (int i = 0; i < numRounds; i++){
            while (temp != value){
                temp = (int) (Math.random()*10);
                str += temp;
                if (temp == value){
                    System.out.println(str);
                }
            }
            str = "";
            temp = -0;
        }
    }
}
