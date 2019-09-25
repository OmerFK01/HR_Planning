


package hr_planning;

/**
 *
 * @author Omer Khan
 */
public class Assignment {

    private String projectName;
    private double teamStrength;
    private double costAllocation;
    private double Hours;

    public Assignment(String projectName, double teamStrength, double costAllocation, double Hours) {
        this.projectName = projectName;
        this.teamStrength = teamStrength;
        this.costAllocation = costAllocation;
        this.Hours = Hours;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getTeamStrength() {
        return teamStrength;
    }

    public void setTeamStrength(double teamStrength) {
        this.teamStrength = teamStrength;
    }

    public double getCostAllocation() {
        return costAllocation;
    }

    public void setCostAllocation(double costAllocation) {
        this.costAllocation = costAllocation;
    }

    public double getHours() {
        return Hours;
    }

    public void setHours(double Hours) {
        this.Hours = Hours;
    }
   
    
    
}
