package org.stepic.java.Lesson2_3;

/* Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка,
которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности"
строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов
 должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII
 (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.*/
public class CheckingPalindrome {
    public static boolean isPalindrome(String text) {
        String lowerText = text.toLowerCase();
        System.out.println(lowerText);
        String lowerTextWithoutSpacesAndOtherSymbols = lowerText.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(lowerTextWithoutSpacesAndOtherSymbols);
        String reverseBySybols = lowerTextWithoutSpacesAndOtherSymbols;
        String temp = "";
        int lenghtText = lowerTextWithoutSpacesAndOtherSymbols.length();
        System.out.println(lenghtText);
        for (int i=lenghtText-1; i>=0; i--) {
           temp = temp + reverseBySybols.charAt(i);
                }
        System.out.println(temp);
        if (lowerTextWithoutSpacesAndOtherSymbols.equals(temp))
        return true;
        else return false; // your implementation here
    }

    public static void main(String[] args) {
        //String text = "P1 2 3 45678;9!";
        String text = "Madam, I'm Adam!";
        boolean x = isPalindrome(text);
        System.out.println(x);
    }
}
