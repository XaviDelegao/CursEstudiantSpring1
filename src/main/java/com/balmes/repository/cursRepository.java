package com.balmes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.balmes.model.Curs;

@Repository
public class cursRepository implements crudRepository<Curs> {

	List<Curs> cursos = new ArrayList<Curs>();

	public List<Curs> findAll() {return cursos;}


		public cursRepository() {
//instancio dos cursos i els afegir� a la llista
			Curs accesADades = new Curs(1, "Modul 6", "Acces a dades",
					"https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m06_/web/fp_dam_m06_htmlindex/index.html");

			Curs programacioMultimedia = new Curs(2, "Modul 8", "Programacio Multimedia",
					"https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m08_/web/fp_dam_m08_htmlindex/index.html");

			cursos.add(accesADades);
			cursos.add(programacioMultimedia);

		}

}
