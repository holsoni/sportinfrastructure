/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.training.ITrainingServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:28
 *  * @Version ITrainingServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.training;

import edu.coursework.sportinfrastructure.model.Training;
import edu.coursework.sportinfrastructure.repository.Training.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class TrainingServiceImpl implements ITrainingService {

    @Autowired
    TrainingRepository repository;
    @Override
    public Training getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Training create(Training training) {
        training.setCreatedAt(new Date());
        return repository.save(training);
    }

    @Override
    public Training update(Training training) {
        training.setModifiedAt(new Date());
        return repository.save(training);
    }

    @Override
    public Training delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Training> getAll() {
        return repository.findAll();
    }
}
