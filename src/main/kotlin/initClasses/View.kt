package initClasses

import javax.naming.Context
import javax.print.attribute.Attribute

open class View {
    constructor(ctx: Context) {

    }

    constructor(ctx: Context, attr: Attribute) {

    }
}

class MyButton: View {
    constructor(ctx: Context) : super(ctx) {

    }

    constructor(ctx: Context, attr: Attribute) : super(ctx, attr) {

    }

}