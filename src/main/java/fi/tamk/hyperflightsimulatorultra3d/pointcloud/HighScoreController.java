package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class handling Http requests.
 *
 * @author Niko Mustonen mustonen.niko@gmail.com
 * @version %I%, %G%
 * @since 1.7
 */
@RestController(value = "/highscores")
public class HighScoreController {

    @Autowired
    HighScoreRepository hr;
    
    /**
     * Fetches 10 best players from the database in order.
     * 
     * @return Highscores in json array.
     */
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<HighScore> getHighScore() {
        
        return hr.findTop100ByOrderByPointsDesc();
    }
    
    /**
     * Adds new high score to database.
     * 
     * @param hs Highscore in json format.
     * @return Created highscore.
     */
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public HighScore addHighScore(@RequestBody HighScore hs) {
        
        return hr.save(hs);
    }
}
