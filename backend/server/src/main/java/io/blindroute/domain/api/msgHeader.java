package io.blindroute.domain.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class msgHeader {
    private String headerMsg;
    private int headerCd;
    private int itemCount;

}
