/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.competition.ICompetitionImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:42
 *  * @Version ICompetitionImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.competition;

import edu.coursework.sportinfrastructure.model.Competition;
import edu.coursework.sportinfrastructure.model.CompetitionOrganizer;
import edu.coursework.sportinfrastructure.repository.competition.CompetitionRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CompetitionServiceImpl implements ICompetition {

    @Autowired
    CompetitionRepository repository;
    @Override
    public Competition getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Competition create(Competition competition) {
        competition.setCreatedAt(new Date());
        return repository.save(competition);
    }

    @Override
    public Competition update(Competition competition) {
        competition.setModifiedAt(new Date());
        return repository.save(competition);
    }

    @Override
    public Competition delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Competition> getAll() {
        return repository.findAll();
    }
}
