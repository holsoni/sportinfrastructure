package edu.coursework.sportinfrastructure.service.stadium.impls;

import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.model.Training;
import edu.coursework.sportinfrastructure.repository.stadium.StadiumRepository;
import edu.coursework.sportinfrastructure.service.stadium.interfaces.IStadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Component

@RequiredArgsConstructor
@Service
public class StadiumServiceImpl implements IStadiumService {


    @Autowired
    StadiumRepository repository;

    @Override
    public Stadium getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Stadium create(Stadium stadium) {
        stadium.setCreatedAt(new Date());
        return repository.save(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        String id = stadium.getId();
        Stadium courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        stadium.setModifiedAt(new Date());
        stadium.setCreatedAt(createdAt);
        repository.save(stadium);
        return stadium;
    }

    @Override
    public Stadium delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Stadium> getAll() {
        return repository.findAll();

    }
    public Page<Stadium> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.repository.findAll(pageable);
    }
    private final MongoTemplate mongoTemplate;

    public Object getStatisticsOfStadiums() {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.project("capacity","amountOfTracks", "length"),
                Aggregation.group().min("length").as("minLength").max("amountOfTracks").as("maxTracks").avg("capacity").as("capacity"));

        return mongoTemplate.aggregate(aggregation, "stadium", Object.class).getMappedResults();
    }
}
