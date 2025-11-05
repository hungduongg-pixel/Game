class Teacher extends Person {
    private String id;
    private String title;

    public Teacher(String id, String fullName, String email, String title) {
        super(fullName, email);
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + title + " " + fullName + " [ID: " + id + ", Email: " + email + "]";
    }
}
