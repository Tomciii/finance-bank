package net.froihofer.util.jboss.persistance.mapper;

import common.dto.SharesDTO;
import net.froihofer.util.jboss.persistance.entity.Shares;

public class SharesMapper {

    public SharesDTO toStockDTO(Shares shares) {
        if (shares == null) {
            return new SharesDTO();
        }

        SharesDTO dto = new SharesDTO();

        dto.setStockShares(shares.getStockShares());
        dto.setStockName(shares.getStockName());

        return dto;
    }
}
