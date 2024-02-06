package com.feedback.entity;
import java.time.LocalDateTime;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "feedback_master_table")
@ToString


@AllArgsConstructor
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // used to auto generate the primary id key. 
	@Column(name="ticket_id")
	@JsonProperty("ticket_id")
	private Integer ticketId;
	
	@Column(name="assigned_manager_id")
	@JsonProperty("assigned_manager_id")
	private Integer assignedManagerId;
	
	@Column(name="creator_id")
	@JsonProperty("creator_id")
	private Integer creatorId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@Column(name="created_on")
	@JsonProperty("created_on")
	private LocalDateTime createdOn;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@Column(name="updated_on")
	@JsonProperty("updated_on")
	private LocalDateTime updateOn;
	
	@Column(name="status")
	@JsonProperty("status")
	private String status;
	
	@Column(name="ticket_details")
	@JsonProperty("ticket_details")
	private String ticketDetails;
	
	@Column(name="employee_id")
	@JsonProperty("employee_id")
	private Integer employeeId;
}
	