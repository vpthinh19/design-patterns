package behavior.command.h2;

public class CalculatorCommand implements ICommand{
    private char operator;
    private float operand;
    private CommandHandler handler;

    public CalculatorCommand(char operator, float operand, CommandHandler handler) {
        this.operator = operator;
        this.operand = operand;
        this.handler = handler;
    }

    private char unOperator(){
        switch (operator){
            case '+': return '-';
            case '-': return '+';
            case '*': return '/';
            case '/': return '*';
            default: throw new IllegalArgumentException("Operator syntax error");
        }
    }

    @Override
    public void execute() {
        handler.handle(this.operator, this.operand);
    }

    @Override
    public void unexecute() {
        handler.handle(unOperator(), this.operand);
    }
}
