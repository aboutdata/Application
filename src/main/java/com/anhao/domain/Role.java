package com.anhao.domain;

public class Role extends ABaseEntity {

    private static final long serialVersionUID = -2611029643225710436L;

    private String name;
    private String value;
    private Boolean isSystem;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + this.getId() + "," + "name=" + name + ", value=" + value + ", modifyDate=" + this.getModifyDate() + ", description=" + description + '}';
    }
    
    
}
