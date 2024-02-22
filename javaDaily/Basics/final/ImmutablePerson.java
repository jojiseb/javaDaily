public final class ImmutablePerson {
    final String name;
    public ImmutablePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Here, No methods to modify the state as the field is immutable, i.e., Object is immutable
}
