package com.balmes.repository;

import com.balmes.model.Estudiant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class estudiantRepository implements crudRepository{

    List<Estudiant> estudiants = new ArrayList<>();

    @Override
    public List findAll() {
        return null;
    }


    public estudiantRepository() {
        Estudiant estudiant1 = new Estudiant(1, "Joan", "Balmes", 1);
        Estudiant estudiant2 = new Estudiant(2, "Pere", "Balmes", 1);
        Estudiant estudiant3 = new Estudiant(3, "Joan", "Balmes", 2);
        Estudiant estudiant4 = new Estudiant(4, "Pere", "Balmes", 2);
        Estudiant estudiant5 = new Estudiant(5, "Xavier", "Balmes", 2);

        estudiants.add(estudiant1);
        estudiants.add(estudiant2);
        estudiants.add(estudiant3);
        estudiants.add(estudiant4);
        estudiants.add(estudiant5);
    }

    public List getEstudiantPerCurs(int cursId){




        List<Estudiant> estudiantsPerCurs = new ArrayList<>();
        for (Estudiant estudiant: estudiants) {
            if (estudiant.getEstudiantCursId() == cursId){
                estudiantsPerCurs.add(estudiant);
            }
        }

        return estudiantsPerCurs;

    }
}
