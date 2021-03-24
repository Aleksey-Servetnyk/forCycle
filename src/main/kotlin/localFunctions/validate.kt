package localFunctions

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can`t save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}