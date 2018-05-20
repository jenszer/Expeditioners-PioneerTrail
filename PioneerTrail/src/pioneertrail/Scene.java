package pioneertrail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Hector Mendoza
 */
public class Scene implements Serializable {
    
    private String name;
    private String description;
    private String sceneSymbol;
    private String obstacleType;
    private int mortalityRate;
    
    private ArrayList<Question> questions = new ArrayList<>();
    

    public Scene() {
    }    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSceneSymbol() {
        return sceneSymbol;
    }

    public void setSceneSymbol(String sceneSymbol) {
        this.sceneSymbol = sceneSymbol;
    }

    public String getObstacleType() {
        return obstacleType;
    }

    public void setObstacleType(String obstacleType) {
        this.obstacleType = obstacleType;
    }

    public int getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(int mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.sceneSymbol);
        hash = 31 * hash + Objects.hashCode(this.obstacleType);
        hash = 31 * hash + this.mortalityRate;
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", sceneSymbol=" + sceneSymbol + ", obstacleType=" + obstacleType + ", mortalityRate=" + mortalityRate + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.mortalityRate != other.mortalityRate) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.sceneSymbol, other.sceneSymbol)) {
            return false;
        }
        if (!Objects.equals(this.obstacleType, other.obstacleType)) {
            return false;
        }
        return true;
    }    
    
    
    
}
