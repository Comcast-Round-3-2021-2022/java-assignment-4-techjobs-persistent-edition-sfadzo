package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy="employer")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required!")
    @Size(max = 80, message = "Location must not be longer than 80 characters!")
    private String location;


    public Employer() {}

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
