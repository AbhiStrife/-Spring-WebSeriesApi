package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Series;

@Repository
public interface SeriesRepo extends JpaRepository<Series,Long> {
    
    @Query("SELECT s FROM Series s WHERE s.name =:d")
    public Series findByNameSeries(@Param("d") String name);
}
