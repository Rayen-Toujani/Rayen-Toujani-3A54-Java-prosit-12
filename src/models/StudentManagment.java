package models;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentManagment implements Managment<Etudiant> {

    public   void displayStudents(List<Etudiant> etudiants,
                                  Consumer<Etudiant> con){
        for (Etudiant etudiant : etudiants) {
            con.accept(etudiant);


    }
    }


    public  void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con){

        for (Etudiant etudiant : etudiants) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }


    }


    public     String returnStudentsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun){

        StringBuilder noms = new StringBuilder();
        for (Etudiant etudiant : etudiants) {
            noms.append(fun.apply(etudiant)).append(", ");
        }
        return noms.toString();



    }



}
