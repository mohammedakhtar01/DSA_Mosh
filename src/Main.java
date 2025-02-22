//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        //numbers.printNumbers();
        //System.out.println("*****************************");
        numbers.insert(40);

        //numbers.printNumbers();
        //System.out.println("*****************************");
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.insert(80);

        numbers.printNumbers();

        //numbers.removeAt(5);
        numbers.printNumbers();

        System.out.println("Index Of =" + numbers.indexOf(0));

    }
}