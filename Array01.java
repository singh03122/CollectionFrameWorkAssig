public class Array01 {
    public static void main(String[] args) {
        // NORMAL REVERSING OF ANY STRING
        // LIKE = ROHIT = TIHOR
        // String str1 = "ROHIT";
        // String str2 = " ";
        // for (int i = str1.length() - 1; i >= 0; i--) {
        // str2 += str1.charAt(i);
        // }
        // System.out.println("Before Reverse " + str1);
        // System.out.println("After Reverse " + str2);
        // }

        // PRO REVERSING OF ANY STRING
        // LIKE = ROHIT SINGHANIYA = SINGHANIYA ROHIT

        String str1 = "Rohit Singhaniya";
        String str2 = " ";
        String sarr[] = str1.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            str2 += sarr[i] + " ";
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}
