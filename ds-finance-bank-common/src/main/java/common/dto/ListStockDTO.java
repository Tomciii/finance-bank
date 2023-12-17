package common.dto;

import java.util.List;

public class ListStockDTO {

    private List<StockDTO> list;

    public ListStockDTO(List<StockDTO> list) {
        this.list = list;
    }

    public List<StockDTO> getList() {
        return list;
    }

    public void setList(List<StockDTO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListStockDTO{" +
                "list=" + list +
                '}';
    }
}
