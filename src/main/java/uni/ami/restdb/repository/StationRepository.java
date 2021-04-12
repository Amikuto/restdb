package uni.ami.restdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uni.ami.restdb.model.Station;
import uni.ami.restdb.model.Train;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    Long findStationIdByNameEquals(String name);
    Station findStationByNameEquals(String name);
    Station findStationByNameAndRegionEquals(String name);

    List<Station> findAllByArrTrainIdEquals(Long arrTrain_id);
    List<Station> findAllByDepTrainIdEquals(Long depTrain_id);
    List<Station> findAllByDepTrainIdAndArrTrainIdEquals(Long arrTrain_id, Long depTrain_id);
    List<Station> findAllByCityIdEquals(Long city_id);

//    @Query("select s.city from Station s")
//    List<Object> getStationCities();
}
