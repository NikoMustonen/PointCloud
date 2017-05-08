package fi.tamk.hyperflightsimulatorultra3d.pointcloud;

import javax.persistence.*;

@Entity
public class HighScore {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false, insertable = false)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    private Integer points;
    
    public HighScore(){}
    
    public HighScore(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
