package org.cetys.solid.correct.dip;

import java.util.List;

/**
 * Created by edwin on Apr, 2020
 */
public class Project {
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(d->d.develop());
    }

}
