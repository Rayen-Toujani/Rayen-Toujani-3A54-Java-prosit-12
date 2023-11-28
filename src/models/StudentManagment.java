package models;

import java.util.List;
import java.util.function.Consumer;

public class StudentManagment implements Managment<Etudiant> {

    public   void displayStudents(List<Etudiant> etudiants,
                                  Consumer<Etudiant> con){
        for (Etudiant etudiant : etudiants) {
            con.accept(etudiant);


    }
    }




}
