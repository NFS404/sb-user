package io.github.sbcloudrace.sbuser.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SBUSER")
public class SbUser {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMAIL", length = 250)
    private String email;

    @Column(name = "PASSWORD", length = 50)
    private String password;

    public Long getUserId(){
        return id;
    }
}
