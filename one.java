import java.util.*;

public class one {
    public static String longestCommonPrefix(String[] strs){
        StringBuilder result=new StringBuilder();

        //sort the array
        Arrays.sort(strs);

        //get the first and last string
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        //start compiling
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);

            
        }
        return result.toString();
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // Prompt the user to enter the number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Prompt the user to enter the strings
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }

        // Call the longestCommonPrefix method with user input
        String prefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + prefix);

        sc.close(); // Close the scanner
    }
}
