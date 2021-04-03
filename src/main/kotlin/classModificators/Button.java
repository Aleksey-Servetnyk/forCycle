package classModificators;

import classModificators.interfaces.State;

public class Button implements State.View {
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }

    public class ButtonState implements State{}
}
