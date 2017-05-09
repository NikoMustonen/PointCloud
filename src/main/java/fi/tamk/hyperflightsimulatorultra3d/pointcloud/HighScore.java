package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import javax.persistence.*;

/**
 * Entity class for high score entities.
 *
 * @author Niko Mustonen mustonen.niko@gmail.com
 * @version %I%, %G%
 * @since 1.7
 */
@Entity
public class HighScore {
    
    /**
     * Stores high score id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false, insertable = false)
    private Long id;
    
    /**
     * Stores high score owners name.
     */
    @Column(name = "name")
    private String name;
    
    /**
     * Stores points.
     */
    private Integer points;
    
    /**
     * Generates default high score element.
     */
    public HighScore(){}
    
    /**
     * Generates high score with given id.
     * 
     * @param id Id.
     */
    public HighScore(Long id){
        this.id = id;
    }

    /**
     * Returns id.
     * 
     * @return Id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     * 
     * @param id Id. 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns name.
     * 
     * @return Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * 
     * @param name Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns points.
     * 
     * @return Points.
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets points
     * 
     * @param points New points. 
     */
    public void setPoints(Integer points) {
        this.points = points;
    }
}
