package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import org.springframework.data.repository.CrudRepository;

public interface HighScoreRepository extends CrudRepository<HighScore, Long>{
    
    public Iterable<HighScore> findTop100ByOrderByPointsDesc();
}
