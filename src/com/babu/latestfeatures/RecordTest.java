package com.babu.latestfeatures;

public class RecordTest {
    public static void main(String[] args) {
        PersonRecord record = new PersonRecord("Babu", "Hyderabad");
        PersonRecord record2 = new PersonRecord("Babu", "Hyderabad");
        PersonRecord record3 = new PersonRecord("Miriyala", "Hyderabad");

        System.out.println(record.address());
        System.out.println(record.equals(record2));
        System.out.println(record.equals(record3));
    }
}
