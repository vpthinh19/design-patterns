package behavior.command.h2;

public class CommandHandler {
    private float result = 0.0f;
    public void handle(char operator, float operand){
        switch (operator){
            case '+': result += operand; break;
            case '-': result -= operand; break;
            case '*': result *= operand; break;
            case '/': if (operand != 0) result /= operand; break;
        }
    }

    public float getResult() {
        return result;
    }
}
