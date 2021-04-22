package edu.coursework.sportinfrastructure.data;
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
import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.model.Stadium;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
@Repository
public class FakeData {
    private List<Coach> coaches = new ArrayList<>(
            Arrays.asList(
                    new Coach(UUID.randomUUID(),"Куриляк С.В.", 50),
                    new Coach(UUID.randomUUID(),"Кури О.В.", 27),
                    new Coach(UUID.randomUUID(),"Уритнок Ш.А.", 30)));

    public List<Coach> getCoaches() {
        return coaches;
    }
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    private List<Stadium> stadiums = new ArrayList<>(
            Arrays.asList(
                    new Stadium("1", "Стадіон Динамо", "вул. Бортна 6", 4500, 6, 400, "резина"),
                    new Stadium("2", "Стадіон Юність", "вул. Едельвейс 46", 500, 2, 200, "бетон"),
                    new Stadium("3", "Стадіон Чорноморець", "вул. Валова 16", 3800, 5, 3700, "поліуретан"),
                    new Stadium("4", "Стадіон Кап", "вул. Карпатська 78", 10500, 8, 400, "поліуретан"),
                    new Stadium("5", "Стадіон Немо", "вул. Жаби 43", 7600, 6, 400, "резина")));

    public List<Stadium> getStadiums() {
        return stadiums;
    }

    public void setStadiums(List<Stadium> stadiums) {
        this.stadiums = stadiums;
    }
}
