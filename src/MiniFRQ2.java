public class MiniFRQ2 {
    public static void main(String[] args) {
        MiniFRQ2 frq = new MiniFRQ2();
        System.out.println(frq.longestStreak("CCAAAAATTT!"));  //should print: A 5
        System.out.println(frq.longestStreak("CCCCAAATTT!"));  //should print: C 4
        System.out.println(frq.longestStreak("CCCAATTT!"));    //should print: C 3
        System.out.println(frq.longestStreak("CCCCAATTTTTT!"));//should print: T 6
        System.out.println(frq.longestStreak("cbbaaabbmgg"));  //should print: a 3
        System.out.println(frq.longestStreak("cbbaaabbggg"));  //should print: a 3

    }
    public String longestStreak(String str) {
        int temp = -0;
        String letter = "";
        int highestStreak = -0;
        String highestLetter = "";
        for (int i = 0; i < str.length(); i++){
            if (letter.equals(String.valueOf(str.charAt(i)))){
                temp++;
            } else {
                if (temp > highestStreak){
                    highestStreak = temp;
                    highestLetter = letter;
                }
                letter = String.valueOf(str.charAt(i));
                temp = 1;
            }
        }
        return (highestLetter + " " + highestStreak);
    }
}
