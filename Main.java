public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A", "a@student.com");
        Student s2 = new Student("SV002", "Tran Thi B", "b@student.com");
        Student s3 = new Student("SV003", "Le Van C", "c@student.com");

        Teacher t1 = new Teacher("GV01", "Pham Minh", "pm@school.edu", "Dr.");
        Advisor ad1 = new Advisor("Nguyen Hoang", "hoang@company.com");

        // Tạo các khóa luận
        KLTN<Student, Teacher> kl1 = new KLTN<>(s1, t1, "AI in Education");
        KLTN<Student, Advisor> kl2 = new KLTN<>(s2, ad1, "Blockchain for Logistics");
        KLTN<Student, Teacher> kl3 = new KLTN<>(s3, t1, "Computer Vision for Agriculture");

        ListSortable<KLTN> list = new ListSortable<>();

        list.add(kl1);
        list.add(kl2);
        list.add(kl3);

        System.out.println("=== DANH SÁCH KLTN SAU KHI SẮP XẾP ===");
        list.sort();
        list.print();
    }
}
