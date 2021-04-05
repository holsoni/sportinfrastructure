package edu.coursework.sportinfrastructure.dao.stadium.impls;
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
import edu.coursework.sportinfrastructure.dao.stadium.interfaces.IStadiumDao;
import edu.coursework.sportinfrastructure.data.FakeData;
import edu.coursework.sportinfrastructure.model.Stadium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StadiumDaoImpl implements IStadiumDao {



    @Autowired
    FakeData fakeData;
    @Override
    public Stadium getById(String id) {
        return this.getAll().stream()
                .filter(stadium -> stadium.getId().equals(id))
                        .findFirst().orElse(null);
    }

    @Override
    public Stadium create(Stadium stadium) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId()))
                .max().orElse(0)+1);
        stadium.setId(id);
        this.getAll().add(stadium);
        return stadium;
    }

    @Override
    public Stadium update(Stadium stadium) {
        this.delete(stadium.getId());
        this.getAll().add(stadium);
        return stadium;
    }

    @Override
    public Stadium delete(String id) {
        Stadium stadium = this.getById(id);
        this.getAll().remove(stadium);
        return stadium;
    }

    @Override
    public List<Stadium> getAll() {
        return fakeData.getAll();
    }
}
