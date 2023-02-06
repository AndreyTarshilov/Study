/*Выберете выражения, которые дадут в качестве резултата строку A12:
Выберете все подходящие из списка:
'A'+ "12";
"A" + ('\t' + '\u0003');
"A" + 12;
'A' + '1' + "2".
 */
public class A12 {
    public static void main(String[] args) {
        System.out.println('A'+ "12");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println("A" + 12);
        System.out.println('A' + '1' + "2");
    }
}
