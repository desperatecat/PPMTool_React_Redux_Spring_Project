package com.lucasxu.ppmtool.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Summary is required")
    private String summary;

//    @NotBlank(message = "Project identifier is required")
//    @Size(min=5, max=8, message = "Please user 5 to 8 characters")
//    @Column(updatable = false, unique = true)
//    private String projectIdentifier;

    private String acceptanceCriteria;

    private String status;

//    @JsonFormat(pattern = "yyyy-mm-dd")
//    private Date start_date;
//    @JsonFormat(pattern = "yyyy-mm-dd")
//    private Date end_date;
//
//    @JsonFormat(pattern = "yyyy-mm-dd")
//    private Date created_At;
//    @JsonFormat(pattern = "yyyy-mm-dd")
//    private Date updated_At;

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
