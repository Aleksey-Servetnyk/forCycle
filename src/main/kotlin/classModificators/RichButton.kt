package classModificators

import interfaces.Clickable

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}
    final override fun click() {
        TODO("Not yet implemented")
    }
}