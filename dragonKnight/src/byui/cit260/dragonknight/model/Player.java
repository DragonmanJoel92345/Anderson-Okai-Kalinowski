package byui.cit260.dragonknight.model;

import byui.cit260.dragonknight.view.ErrorView;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DragonmanJoel
 */
public class Player implements Serializable {

    public static final int MAX_DAMAGE = 9;
    
    // class instance variables
    private String name;
    List<Item> inventory;
     List<Hero> team;
    private String classSelection;
    private String attributes;
    private String race;
    private double hitPoint;
    
    
    private Game[] game;
    private Location location;

    public Player() {
        inventory = new ArrayList<>();
        team = new ArrayList<>();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSelection() {
        return classSelection;
    }

    public void setClassSelection(String classSelection) {
        this.classSelection = classSelection;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public double getHitPoint() {
         return hitPoint;
     }
    
    public void setHitPoint (double hitPoint) {
        this.hitPoint = hitPoint;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.classSelection);
        hash = 41 * hash + Objects.hashCode(this.attributes);
        hash = 41 * hash + Objects.hashCode(this.race);
        return hash;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.classSelection, other.classSelection)) {
            return false;
        }
        if (!Objects.equals(this.attributes, other.attributes)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", classSelection=" + classSelection + ", attributes=" + attributes + ", race=" + race + '}';
    }
    
    public void savePlayersNames() throws IOException {
        
        FileWriter outFile = null;
      
        String fileLocation ="players.txt";
        
        try {
            outFile = new FileWriter(fileLocation);
            
            outFile.write("Hadrian\n");
            outFile.write("Tybalt\n");
            outFile.write("Tyrionn\n");
            outFile.write("Adelaide\n");
            outFile.write("Fendrel\n");
            
            outFile.flush();
            
        } catch (IOException ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
        }finally{
            if (outFile != null) {
                outFile.close();
            }
            
        }
    }

}

