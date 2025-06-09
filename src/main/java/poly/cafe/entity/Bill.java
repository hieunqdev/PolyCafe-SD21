package poly.cafe.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Bill {
    private Long id;
    private String username;
    private Integer cardId;
    private Date checkin;
    private Date checkout;
    private int status;
}
