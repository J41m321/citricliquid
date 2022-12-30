package cl.uchile.dcc.citricliquid.controller.states.battle;

import cl.uchile.dcc.citricliquid.controller.observers.battle.BattleController;
import cl.uchile.dcc.citricliquid.exceptions.InvalidStateOperationException;

public class AttackingState {
    public AttackingState(BattleController context) throws InvalidStateOperationException {
        super(context);
        context.doAttack();
    }
}
