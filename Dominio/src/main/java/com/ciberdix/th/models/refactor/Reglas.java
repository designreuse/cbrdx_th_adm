package com.ciberdix.th.models.refactor;

/**
 * Created by robertochajin on 24/04/17.
 */
public class Reglas {
    private String name;
    private String description;
    private String target;
    private String condition;

    public Reglas() {
    }

    public Reglas(String name, String description, String target, String condition) {
        this.name = name;
        this.description = description;
        this.target = target;
        this.condition = condition;
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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
