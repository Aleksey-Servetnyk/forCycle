package classModificators

import interfaces.Focusable

internal open class TalkativeButton : Focusable {
    private fun yell() = println("hey!")
    protected fun whisper() = println("Let`s talk!")
}

/*
fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}*/
