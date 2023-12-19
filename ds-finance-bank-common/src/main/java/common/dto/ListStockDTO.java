package common.dto;

import java.io.Serializable;
import java.util.List;

public class ListStockDTO implements Serializable {

    private List<StockDTO> list;

    public ListStockDTO() {

    }

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
