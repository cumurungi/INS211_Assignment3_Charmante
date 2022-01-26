package com.example.Daviscollegeproj.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer stuId;
    @Column(nullable = false,unique = true, length = 100)
    String stuName;
    Integer stuAge;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "co_id")
    Courses course;
}
