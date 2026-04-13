package behavior.command.h2;

import java.util.Stack;

public class CasioCalculator {
    private CommandHandler hanler = new CommandHandler();
    private Stack<ICommand> undos = new Stack<>();
    private Stack<ICommand> redos = new Stack<>();

    public void compute(char operator, float operand){
        CalculatorCommand command = new CalculatorCommand(operator, operand, hanler);

        command.execute();
        undos.push(command);
        redos.clear();
    }

    public void undo(){
        if (!undos.isEmpty()){
            ICommand command = undos.pop();
            command.unexecute();
            redos.push(command);
        }
    }

    public void redo(){
        if (!redos.isEmpty()){
            ICommand command = redos.pop();
            command.execute();
            undos.push(command);
        }
    }

    public void clear(){
        undos.clear();
        redos.clear();
    }

    public CommandHandler getHanler() {
        return hanler;
    }
}
