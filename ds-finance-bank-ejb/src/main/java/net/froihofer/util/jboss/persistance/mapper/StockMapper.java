package net.froihofer.util.jboss.persistance.mapper;

import common.dto.ListStockDTO;
import common.dto.StockDTO;
import net.froihofer.util.jboss.soapclient.model.FindStockQuotesByCompanyNameResponse;

import java.util.ArrayList;
import java.util.List;

public class StockMapper {

    public ListStockDTO toStockDTOList(FindStockQuotesByCompanyNameResponse input) {

        if (input == null) {
            return new ListStockDTO();
        }

        List<StockDTO> stockDTOList = new ArrayList();

            for (var stock : input.getReturn()) {
                if (stock != null){
                    StockDTO stockDTO = new StockDTO(stock.getCompanyName(),
                            stock.getFloatShares(),
                            stock.getLastTradePrice().toString(),
                            stock.getLastTradeTime().toString(),
                            stock.getMarketCapitalization(),
                            stock.getStockExchange(),
                            stock.getSymbol());

                    stockDTOList.add(stockDTO);
                }
            }

        return new ListStockDTO(stockDTOList);
    }
}