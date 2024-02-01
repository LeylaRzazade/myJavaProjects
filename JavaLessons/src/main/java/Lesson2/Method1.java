package Lesson2;
/*
Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
 если да – вернуть true, в противном случае – false.
 */
public class Method1 {

    public static boolean checkSum(int a, int b){
        int sum = a+b;
        if(sum<=20 && sum>=10){
            return true;
        }
        else{
            return false;
        }
    }

//    public static void main(String[] args) {
//        System.out.println(checkSum(13,5));
//
//    }
}

