package pipeline;

import model.Instruction;
import model.InstructionMemory;
import model.Memory;
import model.ProgramCounter;

public class ID {

    public ID() {
    }

    public Instruction decode(Instruction instruction){
        instruction.decode();
        System.out.print("ID: "+instruction);
        return instruction;
    }
}
