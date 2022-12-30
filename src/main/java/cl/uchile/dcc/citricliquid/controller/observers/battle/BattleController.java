package cl.uchile.dcc.citricliquid.controller.observers.battle;


import cl.uchile.dcc.citricliquid.InputManager;
import cl.uchile.dcc.citricliquid.controller.Controller;
import cl.uchile.dcc.citricliquid.controller.InputHandler;
import cl.uchile.dcc.citricliquid.controller.states.battle.IdleState;
import cl.uchile.dcc.citricliquid.controller.states.battle.State;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;

import java.util.Scanner;

/**
 * The battle controller.
 * This class is responsible for the battle logic.
 */

public class BattleController {
    private State state = new IdleState(this);
    private InputHandler inputHandler = new InputHandler(this);
    private InputManager inputManager = new InputManager();
    private int selectedDecision;

    public BattleController() {
        inputManager.addInputPromptListener(inputHandler);
    }

    public static void main(String[] args) throws InvalidStateOperationException {
        BattleController controller = new BattleController();
        controller.startBattle();
    }

    public void startBattle() throws InvalidStateOperationException {
        state.toAttackingState();
        inputManager.promptForInput();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void promptMakeDecision() {
        System.out.println("Select a decision");
        Scanner scanner = new Scanner(System.in);
        selectedDecision = scanner.nextInt();
        inputManager.processInput();
    }
}
