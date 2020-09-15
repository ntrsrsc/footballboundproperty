/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballboundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Reo
 */
public class MyPropertyBean implements Serializable {
    
    public static final String FootballScores_PROPERTY = "FootballScores";
    
    private String FootballScores;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getFootballScores() {
        return FootballScores;
    }
    
    public void setFootballScores(String FootballScores) {
        String oldValue = this.FootballScores;
        this.FootballScores = FootballScores;
        propertySupport.firePropertyChange(FootballScores_PROPERTY, oldValue, FootballScores);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
