package cl.uchile.dcc.citricliquid.controller.states.battle;

import cl.uchile.dcc.citricliquid.controller.observers.battle.BattleController;

public class DecisionState extends State{
    public DecisionState(BattleController context) {
        super(context);
        context.promptMakeDecision();
    }
}
