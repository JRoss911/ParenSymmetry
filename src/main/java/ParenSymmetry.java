package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ParenSymmetry {


    private Boolean isBalanced(String s) {
        // implement this method
        char openParent = '(';
        int openParentCount = 0;
        char closingParent = ')';
        int closingParentCount = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == openParent)
                openParentCount++;

            else if (charArray[i] == closingParent) {
                closingParentCount++;
            }
            if (openParentCount == closingParentCount && openParentCount > 0) {
                return true;
            } else
                return false;
        }

        public void checkFile (String filename){
            // open file named filename
            try {
                Scanner fileIn = new Scanner(new File("TestStrings0.txt"));
                while (fileIn.hasNext()) {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] file = lineIn.split(" ");
                    int sum = 0;
                    for (int i = 0; i < file.length; i++) {
                        sum += Integer.parseInt(file[i]);
                    }
                    System.out.println(sum);
                    // for each line in the file
                    // read the line
                    // print whether or not the line's parenthesis are balanced
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }
            // CLOSE the file


            public static void main (String[]args){
                ParenSymmetry ps = new ParenSymmetry();

                Boolean b0 = ps.isBalanced("()");
                printResult(b0, true);

                String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
                Boolean falses = true;
                for (String strToTest : falseStrings) {
                    falses = ps.isBalanced(strToTest);
                }
                printResult(falses, false);

                String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
                Boolean trues = false;
                for (String strToTest : trueStrings) {
                    trues = ps.isBalanced(strToTest);
                }
                printResult(trues, true);

            }

            private static void printResult (Boolean b0,boolean b){
                if (b0 == null) {
                    System.out.println("Null Failure");
                    return;
                }
                if (b0 == b) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }
            }
        }
    }
}


