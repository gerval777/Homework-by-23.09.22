public class Main {
        // Задача 7
            public static void main(String[] args) {

                var totalTime =640;
                System.out.println ("Общее время между сотрудниками: " + totalTime + " часов");
                var oneEmployee = 8;
                System.out.println ("Время работы каждого сотрудника составляет " + oneEmployee + " часов");
                var totalEmployees = totalTime / oneEmployee;
                System.out.println ("Всего работников в компании " + totalEmployees + " человек");

                var newEmployees = 94;
                System.out.println ("При увеличении штата сотрудников на " + newEmployees + " человека, получается, что:");
                var companyIncrease = totalEmployees + newEmployees;
                System.out.println ("Общее количество нового штата сотрудников составит " + companyIncrease + " человек(а), что в свою очередь означает, что:");
                var reallocationHours = companyIncrease * oneEmployee;
                System.out.println ("Если в компании работает " + companyIncrease + " человек, то всего " + reallocationHours + " часов работы может быть поделено между сотрудниками");
    }
}