package cl.uchile.dcc.citricliquid.controller.states.battle;

import cl.uchile.dcc.citricliquid.controller.Controller;
import cl.uchile.dcc.citricliquid.controller.observers.battle.BattleController;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;

public class State {
    protected final BattleController context;

    public State(BattleController context){
        this.context = context;
    }

    public void toAttackingState() throws InvalidStateOperationException {
        throw new InvalidStateOperationException();
    }

    public void toCheckKOState() throws InvalidStateOperationException{
        throw new InvalidStateOperationException();
    }

    public void toDefendState() throws InvalidStateOperationException{
        throw new InvalidStateOperationException();
    }

    public void toDesicionState() throws InvalidStateOperationException {
        throw new InvalidStateOperationException();
    }

    public void toEndState() throws InvalidStateOperationException{
        throw new InvalidStateOperationException();
    }

    public void toEvationState() throws InvalidStateOperationException{
        throw new InvalidStateOperationException();
    }

    public void toIdleState() throws InvalidStateOperationException {
        throw new InvalidStateOperationException();
    }

    public void runAction() throws InvalidStateOperationException {
    }

}
