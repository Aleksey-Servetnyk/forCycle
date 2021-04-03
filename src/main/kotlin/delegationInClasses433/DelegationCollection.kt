package delegationInClasses433

class DelegationCollection<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList {}