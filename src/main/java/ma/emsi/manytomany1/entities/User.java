package ma.emsi.manytomany1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id

    private String userId;
    @Column(unique = true,length = 20,name = "USER_NAME")
    private String username;
    private String password;
    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();
}
