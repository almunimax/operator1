public class Main {
    public static void main(String[] args) {

        //задание 1
        System.out.println("задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще подождать");
        }
        //задание 2
        System.out.println("задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
            if (age >= 18 && age < 24) {
                System.out.println("Человек ходит в университет");
            }
            if (age >24) {
                System.out.println("Человек ходит на работу");
            }
        //задание 3
        System.out.println("задание 3");
           int capacity = 102;
           int seatsCount = 60;
           int otherCount = capacity-seatsCount; // стоячие места

           int seatsUsed = 60;
           int otherUsed = 41;
           if(seatsUsed<seatsCount) {
               System.out.println("Есть еще " +(seatsCount-seatsUsed)+ " сидячих мест");
           }
           if (seatsUsed==seatsCount){
               System.out.println("Сидячих мест нет");
           }
        if(otherUsed<otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
        }
        if (otherCount==otherUsed){
            System.out.println("Стоячих мест нет");}
        }
    }
