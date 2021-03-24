package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Persistence persistence= new DatabasePersistence();
        System.out.println(persistence.persist());
        FilePersistence file= new FilePersistence();
        System.out.println(file.persist());

    }
}
abstract class Persistence{
    abstract String persist();
}
class FilePersistence extends Persistence{

    @Override
    String persist() {
        return "In file Percistence";
    }
}
class DatabasePersistence extends Persistence{

    @Override
    String persist() {
        return "In Database Persistence";
    }
}
