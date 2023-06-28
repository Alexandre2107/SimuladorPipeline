package pipeline;

import model.Instruction;

public class EX {
    public Instruction execute(Instruction instruction){
        instruction.execute();
        System.out.print("EX: "+instruction);
        return instruction;
    }
}
