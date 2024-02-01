class Student70 {
    String name;
    int age;

    
    public Student70(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student70 [name=" + name + ", age=" + age + "]";
    }
    public static void main(String[] args) {
        Student70 student=new Student70("koushik",20);
        System.out.println(student);
    }

}