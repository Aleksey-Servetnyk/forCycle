package singleton441

class PersonNew(val name: String) {
    object NameComparator : Comparator<PersonNew> {
        override fun compare(o1: PersonNew, o2: PersonNew): Int {
            return o1.name.compareTo(o2.name)
        }
    }
    override fun toString(): String = "Person(name=$name)"
}