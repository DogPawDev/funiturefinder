package man.foodev.apitest.accounts;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(of ="id")
public class Account {
    @Id @GeneratedValue
    private Integer id;

    private String password;

    private String nickname;

    private int point;

    private int postWriteNumber;



}
