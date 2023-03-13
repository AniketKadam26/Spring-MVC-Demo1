package org.jspiders.springmvcdemo1;
//model class
public class Project {
    private int projectId;
    private String projectName;
    private String technology;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Project() {

    }

    public Project(int projectId, String projectName, String technology) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.technology = technology;
    }
}
