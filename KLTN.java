class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String thesisTitle;

    public KLTN(T student, V supervisor, String thesisTitle) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() { return thesisTitle; }

    @Override
    public int compareTo(KLTN<T, V> other) {
        // Sắp xếp theo chữ cái đầu tiên của tên khóa luận
        return this.thesisTitle.compareToIgnoreCase(other.thesisTitle);
    }

    @Override
    public String toString() {
        return "KLTN: " + thesisTitle + "\n  " + student + "\n  " + supervisor + "\n";
    }
}
