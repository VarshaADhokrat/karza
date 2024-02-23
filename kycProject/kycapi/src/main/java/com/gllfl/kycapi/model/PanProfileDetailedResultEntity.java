package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanProfileDetailedResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pan;
    private String name;

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private boolean aadhaarLinked;
    private boolean aadhaarMatch;
    private  Date dob;
    @Embedded
    private PanProfileDetailedAddress address;
    private  String mobileNo;
    private  String emailId;
    @OneToMany(fetch=FetchType.EAGER, mappedBy = "id", cascade=CascadeType.ALL)
    private List<PanProfileDetailedProfileMatch> profileMatch;

    private String status;
    private Date  issueDate;
    private boolean isSalaried;
    private boolean isDirector;
    private boolean isSoleProp;





}
