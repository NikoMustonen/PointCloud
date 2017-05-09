package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/highscores")
public class HighScoreController {

    @Autowired
    HighScoreRepository hr;
    
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<HighScore> getHighScore() {
        
        return hr.findTop100ByOrderByPointsDesc();
    }
    
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public HighScore addHighScore(@RequestBody HighScore hs) {
        
        return hr.save(hs);
    }
}
