package man.foodev.apitest.accounts;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDTO {
    private Integer id;

    private String password;

    private String nickname;

    private int point;

    private int postWriteNumber;
}
