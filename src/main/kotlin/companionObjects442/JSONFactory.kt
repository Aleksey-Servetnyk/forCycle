package companionObjects442

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}