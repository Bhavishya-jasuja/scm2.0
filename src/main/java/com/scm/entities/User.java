package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User 
{
    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(length = 65535)
    private String about;
    @Column(length = 65535)
    private String profilePic;
    private String phoneNumber;
    
    //information

    private boolean enabled= false;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;
    

    //SELF, Google, github, facebook, linkdin, twitter

    private Providers providers=Providers.SELF;
    private String providerUserId;


    // add more fields if needed; Cascade is to geeting updated data
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true  )
    private List<Contacts> contacts= new ArrayList<>();



}
