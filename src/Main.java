public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //task2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7739;
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var weightDifference = firstBoxer - secondBoxer;
        System.out.println(weightDifference);

        //task7
        totalWeight = secondBoxer - firstBoxer;
        System.out.println(totalWeight);
        var overLoad = secondBoxer % firstBoxer;
        System.out.println("разница в весе у боксеров составляет " + overLoad + " кг!");

        //task8
        var totalHours = 640;
        var workingHours = 8;
        var totalEmployees = totalHours / workingHours;
        System.out.println("Всего работников в компании: " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        var oneEmployee = totalHours / totalEmployees;
        System.out.println(oneEmployee);
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего по " + oneEmployee + " часа работы может быть поделено между сотрудниками");
    }
}