class Student extends Person {
    private String id;

    public Student(String id, String fullName, String email) {
        super(fullName, email);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student: " + fullName + " [ID: " + id + ", Email: " + email + "]";
    }
}
