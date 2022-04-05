package com.example.studentdatabase.webappcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_tbl")
public class Student {
@Id
public int roll_id;
@Column
public String name;
@Column
public int marks;

}
