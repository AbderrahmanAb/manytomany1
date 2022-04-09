package ma.emsi.manytomany1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 20)
    private String roleName;
    private String desc;
    @ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name = "USERS_ROLES")
    private List<User> users=new ArrayList<>();
}
