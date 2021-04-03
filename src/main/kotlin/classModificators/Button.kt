package classModificators

import classModificators.interfaces.State

class Button : State.View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState: State {}
}