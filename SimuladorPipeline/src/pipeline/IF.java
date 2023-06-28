package pipeline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import instructions.*;
import model.Instruction;
import model.InstructionMemory;
import model.ProgramCounter;

public class IF {
    private InstructionMemory instructionMemory;
    private ProgramCounter programCounter;

    public IF() {
        instructionMemory = InstructionMemory.getInstance();
        programCounter = ProgramCounter.getInstance();
    }

    public Instruction fetch(){
            Instruction instruction = instructionMemory.fetchInstruction(programCounter.getPC());
            programCounter.incrementPC();
            System.out.println("IF:\nPC:" + programCounter.getPC());
            System.out.print(instruction);
            return instruction;
    }
}
