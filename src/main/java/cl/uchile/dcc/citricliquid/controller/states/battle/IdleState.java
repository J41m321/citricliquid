package cl.uchile.dcc.citricliquid.controller.states.battle;

import cl.uchile.dcc.citricliquid.controller.Controller;
import cl.uchile.dcc.citricliquid.controller.observers.battle.BattleController;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;

public class IdleState extends State {
    public IdleState(BattleController context) {
        super(context);
    }

    public void toAttackingState() throws InvalidStateOperationException {
        context.setState(new AttackingState(context));
    }
}