package strictfpKeyword;

public class FirstProgram {

    public strictfp double difference()// strictfp aaplled on method
    {
        double firstNumber = 11e+3;

        double secondNumber = 2e+5;

        return firstNumber - secondNumber;

    }

    public static strictfp void main(String[] args) {
        FirstProgram main = new FirstProgram();

        System.out.println(main.difference());
    }

}
