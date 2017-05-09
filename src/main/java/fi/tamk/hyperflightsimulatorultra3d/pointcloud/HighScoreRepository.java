package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import org.springframework.data.repository.CrudRepository;

/**
 * Interface for database fetching.
 *
 * @author Niko Mustonen mustonen.niko@gmail.com
 * @version %I%, %G%
 * @since 1.7
 */
public interface HighScoreRepository extends CrudRepository<HighScore, Long>{
    
    public Iterable<HighScore> findTop100ByOrderByPointsDesc();
}
