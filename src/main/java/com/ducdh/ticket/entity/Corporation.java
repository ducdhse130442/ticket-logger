package com.ducdh.ticket.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "corporation")
@Data
public class Corporation {

    @Id()
    @GeneratedValue(generator = "taskId-generator")
    @GenericGenerator(name = "taskId-generator",
            strategy = "com.ducdh.ticket.entity.identifier.TaskIdGenerator")
    private String id;

    private String name;

    private String address;

    private String description;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
