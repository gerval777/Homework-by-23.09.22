public class Main {
        // Задача 6
            public static void main(String[] args) {

                var firstBoxer = 78.2;
                var secondBoxer = 82.7;
                var weightTwoBoxers = firstBoxer + secondBoxer;
                System.out.println ("Вес двух боксеров " + weightTwoBoxers + " кг");
                var weightDifference = secondBoxer - firstBoxer;
                System.out.println ("Разница в весе " + weightDifference + " кг");

                var subtractionMethod = secondBoxer - firstBoxer;
                System.out.println ("1. Метод вычитания: Разница в весе: " + subtractionMethod + " кг");
                var divisionRemainderFunction = weightTwoBoxers % weightTwoBoxers;
                System.out.println ("2. Метод остатка от деления: Разница в весе: " + weightDifference + " кг");
    }
}