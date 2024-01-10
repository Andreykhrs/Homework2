public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
    var dog = 8.0;
        System.out.println(dog);
    var cat = 3.6;
        System.out.println(cat);
    var paper = 763789;
        System.out.println(paper);

    System.out.println();
        System.out.println("Задача 2");

    dog = dog + 4;
        System.out.println(dog);
    cat = cat + 4;
        System.out.println(cat);
    paper = paper + 4;
        System.out.println(paper);

    System.out.println();
        System.out.println("Задача 3");

    dog = dog - 3.5;
        System.out.println(dog);
    cat = cat - 1.6;
        System.out.println(cat);
    paper = paper - 7639;
        System.out.println(paper);

        System.out.println();
        System.out.println("Задача 4");

    var friends = 19;
        System.out.println(friends);
    friends = friends + 2;
        System.out.println(friends);
    friends = friends / 7;
        System.out.println(friends);

        System.out.println();
        System.out.println("Задача 5");
    var frog = 3.5;
        System.out.println(frog);
    frog = frog * 10;
        System.out.println(frog);
    frog = frog / 3.5;
        System.out.println(frog);
    frog = frog + 4;
        System.out.println(frog);

        System.out.println();
        System.out.println("Задача 6");
    var weightFirstBoxer = 78.2;
    var weightSecondBoxer = 82.7;
    var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общая масса двух бойцов равна " + totalWeight + " кг.");
    var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между массами бойцов составляет " +differenceWeight + " кг.");

        System.out.println();
        System.out.println("Задача 7");

    differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println(differenceWeight);
    differenceWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println(differenceWeight);

        System.out.println();
        System.out.println("Задача 8");

    var allWorkTime = 640;
    var workTime = 8;
    var numberOfEmployess = allWorkTime / workTime;
        System.out.println("Всего работников в компании - "+ numberOfEmployess + " человек");
   numberOfEmployess = numberOfEmployess + 94;
   allWorkTime = numberOfEmployess * workTime;
        System.out.println("Если в компании работает "+ numberOfEmployess + " человек, то всего " + allWorkTime + " часа работы может быть поделено между сотрудниками.");

        System.out.println();
        System.out.println("Готово!");

    }
}