package user;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
@Getter
@ToString (exclude = {"id"})
public class User {
    private Long id;
//    private Long addressId;
    private String username;
    private String password;
    private String name;
    private String phone;


}
