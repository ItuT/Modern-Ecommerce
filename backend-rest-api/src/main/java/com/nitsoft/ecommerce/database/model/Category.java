package com.nitsoft.ecommerce.database.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"),
    @NamedQuery(name = "Category.findByCategoryId", query = "SELECT c FROM Category c WHERE c.categoryId = :categoryId"),
    @NamedQuery(name = "Category.findByCompanyId", query = "SELECT c FROM Category c WHERE c.companyId = :companyId"),
    @NamedQuery(name = "Category.findByParentId", query = "SELECT c FROM Category c WHERE c.parentId = :parentId"),
    @NamedQuery(name = "Category.findByName", query = "SELECT c FROM Category c WHERE c.name = :name"),
    @NamedQuery(name = "Category.findByStatus", query = "SELECT c FROM Category c WHERE c.status = :status"),
    @NamedQuery(name = "Category.findByDescription", query = "SELECT c FROM Category c WHERE c.description = :description")})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;

    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    @Column(name = "parent_id")
    private int parentId;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "status")
    private int status;

    @Column(name = "position")
    private int position;

    @Column(name = "description")
    private String description;

    public Category() {
    }

    public Category(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Category(Integer categoryId, int companyId, int parentId, String name, int status, int position, String description) {
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.position = position;
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nitsoft.ecommerce.model.Category[ categoryId=" + categoryId + " ]";
    }

}
