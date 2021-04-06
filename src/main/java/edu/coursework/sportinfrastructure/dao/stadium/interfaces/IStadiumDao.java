package edu.coursework.sportinfrastructure.dao.stadium.interfaces;
/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.dao.stadium.impls.StadiumDaoImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 23:10
 *  * @Version StadiumDaoImpl.java : 1.0
 *
 */
import edu.coursework.sportinfrastructure.model.Stadium;

import java.util.List;

public interface IStadiumDao {

    Stadium getById(String id);
    Stadium create(Stadium stadium);
    Stadium update(Stadium stadium);
    Stadium delete(String id);
    Stadium save(Stadium stadium);
    List<Stadium> getAll();
}