package com.project;

import javax.persistence.*;


@Entity
@Table(name="status")
public class Status {

    public Status() {
    }

    public Status(String statusName) {
        this.statusName = statusName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    Integer statusId;

    @Column(name = "statusName", nullable = false)
    String statusName;

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", statusName='" + statusName + '\'' +
                '}';
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
