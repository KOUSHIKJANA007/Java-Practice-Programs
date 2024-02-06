
package com.example.prectice94;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student{" + "name=" + name + ", grade=" + grade + '}';
        }
        
        
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        pq.offer(new Student("Syam",'C'));
        pq.offer(new Student("koushik",'A'));
        pq.offer(new Student("sandy",'E'));
        pq.offer(new Student("Ram",'B'));
        pq.offer(new Student("Rana",'D'));
        System.out.printf("Queue is: %s",pq);
    }
}
