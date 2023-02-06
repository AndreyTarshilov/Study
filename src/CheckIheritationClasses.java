import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;

/*
Выберите условия, необходимые для того, чтобы метод производного класса переопределил метод базового класса.
Это сложный вопрос. Если правильный ответ никак не находится, попробуйте экспериментально проверить все эти условия
на каком-нибудь синтетическом примере. Факт успешного переопределения метода поможет подтвердить аннотация @Override.

Выберите все подходящие ответы из списка:

Метод производного класса должен иметь модификатор доступа, такой же или более открытый, чем метод базового класса.
Метод производного класса должен иметь в точности тот же набор параметров, что и метод базового класса.
Метод производного класса должен иметь в точности тот же тип возвращаемого значения, что и метод базового класса.
Метод производного класса должен иметь в точности тот же модификатор доступа, что и метод базового класса.
Метод базового класса должен быть виден в производном классе.
Метод производного класса должен быть помечен аннотацией @Override.
Тип, возвращаемый методом производного класса, должен совпадать или быть подклассом типа, возвращаемого методом базового класса.
*/
public class CheckIheritationClasses {
    public static class Parents {
        int bloodTypeGrandpaF;
        int bloodTypeGrannyF;
        int bloodTypeGrandpaM;
        int bloodTypeGrannyM;

         int Father(int bloodTypeGrandpaF, int bloodTypeGrannyF) {
            int bloodTypeFather = (bloodTypeGrandpaF + bloodTypeGrannyF) / 2;
            //System.out.println(bloodTypeGrandpaF);
            //System.out.println(bloodTypeGrannyF);
            System.out.println("Группа крови отца: " + bloodTypeFather);
            return bloodTypeFather;
        }
         int Mother(int bloodTypeGrandpaM, int bloodTypeGrannyM) {
            int bloodTypeMother = (bloodTypeGrandpaM + bloodTypeGrannyM) / 2;
            //System.out.println(bloodTypeGrandpaM);
            //System.out.println(bloodTypeGrannyM);
            System.out.println("Группа крови матери: " + bloodTypeMother);
            return bloodTypeMother;
        }
    }
    static class Children extends Parents {
         public int Son(int bloodTypeFather, int bloodTypeMother, String nameSon) {
            int bloodTypeSon = (bloodTypeFather + bloodTypeMother)/2;
            System.out.println("Группа крови сына: " + bloodTypeSon);
            return bloodTypeSon;
        }
         public int Daughter(int bloodTypeFather, int bloodTypeMother, String nameDaughter) {
            int bloodTypeDaughter = (bloodTypeFather + bloodTypeMother)/2;
            System.out.println("Группа крови дочери: " + bloodTypeDaughter);
            return bloodTypeDaughter;
        }
    }

    public static void main(String[] args) {
        Children ch = new Children();
        ch.bloodTypeGrandpaF = 1;
        ch.bloodTypeGrannyF = 3;
        ch.bloodTypeGrandpaM = 2;
        ch.bloodTypeGrannyM = 4;
        System.out.println("Группа крови дедушки по отцу: " + ch.bloodTypeGrandpaF);
        System.out.println("Группа крови бабушки по отцу: " + ch.bloodTypeGrannyF);
        System.out.println("Группа крови дедушки по матери: " + ch.bloodTypeGrandpaM);
        System.out.println("Группа крови бабушки по матери: " + ch.bloodTypeGrannyM);
        ch.Father(ch.bloodTypeGrandpaF, ch.bloodTypeGrannyF);
        ch.Mother(ch.bloodTypeGrandpaM, ch.bloodTypeGrannyM);
        //ch.Son(ch.Father(ch.bloodTypeGrandpaF, ch.bloodTypeGrannyF), ch.Mother(ch.bloodTypeGrandpaM, ch.bloodTypeGrannyM));
        // ch.Daughter();
    }

}






